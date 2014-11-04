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
 * @author gg
 */
public class DriverAgent {
    private static void menu() {
        System.out.println("Driver clase Agent"
                + "\n 0.Salir"
                + "\n 1.Agent(int nouID)"
                + "\n 2.assistirReunio(Reunio re)" 
                + "\n 3.getId()" 
                + "\n 4.getIt()" 
                + "\n 5.getRe()" 
                + "\n 6.setIt(Itinerari itin)" 
                + "\n 7.setRe(Reunio reun)" 
                + "\n");
    }
    public static void main(String [] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        String[] lsplited;
        Agent a = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("DATE FORMAT --- yyyy-MM-dd");
        
        while (sc.hasNextLine()) {
            try {
                lsplited = sc.nextLine().split(" ");
                switch(Integer.parseInt(lsplited[0])) {
                    case 1: {
                        a = new Agent(Integer.parseInt(lsplited[1]));
                        break;
                    }
                    case 2: {
                        Ciutat c = new Ciutat(Integer.parseInt(lsplited[1]), lsplited[2], Integer.parseInt(lsplited[3]));
                        String aux = lsplited[4]+"-"+lsplited[5]+"-"+lsplited[6];
                        Date dat =  df.parse(aux);
                        Reunio reu = new Reunio(c,dat);
                        a.assistirReunio(reu);
                        break;
                    }
                    case 3: {
                        System.out.println(a.getId());
                        break;
                    }
                    case 4: {
                        System.out.println(a.getIt());
                        break;
                    }
                    case 5: {
                        System.out.println(a.getRe());
                        break;
                    }
                    case 6: {
                        Itinerari it = new Itinerari();
                        a.setIt(it);
                        break;
                    }
                    case 7: {
                        Ciutat c = new Ciutat(Integer.parseInt(lsplited[1]), lsplited[2], Integer.parseInt(lsplited[3]));
                        String aux = lsplited[4]+"-"+lsplited[5]+"-"+lsplited[6];
                        Date dat =  df.parse(aux);
                        Reunio reu = new Reunio(c,dat);
                        a.setRe(reu);
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
