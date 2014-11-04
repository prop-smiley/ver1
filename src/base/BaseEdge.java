package base;

/**
 * Base class for the graph's edge. 
 * 
 * The programmer can use this class for his convenience.
 * 
 * @author group 5.2, Programming Projects, Barcelona School of Informatics,
 *         October 2014.
 *
 */
public class BaseEdge {

	protected final BaseVertex source;
	protected final BaseVertex destination;

	/**
	 * Construct a base edge from a source vertex to a destination vertex.
	 * 
	 * @param source
	 *            Vertex instance of the source vertex
	 * @param destination
	 *            Vertex instance of the destination vertex
	 */
	public BaseEdge(BaseVertex source, BaseVertex destination) {
		this.source = source;
		this.destination = destination;
	}

	/**
	 * Get the destination vertex
	 * 
	 * @return Vertex with the destination vertex
	 */
	public BaseVertex getDestinationVertex() {
		return destination;
	}
	
	/**
	 * Get the destination vertex id
	 * 
	 * @return
	 */
	public int getDestinationVertexId() {
		return destination.getId();
	}

	/**
	 * Get the source vertex
	 * 
	 * @return Vertex with the source vertex
	 */
	public BaseVertex getSourceVertex() {
		return source;
	}
	
	/**
	 * Get the source vertex id
	 * 
	 * @return
	 */
	public int getSourceVertexId() {
		return source.getId();
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof BaseEdge) {
			BaseEdge otherEdge = (BaseEdge) object;
			return (source.equals(otherEdge.getSourceVertex()) && destination
					.equals(otherEdge.getDestinationVertex()));
		} else
			return false;
	}

	@Override
	public String toString() {
		return source + " -> " + destination;
	}

}