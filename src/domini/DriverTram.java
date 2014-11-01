/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domini;

import java.util.*;
import java.util.Scanner;
 
/**
 *
 * @author
 */
public class DriverTram {
    private static void menu() {
        System.out.println("Driver clase Tram"
                + "\n 0.Salir"
                + "\n 1.Tram(Vertex source, Vertex destination,int weight)"
                + "\n 2.getLliure()" 
                + "\n 3.setLliure()" 
                + "\n");
    }
    public static void main(String [] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        String[] lsplited;
        Tram t = null;
        Vertex v = null;
        Vertex v2 = null;
        while (sc.hasNextLine()) {
            try {
                lsplited = sc.nextLine().split(" ");
                switch(Integer.parseInt(lsplited[0])) {
                    case 1: {
                        v = new Vertex(Integer.parseInt(lsplited[1]), lsplited[2]);
                        v2 = new Vertex(Integer.parseInt(lsplited[3]), lsplited[4]);
                        t = new Tram(v, v2, Integer.parseInt(lsplited[5])) ;
                        break;
                    }
                    case 2: {
                        System.out.println(t.getLliure());
                        break;
                    }
                    case 3: {
                       // System.out.println("0=false, 1=true");
                        boolean cierto=true;
                        if(Integer.parseInt(lsplited[1]) == 0) cierto = false;
                        t.setLliure(cierto);
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
