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
        int i = 0; boolean conte = false;
        Agent aux = null;
        while((Agents.size() > i)){
            aux = Agents.get(i);
            if (aux.id() == nouID) {
                conte = true;
            }
            ++i;
        }
        if (conte) System.out.println("Invalid entry\n"); //creo que no se hacen salidas por pantalla
        else {Agent a = new Agent(nouID); Agents.add(a); ++nAgents;}
    }
    
    public void eliminaAgent(int idAgent){
        for(Agent a : Agents){
            if (idAgent == a.id())
                 Agents.remove(a);
        }
    }
    public Agent getAgent(int idAgent){
        int i = 0;
        Agent aux = null; Agent res = null;
        while((Agents.size() > i)){
            aux = Agents.get(i);
            if (aux.id() == idAgent) res = aux;
            ++i;
        }
        return res;
    }
    
    // a la OP realitzaItinerari de Agente le llega un camino, asi que aqui pedimos camino
    public void modificaItinerari(Agent a, Cami it){
    	int i = 0; //boolean done = false;
        while((Agents.size() > i)){
            if (Agents.get(i).equals(a)){
                Agents.get(i).realitzaItinerari(it);
            }
            ++i;
        }
    }
    public void modificaReunio(Agent a, Reunio re){
	int i = 0; //boolean done = false;
        while((Agents.size() > i)){
            if (Agents.get(i).equals(a)){
                Agents.get(i).assistirReunio(re);
            }
            ++i;
        }
    }
    
    //no hace falta pasarle el Itinerari it como estaba antes
    public void eliminarItinerari(Agent a){
    	int i = 0; //boolean done = false;
        while((Agents.size() > i)){
            if (Agents.get(i).equals(a)){
                Agents.get(i).realitzaItinerari(null);
            }
            ++i;
        }
    }
    
    //si vas a eliminar la reunion no hace falta pasarle la reunion, como en eli-itin
    public void eliminarReunio(Agent a){
	int i = 0; //boolean done = false;
        while((Agents.size() > i)){
            if (Agents.get(i).equals(a)){
                Agents.get(i).assistirReunio(null);
            }
            ++i;
        }
    }
    
    
    
    
}
