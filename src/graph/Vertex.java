package graph;

//import graph.Vertex;

public class Vertex {

	private int id;
	private String name;


	public Vertex(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Get the vertex id
	 * 
	 * @return int with the unique id value
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Get the vertex name
	 * 
	 * @return String with the vertex name
	 */
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Vertex) {
			Vertex otherVertex = (Vertex) object;
			return (id == otherVertex.getId());
		} else
			return false;
	}

	@Override
	public String toString() {
		return name;
	}

}