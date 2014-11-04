package domini;

import java.util.*;
import java.util.ArrayList;

import static java.util.Collections.binarySearch;

public class ControlAgent {

    private ArrayList<Agent> Agents;
    private int nAgents;
    
    /**
     * Constructor per defecte.
     */
    public ControlAgent(){
    	Agents = new ArrayList();
    	nAgents = 0;
    }
    
    /**
     * Constructor amb parametre.
     * @param nouID integer que indica l ID del nou agent creat.
     */
    public ControlAgent(int nouID){
	/*
	 * 
	 */
    }
    
    /**
     * Accio que crea un nou Agent amb ID determinat.
     * @param nouID integer que indica el nou ID de l agent creat
     * @post l agent amb ID nouID es creat i afegit en cas de no ser-hi
     */
    public void nouAgent(int nouID){        
        int i = 0; boolean conte = false;
        Agent aux = null;
        while((Agents.size() > i)){
            aux = Agents.get(i);
            if (aux.getId() == nouID) {
                conte = true;
            }
            ++i;
        }
        if (conte) System.out.println("Invalid entry\n"); //creo que no se hacen salidas por pantalla
        else {Agent a = new Agent(nouID); Agents.add(a); ++nAgents;}
    }
    
    /**
     * Accio que elimina un Agent de la llista d Agents.
     * @param nouID integer que indica el nou ID de l agent a eliminar.
     * @post l Agent amb ID nouID ha estat tret d ela llista d Agents.
     */
    public void eliminaAgent(int idAgent){
        for(Agent a : Agents){
            if (idAgent == a.getId())
                 Agents.remove(a);
        }
    }
    
    /**
     * Funcio get d un Agent.
     * @param idAgent integer que indica l ID de l agent a retornar.
     * @return retorna, del conunt d Agents, l objecte agent amb l ID indicat.
     */
    public Agent getAgent(int idAgent){
        int i = 0;
        Agent aux = null; Agent res = null;
        while((Agents.size() > i)){
            aux = Agents.get(i);
            if (aux.getId() == idAgent) res = aux;
            ++i;
        }
        return res;
    }
    
    /**
     * Accio set de l Itinerari d un agent.
     * @param a Agent del qual volem modificar l Itinerari
     * @param it Cami que volem que passi a ser l itinerari de l Agent.
     */
    public void setItinerari(Agent a, Cami it){
        // a la OP realitzaItinerari de Agente le llega un camino, asi que aqui pedimos camino
    	int i = 0; //boolean done = false;
        while((Agents.size() > i)){
            if (Agents.get(i).equals(a)){
                Agents.get(i).setIt(it);
            }
            ++i;
        }
    }
    
    /**
     * Accio set de la Reunio d un agent.
     * @param a Agent del qual volem modificar la reuio
     * @param re Reunio que volem assignar a l Agent.
     */
    public void setReunio(Agent a, Reunio re){
	int i = 0; //boolean done = false;
        while((Agents.size() > i)){
            if (Agents.get(i).equals(a)){
                Agents.get(i).assistirReunio(re);
            }
            ++i;
        }
    }
    
    /**
     * Accio que elimina l Itinerari d un agent.
     * @param a Agent del qual volem eliminar l Itinerari
     */
    public void eliminarItinerari(Agent a){
    	int i = 0; //boolean done = false;
        while((Agents.size() > i)){
            if (Agents.get(i).equals(a)){
                Agents.get(i).setIt(null);
            }
            ++i;
        }
    }
    
    /**
     * Accio que elimina una Reunio d un Agent.
     * @param a Agent del qual volem eliminar la reunio.
     */
    public void eliminarReunio(Agent a){
        //si vas a eliminar la reunion no hace falta pasarle la reunion, como en eli-itin
	int i = 0; //boolean done = false;
        while((Agents.size() > i)){
            if (Agents.get(i).equals(a)){
                Agents.get(i).assistirReunio(null);
            }
            ++i;
        }
    }
    
}
