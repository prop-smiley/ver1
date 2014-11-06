package domini;

import java.io.IOException;




<<<<<<< HEAD:src/domini/ControlTram.java
public class ControlTram {
    
    private int idTram;
    
    /**
     * Constructor per defecte.
     * @param nouID integer que indica l ID del nou agent
     */
    private ControlTram(int idTram){
	this.idTram = idTram;
    }
=======
public class ControladorTram {
	
	private int idTram;
	
	private ControladorTram(int idTram){
		this.idTram = idTram;
	}
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce:src/domini/ControladorTram.java
	
    public void carregar(String path) throws IOException, Exception  {
    	
    }

    public void guardar(String path) throws IOException, Exception  {
    		
    }
    
}
