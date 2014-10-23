package smiley;

import java.util.*;

/**
 *
 * @author alumne
 */
public class Reunio {
    
    //Dades
    private Date data;
    private int nAgents;
    private final Ciutat desti;
    private static Ciutat origen;
    public List<Agent> myList = new ArrayList<Agent>();
    
    public Reunio(Ciutat desti, Date data){
    	this.desti = desti;
    	this.data = data; 
    }
    
    
}
