package base;

/**
 * Base class for the graph's vertex.
 * 
 * The programmer might use this class for his convenience.
 * 
 * @author group 5.2, Programming Projects, Barcelona School of Informatics,
 *         October 2014.
 *
 */
public class BaseVertex {

	protected int id;

	public BaseVertex(int id) {
		this.id = id;
	}

	/**
	 * Get the vertex id
	 * 
	 * @return int with the unique id value
	 */
	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof BaseVertex) {
			BaseVertex otherVertex = (BaseVertex) object;
			// The id is unique and already guarantees that it is the same
			// object. No need to check the name.
			return id == otherVertex.getId();
		} else
			return false;
	}

	@Override
	public String toString() {
		return "(" + id + ")";
	}

}