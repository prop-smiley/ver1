package domini;



//import graph.*;
import java.util.ArrayList;
import java.util.List;


public class Graph {

	private int idGenerator;

	private List<Edge> edgeList;
	private List<Vertex> vertexList;

	/**
	 * Constructor to start an empty graph
	 */
	public Graph() {
		idGenerator = 0;
	}

	/**
	 * Constructor to start a graph with some edges and vertexes defined
	 * 
	 * @param edgeList
	 *            list of edges
	 * @param vertexList
	 *            list of vertexes
	 */
	public Graph(List<Edge> edgeList, List<Vertex> vertexList) {
		this.edgeList = edgeList;
		this.vertexList = vertexList;
	}

	/**
	 * Get the list of edges
	 * 
	 * @return List<Edge> with the graph's list of edges
	 */
	public List<Edge> getEdgeList() {
		return edgeList;
	}

	/**
	 * Get the list of vertexes
	 * 
	 * @return List<Edge> with the graph's list of vertexes
	 */
	public List<Vertex> getVertexList() {
		return vertexList;
	}

	/**
	 * Get a list of the vertexes that have the name attribute set to 'name'. If
	 * there is only one vertex, it returns a List of one Vertex instance.
	 * 
	 * @param String
	 *            with the vertex name
	 * @return List<Vertex> with the list of vertexes with the name 'name'
	 */
	public List<Vertex> getMatchingVertexes(String name) {
		List<Vertex> matchingVertexes = new ArrayList<Vertex>();
		for (int i = 0; i < vertexList.size(); i++) {
			Vertex vertexI = vertexList.get(i);
			if (vertexI.getName().equals(name))
				matchingVertexes.add(vertexI);
		}
		return matchingVertexes;
	}

	/**
	 * Adds a vertex to the graph
	 * 
	 * @param String
	 *            vertex name
	 */
	public void addVertex(String name) {
		// This guarantees that the id is unique!
		idGenerator++;
		Vertex vertex = new Vertex(idGenerator, name);
		vertexList.add(vertex);
	}

	/**
	 * Removes the specified vertex from the graph
	 * 
	 * @param vertex
	 */
	public void removeVertex(Vertex vertex) {
		if (vertexList.contains(vertex))
			vertexList.remove(vertex);
	}

	/**
	 * Adds an edge from source to destination
	 * 
	 * @param source
	 * @param destination
	 */
	public void addEdge(Vertex source, Vertex destination) {
		Edge edge = new Edge(source, destination);
		if (!edgeList.contains(edge))
			edgeList.add(edge);
	}

	/**
	 * Removes the specified vertex from the graph
	 * 
	 * @param vertex
	 */
	public void removeEdge(Vertex source, Vertex destination) {
		Edge edge = new Edge(source, destination);
		if (edgeList.contains(edge))
			edgeList.remove(edge);
	}

	@Override
	public String toString() {
		String output = "";

		output += "Vertexes:\n";
		for (int i = 0; i < vertexList.size(); i++)
			output += vertexList.get(i).toString().concat("\n");

		output += "\n\nEdges:\n";
		for (int j = 0; j < edgeList.size(); j++)
			output += edgeList.get(j).toString().concat("\n");

		return output;

	}

}