package base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

/**
 * Base class to represent a graph.
 * 
 * The programmer might use this class for his convenience.
 * 
 * @author group 5.2, Programming Projects, Barcelona School of Informatics,
 *         October 2014.
 * 
 */
public class BaseGraph {

	protected List<BaseEdge> edgeList;
	protected Hashtable<Integer, BaseVertex> vertexTable;

	/**
	 * Constructor to start an empty graph
	 */
	public BaseGraph() {
		this.edgeList = new ArrayList<BaseEdge>();
		this.vertexTable = new Hashtable<Integer, BaseVertex>();
	}

	/**
	 * Constructor to start a graph with some edges and vertexes defined
	 * 
	 * @param edgeList
	 *            list of edges
	 * @param vertexList
	 *            table of vertexes, indexed by their id's
	 */
	public BaseGraph(List<BaseEdge> edgeList,
			Hashtable<Integer, BaseVertex> vertexList) {
		this.edgeList = edgeList;
		this.vertexTable = vertexList;
	}

	/**
	 * Get the list of edges
	 * 
	 * @return List with the graph's edges.
	 */
	public List<BaseEdge> getEdgeList() {
		return edgeList;
	}

	/**
	 * Get the table of vertexes
	 * 
	 * @return Hashtable with the graph's vertexes, indexed by id.
	 */
	public Hashtable<Integer, BaseVertex> getVertexList() {
		return vertexTable;
	}

	/**
	 * Find out if Vertex already exists
	 * 
	 * @param id
	 * @return boolean
	 */
	public boolean hasVertex(int id) {
		if (vertexTable.containsKey(id))
			return true;
		else
			return false;
	}

	/**
	 * Find out if Vertex already exists
	 * 
	 * @param vertex
	 * @return boolean
	 */
	public boolean hasVertex(BaseVertex vertex) {
		int id = vertex.getId();
		return hasVertex(id);
	}

	/**
	 * Get the vertex with the correspondent id (if it exists)
	 * 
	 * @param id
	 * @return vertex with the correspondent id, or null if there is no such
	 *         vertex
	 */
	public BaseVertex getVertex(int id) {

		if (hasVertex(id))
			return vertexTable.get(id);
		else {
			System.out.println("There is no vertex with id=" + id
					+ " in this graph.");
			return null;
		}
	}

	/**
	 * Adds a predefined vertex to the vertexList. Does nothing if the vertex
	 * already exists
	 * 
	 * @param vertex
	 */
	protected void addVertexToList(BaseVertex vertex) {
		if (hasVertex(vertex))
			System.out.println("A vertex with id=" + vertex.getId()
					+ " already exists. Please choose a different id.");
		else
			vertexTable.put(vertex.getId(), vertex);
	}

	/**
	 * Creates and adds a new vertex to the list. Does nothing if the vertex
	 * already exists.
	 * 
	 * @param id
	 */
	public void addVertex(int id) {
		BaseVertex vertex = new BaseVertex(id);
		addVertexToList(vertex);
	}

	/**
	 * Removes a vertex with the given id if it exists. Does nothing otherwise.
	 * 
	 * @param id
	 */
	public void removeVertex(int id) {
		if (hasVertex(id))
			vertexTable.remove(id);
	}

	/**
	 * Removes the vertex 'vertex' if it exists. Does nothing otherwise.
	 * 
	 * @param vertex
	 */
	public void removeVertex(BaseVertex vertex) {
		removeVertex(vertex.getId());
	}

	/**
	 * True if specified edge is in the list, false otherwise.
	 * 
	 * @param sourceId
	 * @param destinationId
	 * @return
	 */
	public boolean hasEdge(int sourceId, int destinationId) {
		for (BaseEdge edge : edgeList) {
			if (sourceId == edge.getSourceVertex().getId()
					&& destinationId == edge.getDestinationVertex().getId())
				return true;
		}
		return false;
	}

	/**
	 * True if specified edge is in the list, false otherwise.
	 * 
	 * @param source
	 * @param destination
	 * @return
	 */
	public boolean hasEdge(BaseVertex source, BaseVertex destination) {
		int sourceId = source.getId();
		int destinationId = destination.getId();
		return hasEdge(sourceId, destinationId);
	}

