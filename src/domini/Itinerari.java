package domini;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eric
 */
public class Itinerari extends Cami{
	
	public List<Agent> llistatAgents = new ArrayList<Agent>();

        public void insertAgent(Agent a){
            this.llistatAgents.add(a);
        }
        
        public List<Agent> getAgent(){
            return this.llistatAgents;
        }
}