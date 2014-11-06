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
               //if(iter.next().equals(buscarcami(id))) return true;
               if(buscarcami(id).equals(iter.next())) return true;
           }
           return false;

       }
       public Cami buscarcami(int id){//
           Iterator<Cami>iter = llistatCamins.iterator();
           while(iter.hasNext()){
               if((iter.next().getidCami()) == id){ 
                   return iter.next();
               }
           }
           System.out.println("No existe el camino con id: " +id);
           return null;
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
       //id es el id del camino donde queremos 
      public boolean tetram(int id, Tram t){
          Cami c = buscarcami(id);
    	   return c.teTram(t.id());
    	   
       }
    
}