package domini;

import weighted.WeightedEdge;


/**
 *
 * @author alumne
 */
public class Tram extends WeightedEdge {
	public Cami c;
	;
	;
	public Tram(Vertex source, Vertex destination,int weight) {
		super(source, destination,weight);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public boolean lliure(){
		return (c==(null));
	}
    
}
