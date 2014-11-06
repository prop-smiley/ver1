package domini;


<<<<<<< HEAD
import base.BaseEdge;
import base.BaseVertex;
import weighted.WeightedEdge;
=======
<<<<<<< HEAD


=======
>>>>>>> origin/dev
import weighted.WeightedGraph;
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
/**
 *
 * @autor joan
 */
public class Mapa extends WeightedGraph{
	
	int actualId = 0;
	
	protected void addEdgeToList(BaseEdge edge) {
		if (edge instanceof Tram){
			super.addEdgeToList(edge);
		}
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
		if ((getVertex(sourceId) instanceof Ciutat) && (getVertex(destinationId) instanceof Ciutat)){
			Ciutat source = (Ciutat)getVertex(sourceId);
			Ciutat destination = (Ciutat)getVertex(destinationId);
			Tram t = new Tram(actualId,source,destination,weight);
			super.addEdgeToList(t);
			++actualId;
		}
	}
}