	/**
	 * Get specified edge if exists.
	 * 
	 * @param sourceId
	 * @param destinationId
	 * @return edge if exists, null otherwise
	 */
	public BaseEdge getEdge(int sourceId, int destinationId) {
		for (BaseEdge edge : edgeList) {
			if (sourceId == edge.getSourceVertex().getId()
					&& destinationId == edge.getDestinationVertex().getId())
				return edge;
		}
		System.out.println("There is no edge from id=" + sourceId + " to id="
				+ destinationId
				+ ". Please choose a different source/destination");
		return null;
	}

	/**
	 * Get specified edge if exists.
	 * 
	 * @param source
	 * @param destination
	 * @return edge if exists, null otherwise
	 */
	public BaseEdge getEdge(BaseVertex source, BaseVertex destination) {
		int sourceId = source.getId();
		int destinationId = destination.getId();
		return getEdge(sourceId, destinationId);
	}

	/**
	 * Adds edge to the list, does nothing if edge is already in the list, or
	 * the edge's source or destination vertexes don't exist.
	 * 
	 * @param edge
	 */
	protected void addEdgeToList(BaseEdge edge) {
		if (edgeList.contains(edge))
			System.out.println("An edge from id="
					+ edge.getSourceVertex().getId() + " to id="
					+ edge.getDestinationVertex().getId() + " already exists."
					+ "Please choose a different source/destination)");
		else {
			if (getVertex(edge.getSourceVertexId()) instanceof BaseVertex
					&& getVertex(edge.getDestinationVertexId()) instanceof BaseVertex)
				edgeList.add(edge);
		}
	}

	/**
	 * Creates a new edge and adds it to the list, does nothing if edge is
	 * already in the list, or the edge's source or destination vertexes don't
	 * exist.
	 * 
	 * @param sourceId
	 * @param destinationId
	 */
	public void addEdge(int sourceId, int destinationId) {
		BaseVertex source = getVertex(sourceId);
		BaseVertex destination = getVertex(destinationId);
		BaseEdge edge = new BaseEdge(source, destination);
		addEdgeToList(edge);
	}

	/**
	 * Creates a new edge and adds it to the list, does nothing if edge is
	 * already in the list, or the edge's source or destination vertexes don't
	 * exist.
	 * 
	 * @param source
	 * @param destination
	 */
	public void addEdge(BaseVertex source, BaseVertex destination) {
		int sourceId = source.getId();
		int destinationId = destination.getId();
		addEdge(sourceId, destinationId);
	}

	/**
	 * Deletes an edge from the list if exists, does nothing otherwise.
	 * 
	 * @param sourceId
	 * @param destinationId
	 */
	public void removeEdge(int sourceId, int destinationId) {
		BaseEdge edge = getEdge(sourceId, destinationId);
		if (edge instanceof BaseEdge)
			edgeList.remove(edge);
	}

	/**
	 * Deletes an edge from the list if exists, does nothing otherwise.
	 * 
	 * @param sourceId
	 * @param destinationId
	 */
	public void removeEdge(BaseVertex source, BaseVertex destination) {
		int sourceId = source.getId();
		int destinationId = destination.getId();
		removeEdge(sourceId, destinationId);
	}

	/**
	 * Get number of total vertexes in the graph
	 * 
	 * @return
	 */
	public int getNumberOfVertexes() {
		return vertexTable.size();
	}

	/**
	 * Get number of total edges in the graph
	 * 
	 * @return
	 */
	public int getNumberOfEdges() {
		return edgeList.size();
	}

	/**
	 * Get a list of neighbors vertex's with an edge aiming to the vertex with
	 * the given id.
	 * 
	 * @param id
	 * @return list with the in vertexes, null if there is no vertex with the
	 *         given id.
	 */
	public List<BaseVertex> getInVertexes(int id) {
		BaseVertex vertex = getVertex(id);
		if (vertex instanceof BaseVertex) {
			List<BaseVertex> inVertexes = new ArrayList<BaseVertex>();
			for (BaseEdge edge : edgeList) {
				if (vertex.equals(edge.getDestinationVertex()))
					inVertexes.add(edge.getSourceVertex());
			}
			return inVertexes;
		} else
			return null;
	}

