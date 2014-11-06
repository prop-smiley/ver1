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
       
       
       public ControladorCami(){
    	   
       }
       
       //existe el camino?
       public boolean Jaexisteixcami(int id){
           Iterator<Cami>iter = llistatCamins.iterator();
           while(iter.hasNext()){
               if(iter.next().equals(id)) return true;
           }
           return false;

       }
       
       //añado un nuevo camino
       public void afegircami(int id){
           if(Jaexisteixcami(id) == false){
        	   Cami c =  new Cami(id);
        	   this.llistatCamins.add(c);
           }
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
       hfgjhgfdghdfhg(int id, Tram t){
    	   cami.busca(t);
    	   
       }
    
}
