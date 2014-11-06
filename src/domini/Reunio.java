package domini;

import java.util.*;

/**
 *
 * @author susanhenriquezelias
 */
public class Reunio {
    
    //Dades
    private Date data;
    private int nAgents;
    private Ciutat desti; 
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
     * Funcio get del parametre data.
     * @return la Date data de la Reunio objecte.
     */
    public Date data(){
 	   return this.data;
    }
    
    /**
     * Funcio get del parametre Origen.
     * @return la ciutat Origen de la Reunio objecte.
     */
    public Ciutat origen(){
    	return this.origen;
    }
    
    /**
     * Funcio get del parametre Desti.
     * @return la ciutat Desti de la Reunio objecte.
     */
    public Ciutat desti(){
    	return this.desti;
    }
    
    /**
     * Funcio get del parametre NAgents.
     * @return el nombre d Agents assistents a la Reunio objecte.
     */
    public int nAgents(){
    	return this.nAgents;
    }
    
    /**
     * Funcio set del parametre Origen
     * @param ori ciutat que es vol assignar com a origen a la Reunio objecte.
     */
    public void setOrigen(Ciutat ori){
        this.origen = ori;
    }
    
    /**
     * Funcio set del parametre Desti
     * @param des ciutat que es vol assignar com a desti a la Reunio objecte.
     */
    public void setDesti(Ciutat des){
        this.desti = des;
    }
    
    /**
     * Funcio set del parametre NAgents
     * @param num integer que es vol assignar com a NAgents a la Reunio objecte.
     */
    public void setNAgents(int num){
        this.nAgents = num;
    }
    
    
    //buscar si hay un agente
    public boolean hayAgente(int id){
        Iterator<Agent> iter = llistatAgents.iterator();
        while(iter.hasNext()){
            if((iter.next().id()) == id) return true;
        }
        return false;
    }
    
    //añadir un agente
    public void afegirAgent(Agent a){
        if(hayAgente(a.id()) == false) this.llistatAgents.add(a);
        else System.out.println("El agente que intentas añadir ya existe en la reunión");
    }
    
    //eliminar un agente
    public void eliminarAgent(Agent a){
        if(hayAgente(a.id())) this.llistatAgents.remove(a);
        else System.out.println("El agente que intentas eliminar no existe en la reunión");
    }
    //modificar ciudad destino
    public void modificarDesti(Ciutat d){
        this.desti = d;
    }
    
    public boolean equals(Reunio re){
    	return (this.data().equals(re.data()) &&  this.desti.equals(re.desti()));    	
    }
    
    
}