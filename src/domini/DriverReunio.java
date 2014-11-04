/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domini;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
 
/**
 *
 * @author
 */
public class DriverReunio {
    private static void menu() {
        System.out.println("Driver clase Reunio"
                + "\n 0.Salir"
                + "\n 1.Reunio(Ciutat desti, Date data) {"
                + "\n 2.afegeixAgent(Agent nouA)" 
                + "\n 3.getOrigen()"
                + "\n 4.getDesti()"
                + "\n 5.getNAgents()"
                + "\n 6.setOrigen(Ciutat ori)"
                + "\n 7.setDesti(Ciutat des)"
                + "\n 8.setNAgents(int num)"
                + "\n");
    }
    public static void main(String [] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        String[] lsplited;
        Agent a = null;
        Reunio reu = null;
        Ciutat ciut = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("DATE FORMAT --- yyyy-MM-dd");
        
        while (sc.hasNextLine()) {
            try {
                lsplited = sc.nextLine().split(" ");
                switch(Integer.parseInt(lsplited[0])) {
                    case 1: {
                        ciut = new Ciutat(Integer.parseInt(lsplited[1]), lsplited[2], Integer.parseInt(lsplited[3]));
                        String aux = lsplited[4]+"-"+lsplited[5]+"-"+lsplited[6];
                        Date dat =  df.parse(aux);
                        reu = new Reunio(ciut,dat);
                        break;
                    }
                    case 2: {
                        a = new Agent(Integer.parseInt(lsplited[1]));
                        break;
                    }
                    case 3: {
                        System.out.println(reu.getOrigen());
                        break;
                    }
                    case 4: {
                        System.out.println(reu.getDesti());
                        break;
                    }
                    case 5: {
                        System.out.println(reu.getNAgents());
                        break;
                    }
                    case 6: {
                        ciut = new Ciutat(Integer.parseInt(lsplited[1]), lsplited[2], Integer.parseInt(lsplited[3]));
                        reu.setOrigen(ciut);
                        break;
                    }
                    case 7: {
                        ciut = new Ciutat(Integer.parseInt(lsplited[1]), lsplited[2], Integer.parseInt(lsplited[3]));
                        reu.setDesti(ciut);
                        break;
                    }
                    case 8: {
                        reu.setNAgents(Integer.parseInt(lsplited[1]));
                        break;
                    }
                    case 0: {
                        System.exit(0);
                    }
                    default: {
                        System.out.println("Invalid entry\n");
                        break;                    
                    }       
                }
            }catch(Exception e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            }
        }
    }
}
