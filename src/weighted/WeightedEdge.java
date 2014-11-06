package weighted;

import base.BaseEdge;
import base.BaseVertex;

/**
 * Weighted edge, inheriting the base edge but adding an extra attribute to use
 * when weighted graphs are needed.
 * 
 * The programmer can use this class for his convenience.
 * 
 * @author group 5.2, Programming Projects, Barcelona School of Informatics,
 *         October 2014.
 *
 */
public class WeightedEdge extends BaseEdge {

	protected int weight;

	/**
	 * Construct a weighted edge from a source vertex to a destination vertex.
	 * 
	 * @param source
	 *            Vertex instance of the source vertex
	 * @param destination
	 *            Vertex instance of the destination vertex
	 * @param weight
	 *            int with the edge's weight
	 */
	public WeightedEdge(BaseVertex source, BaseVertex destination, int weight) {
		super(source, destination);
		this.weight = weight;
	}

	/**
	 * Get the edge's weight
	 * 
	 * @return int with the edge's weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Set the edge's weight
	 * 
	 * @param weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return source + " --" + weight + "--> " + destination;
	}

}