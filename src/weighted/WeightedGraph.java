package weighted;

import base.BaseEdge;
import base.BaseGraph;
import base.BaseVertex;

/**
 * Weighted graph, inheriting the base graph but overriding some methods to
 * handle weighted edges.
 * 
 * The programmer might use this class for his convenience.
 * 
 * @author group 5.2, Programming Projects, Barcelona School of Informatics,
 *         October 2014.
 *
 */
public class WeightedGraph extends BaseGraph {

	//@Override
	protected void addEdgeToList(BaseEdge edge) {
		if (edge instanceof WeightedEdge)
			super.addEdgeToList(edge);
		else {
			System.out.println("The edge '" + edge
					+ "' does not have a specified weight.");
			System.out.println("Please use either: ");
			System.out
					.println("\t'addEdge(int sourceId, int destinationId, int weight)'");
			System.out.println("\tor");
			System.out
					.println("\t'addEdge(BaseVertex source, BaseVertex destination, int weight)'");
		}

	}

	/**
	 * Adds a weighted edge from source to destination. Does nothing if edge is
	 * already in the list, or the edge's source or destination vertexes don't
	 * exist.
	 * 
	 * @param source
	 * @param destination
	 * @param weight
	 */
	public void addEdge(int sourceId, int destinationId, int weight) {
		BaseVertex source = getVertex(sourceId);
		BaseVertex destination = getVertex(destinationId);
		WeightedEdge edge = new WeightedEdge(source, destination, weight);
		super.addEdgeToList(edge);
	}

	/**
	 * Adds a weighted edge from source to destination. Does nothing if edge is
	 * already in the list, or the edge's source or destination vertexes don't
	 * exist.
	 * 
	 * @param source
	 * @param destination
	 * @param weight
	 */
	/*public void addEdge(BaseVertex source, BaseVertex destination, int weight) {
		addEdge(source.getId(), destination.getId(), weight);
	}*/

}