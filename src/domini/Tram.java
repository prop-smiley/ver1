package domini;

import base.BaseVertex;
import weighted.WeightedEdge;


/**
 *
 * @author alumne
 */
public class Tram extends WeightedEdge {
	public Cami c;
	;
	;
	public Tram(BaseVertex source, BaseVertex destination,int weight) {
		super(source, destination,weight);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public boolean lliure(){
		return (c==(null));
	}
    
}
