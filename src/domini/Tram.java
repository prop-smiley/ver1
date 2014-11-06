package domini;

import base.BaseVertex;
import weighted.WeightedEdge;


/**
 *
 * @author alumne
 */
public class Tram extends WeightedEdge {
	public int capacity;
	public int flow;
	public int id;
	
	public Cami c;

	public Tram(BaseVertex source, BaseVertex destination,int weight) {
		super(source, destination,weight);
		// TODO Auto-generated constructor stub
		this.capacity = 1;
		this.flow = 0;
		
	}
	public Tram(BaseVertex source, BaseVertex destination,int weight, int capacity) {
		super(source, destination,weight);
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		this.flow = 0;

	}
	
	public int capacity(){
		return (capacity -flow);
	}
	
	public int id(){
		return this.id;
	}
	
	public boolean lliure(){
		return (c==(null));
	}
	
    
}
