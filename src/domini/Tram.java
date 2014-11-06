package domini;

import base.BaseVertex;
import weighted.WeightedEdge;

/**
 * @autor joan
 */

public class Tram extends WeightedEdge {
	public int id;
	public int capacity;
	public int flow;

	public Cami c;

	public Tram(int id, Ciutat source, Ciutat destination, int weight) {
			super(source, destination,weight);
			this.id = id;
			this.capacity = 1;
			this.flow = 0;
			this.c = null;
	}
	
	public Tram(int id, Ciutat source, Ciutat destination, int weight, int capacity) {
		super(source, destination,weight);
		this.id = id;
		this.capacity = capacity;
		this.flow = 0;
		this.c = null;
	}
	
	public int capacity(){
		return (capacity -flow);
	}
	
	public int id(){
		return this.id;
	}
	
	public boolean teCami(Cami c){
		return (c != null);
	}

	
    
}