	/**
	 * Get a list of neighbors vertex's with an edge aiming to the given vertex.
	 * 
	 * @param vertex
	 * @return list with the in vertexes, null if there is no such vertex.
	 */
	public List<BaseVertex> getInVertexes(BaseVertex vertex) {
		return getInVertexes(vertex.getId());
	}

	/**
	 * Get a list of neighbors vertex's with an edge coming from the vertex with
	 * the given id.
	 * 
	 * @param id
	 * @return list with the out vertexes, null if there is no vertex with the
	 *         given id.
	 */
	public List<BaseVertex> getOutVertexes(int id) {
		BaseVertex vertex = getVertex(id);
		if (vertex instanceof BaseVertex) {
			List<BaseVertex> outVertexes = new ArrayList<BaseVertex>();
			for (BaseEdge edge : edgeList) {
				if (vertex.equals(edge.getSourceVertex()))
					outVertexes.add(edge.getDestinationVertex());
			}
			return outVertexes;
		} else
			return null;
	}

	/**
	 * Get a list of neighbors vertex's with an edge coming from the given
	 * vertex.
	 * 
	 * @param id
	 * @return list with the out vertexes, null if there is no such vertex.
	 */
	public List<BaseVertex> getOutVertexes(BaseVertex vertex) {
		return getOutVertexes(vertex.getId());
	}

	/**
	 * Get a list of neighbors vertex's (both in and out).
	 * 
	 * @param id
	 * @return list with in an out vertexes, null if there is no vertex with the
	 *         given id.
	 */
	public List<BaseVertex> getInOutVertexes(int id) {
		List<BaseVertex> inVertexes = getInVertexes(id);
		List<BaseVertex> outVertexes = getOutVertexes(id);
		if (inVertexes instanceof List && outVertexes instanceof List) {
			List<BaseVertex> inOutVertexes = new ArrayList<BaseVertex>();
			inOutVertexes.addAll(inVertexes);
			inOutVertexes.addAll(outVertexes);
			return inOutVertexes;
		} else
			return null;
	}

	/**
	 * Get a list of neighbors vertex's (both in and out).
	 * 
	 * @param id
	 * @return list with in an out vertexes, null if there is no such vertex.
	 */
	public List<BaseVertex> getInOutVertexes(BaseVertex vertex) {
		return getInOutVertexes(vertex.getId());
	}

	/**
	 * Get a list of entering edges of the vertex with the given id (if there is
	 * such vertex)
	 * 
	 * @param id
	 * @return list with the in edges, null if there is no vertex with the given
	 *         id.
	 */
	public List<BaseEdge> getInEdges(int id) {
		BaseVertex vertex = getVertex(id);
		if (vertex instanceof BaseVertex) {
			List<BaseEdge> inEdges = new ArrayList<BaseEdge>();
			for (BaseEdge edge : edgeList) {
				if (vertex.equals(edge.getDestinationVertex()))
					inEdges.add(edge);
			}
			return inEdges;
		} else
			return null;
	}

	/**
	 * Get a list of entering edges of the given vertex (if there is such
	 * vertex)
	 * 
	 * @param vertex
	 * @return list with the in edges, null if there is no vertex with the given
	 *         id.
	 */
	public List<BaseEdge> getInEdges(BaseVertex vertex) {
		return getInEdges(vertex.getId());
	}

	/**
	 * Get a list of exiting edges of a the vertex with the given id (if there
	 * is such vertex)
	 * 
	 * @param id
	 * @return list with the out edges, null if there is no such vertex.
	 */
	public List<BaseEdge> getOutEdges(int id) {
		BaseVertex vertex = getVertex(id);
		if (vertex instanceof BaseVertex) {
			List<BaseEdge> outEdges = new ArrayList<BaseEdge>();
			for (BaseEdge edge : edgeList) {
				if (vertex.equals(edge.getSourceVertex()))
					outEdges.add(edge);
			}
			return outEdges;
		} else
			return null;
	}

