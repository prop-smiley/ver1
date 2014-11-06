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
<<<<<<< HEAD
    private static Ciutat desti; //CAMBIO DE FINAL A STATIC PARA EL SETTER
=======
    private Ciutat desti; 
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
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
<<<<<<< HEAD
    	return origen;
=======
    	return this.origen;
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
    }
    
    /**
     * Funcio get del parametre Desti.
     * @return la ciutat Desti de la Reunio objecte.
     */
    public Ciutat getDesti(){
<<<<<<< HEAD
    	return desti;
=======
    	return this.desti;
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
    }
    
    /**
     * Funcio get del parametre NAgents.
     * @return el nombre d Agents assistents a la Reunio objecte.
     */
    public int getNAgents(){
<<<<<<< HEAD
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
=======
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
    
    
}
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
