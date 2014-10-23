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
    public List<Agent> llistatAgents = new ArrayList<Agent>();
    
    public Reunio(Ciutat desti, Date data){
    	this.desti = desti;
    	this.data = data;
    	this.nAgents = 0;
    }
    
    public void afegeixAgent(Agent nouA){
    	this.llistatAgents.add(nouA);
    	++this.nAgents;
    }
    
    
}
