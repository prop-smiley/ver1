package domini;

//import graph.*;


//import graph.Edge;


public class Edge {

	private final Vertex source;
	private final Vertex destination;
	private int weight;

	/**
	 * Construct a base edge from a source vertex to a destination vertex.
	 * 
	 * @param source
	 *            Vertex instance of the source vertex
	 * @param destination
	 *            Vertex instance of the destination vertex
	 */
	public Edge(Vertex source, Vertex destination) {
		this.source = source;
		this.destination = destination;
	}

	/**
	 * Construct a base edge from a source vertex to a destination vertex with
	 * its correspondant weight.
	 * 
	 * @param source
	 *            Vertex instance of the source vertex
	 * @param destination
	 *            Vertex instance of the destination vertex
	 * @param weight
	 *            int with the edge's weight
	 */
	public Edge(Vertex source, Vertex destination, int weight) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	/**
	 * Get the destination vertex
	 * 
	 * @return Vertex with the destination vertex
	 */
	public Vertex getDestinationVertex() {
		return destination;
	}

	/**
	 * Get the source vertex
	 * 
	 * @return Vertex with the source vertex
	 */
	public Vertex getSourceVertex() {
		return source;
	}

	/**
	 * Get the dege's weight
	 * 
	 * @return int with the edge's weight
	 */
	public int getWeight() {
		return weight;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Edge) {
			Edge otherEdge = (Edge) object;
			return (source.equals(otherEdge.getSourceVertex()) && destination
					.equals(otherEdge.getDestinationVertex()));
		} else
			return false;
	}

	@Override
	public String toString() {
		return source + " - " + destination;
	}

}