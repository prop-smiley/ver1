package domini;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumne
 */
public class Itinerari extends Cami{
	
    int IdAgentAssignat;
    public List<Tram> llistatTramsIt;
    
    /**
     * Constructor per defecte.
     * @param idAgent id de l agent al que se li assignara el itinerari
     * @param c Cami que li sera assignat al agent com a Itinerari
     */
    public Itinerari(int idAgent, Cami c){
        List<Tram> llistatTramsIt = c.getLlistattramscami();
        IdAgentAssignat = idAgent;
    }
    
    /**
     * Funcio per retornar els trams del itinerari objecte
     * @return llista de trams que te el itinerari objecte
     */
    public List<Tram> getLlistattramsitinerari(){
    	return llistatTramsIt;
    }
    
    /**
     * Funcio per retornar l id de l Agent assignat a l itinerari objecte
     * @return l id de l agent assignat al itinerari objecte
     */
    public int getAgentassignat(){
    	return IdAgentAssignat;
    }
}
