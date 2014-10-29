package domini;

import java.util.*;
import java.util.ArrayList;

import static java.util.Collections.binarySearch;

public class ControlAgent {

    private ArrayList<Agent> Agents;
    private int nAgents;
    
    public ControlAgent(){
    	Agents = new ArrayList();
    	nAgents = 0;
    }
    
    public ControlAgent(int nouID){
	/*
	 * 
	 */
    }
    
    public void nouAgent(int nouID){
    	Agent a = new Agent(nouID);
    	Agents.add(a);
    	++nAgents;
    }
    
    public void eliminaAgent(int idAgent){
    	for(int i = 0 ; i<nAgents ; ++i){
    		/*
    		 * import java.util.List;
				...
				List<String> l = arrayList;
				for( String s : l ){
			  		System.out.println( s );
				}
    		 */
    	}
    }
    public Agent getAgent(int id){
    	return null;
    }
    
    public void modificaItinerari(Agent a, Itinerari it){
    	
    }
    public void modificaReunio(Agent a, Reunio re){
		
	}
    
    
    public void eliminarItinerari(Agent a, Itinerari it){
    	
    }
    public void eliminarReunio(Agent a, Reunio re){
		
	}
    
    
    
    
}
