/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domini;
import java.util.*;

/**
 *
 * @author susanhenriquezelias
 */
public class ControladorCami {
       public List<Cami> llistatCamins = new ArrayList<Cami>();
       
       
       //existe el camino?
       public boolean Jaexisteixcami(int id){
           Iterator<Cami>iter = llistatCamins.iterator();
           while(iter.hasNext()){
               if(iter.next().getidCami() == id) return true;
           }
           return false;

       }
       
       //añado un nuevo camino
       public void afegircami(Cami c){
           if(Jaexisteixcami(c.getidCami()) == false) this.llistatCamins.add(c);
           else System.out.println("El cami ja existeix");
       }
       
       //elimina un camino
       public void eliminarcami(Cami c){
           if(Jaexisteixcami(c.getidCami()) == true){
                Iterator<Cami>iter = llistatCamins.iterator();
                while(iter.hasNext()){
                    if(iter.next().getidCami() == c.getidCami()){
                        this.llistatCamins.remove(c);
                    }
                }
           }
           else System.out.println("El cami que vols eliminar no existeix");

       }
    
}
