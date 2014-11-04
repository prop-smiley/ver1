package domini;

import java.util.*;

/**
 *
 * @author alumne
 */
public class Reunio {
    
    //Dades
    private Date data;
    private int nAgents;
    private static Ciutat desti; //CAMBIO DE FINAL A STATIC PARA EL SETTER
    private static Ciutat origen;
    public List<Agent> llistatAgents = new ArrayList<Agent>();
    
    /**
     * Constructor per defecte.
     * @param desti ciutat que indica el final de la reunio
     * @param data date que indica ql dia en el que es fa la reunio
     */
    public Reunio(Ciutat desti, Date data){
    	this.desti = desti;
    	this.data = data;
    	this.nAgents = 0;
    }
    
    /**
     * Accio que afegeig un Agent a la reunio.
     * @param nouA agent que indica qui s afegeix a la reunio objecte.
     */
    public void afegeixAgent(Agent nouA){
    	this.llistatAgents.add(nouA);
    	++this.nAgents;
    }
    
    /**
     * Funcio get del parametre Origen.
     * @return la ciutat Origen de la Reunio objecte.
     */
    public Ciutat getOrigen(){
    	return origen;
    }
    
    /**
     * Funcio get del parametre Desti.
     * @return la ciutat Desti de la Reunio objecte.
     */
    public Ciutat getDesti(){
    	return desti;
    }
    
    /**
     * Funcio get del parametre NAgents.
     * @return el nombre d Agents assistents a la Reunio objecte.
     */
    public int getNAgents(){
    	return nAgents;
    }
    
    /**
     * Funcio set del parametre Origen
     * @param ori ciutat que es vol assignar com a origen a la Reunio objecte.
     */
    public void setOrigen(Ciutat ori){
        origen = ori;
    }
    
    /**
     * Funcio set del parametre Desti
     * @param des ciutat que es vol assignar com a desti a la Reunio objecte.
     */
    public void setDesti(Ciutat des){
        desti = des;
    }
    
    /**
     * Funcio set del parametre NAgents
     * @param num integer que es vol assignar com a NAgents a la Reunio objecte.
     */
    public void setNAgents(int num){
        nAgents = num;
    }
}