	/**
	 * Get a list of exiting edges of a the given vertex (if there is such
	 * vertex)
	 * 
	 * @param vertex
	 * @return list with the vertex's out edges, null if there is no such
	 *         vertex.
	 */
	public List<BaseEdge> getOutEdges(BaseVertex vertex) {
		List<BaseEdge> outEdges = new ArrayList<BaseEdge>();
		for (BaseEdge edge : edgeList) {
			if (vertex.equals(edge.getSourceVertex()))
				outEdges.add(edge);
		}
		return outEdges;
	}

	/**
	 * Get a list of all the edges (in and out) from the vertex with the given
	 * id (if there is such vertex)
	 * 
	 * @param id
	 * @return list with in an out edges, null if there is no such vertex.
	 */
	public List<BaseEdge> getInOutEdges(int id) {
		List<BaseEdge> inEdges = getInEdges(id);
		List<BaseEdge> outEdges = getOutEdges(id);
		if (inEdges instanceof List && outEdges instanceof List) {
			List<BaseEdge> inOutEdges = new ArrayList<BaseEdge>();
			inOutEdges.addAll(inEdges);
			inOutEdges.addAll(outEdges);
			return inOutEdges;
		} else
			return null;
	}

	/**
	 * Get a list of all the edges (in and out) from the given vertex (if there
	 * is such vertex)
	 * 
	 * @param vertex
	 * @return list with in an out edges, null if there is no such vertex.
	 */
	public List<BaseEdge> getInOutEdges(BaseVertex vertex) {
		return getInOutEdges(vertex.getId());
	}

	/**
	 * Returns the number of entering edges of the vertex with the given id (if
	 * there is such vertex)
	 * 
	 * @param id
	 * @return number of in edges, null if there is no such vertex
	 */
	public int numberOfInEdges(int id) {
		return getInEdges(id).size();
	}

	/**
	 * Returns the number of entering edges of the given vertex (if there is
	 * such vertex)
	 * 
	 * @param vertex
	 * @return number of in edges, null if there is no such vertex
	 */
	public int numberOfInEdges(BaseVertex vertex) {
		return numberOfInEdges(vertex.getId());
	}

	/**
	 * Returns the number of exiting edges of the vertex with the given id (if
	 * there is such vertex)
	 * 
	 * @param id
	 * @return number of out edges, null if there is no such vertex
	 */
	public int numberOfOutEdges(int id) {
		return getOutEdges(id).size();
	}

	/**
	 * Returns the number of exiting edges of the given vertex (if there is such
	 * vertex)
	 * 
	 * @param vertex
	 * @return number of out edges, null if there is no such vertex
	 */
	public int numberOfOutEdges(BaseVertex vertex) {
		int id = vertex.getId();
		return getOutEdges(id).size();
	}

	/**
	 * Returns the total number of total edges (in and out) of the vertex with
	 * the given id (if there is such vertex)
	 * 
	 * @param id
	 * @return number of edges, null if there is no such vertex
	 */
	public int numberOfInOutEdges(int id) {
		return (numberOfInEdges(id) + numberOfOutEdges(id));
	}

	/**
	 * Returns the total number of total edges (in and out) of the given vertex
	 * (if there is such vertex)
	 * 
	 * @param vertex
	 * @return number of edges, null if there is no such vertex
	 */
	public int numberOfInOutEdges(BaseVertex vertex) {
		return numberOfInOutEdges(vertex.getId());
	}

	@Override
	public String toString() {
		String output = "";

		output += "Vertexes:\n";
		Collection<BaseVertex> vertexIterator = vertexTable.values();
		for (BaseVertex vertexI : vertexIterator)
			output += vertexI.toString().concat("\n");

		output += "\nEdges:\n";
		for (BaseEdge edgeJ : edgeList)
			output += edgeJ.toString().concat("\n");

		return output;

	}

}