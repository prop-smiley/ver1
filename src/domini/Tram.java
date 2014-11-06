package domini;

<<<<<<< HEAD
=======
import base.BaseVertex;
import weighted.WeightedEdge;

<<<<<<< HEAD
=======

>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
>>>>>>> origin/dev
/**
 * @autor joan
 */
<<<<<<< HEAD

=======
<<<<<<< HEAD
public class Tram extends Edge {
    public Cami c;
    boolean usado = false;

    /**
      * Constructor per defecte.
      * @param nouID integer que indica l ID del nou agent
      */
    public Tram(Vertex source, Vertex destination,int weight) {
	super(source, destination,weight);
	// TODO Auto-generated constructor stub
    }

    /**
     * Funcio get del parametre Usado.
     * @return si esta o no utilitzat el tram objecte.
     */
    public boolean getLliure(){
	return usado;
    }
=======
>>>>>>> origin/dev
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

	
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
    
    /**
     * Accio set del parametre Usado.
     * @param b bolean que indica si s ha utilitzat o no.
     */
    public void setLliure(boolean b){
	usado = b;
    }
        	
}
