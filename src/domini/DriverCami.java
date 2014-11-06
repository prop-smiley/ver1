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
public class DriverCami {
    private static void menu() {
        System.out.println("Driver clase DriverCami"
                + "\n 0.Salir"
                + "\n 1.afegirTram(Tram nouT)"
                + "\n 2.eliminarTram()" 
                + "\n 3.llista()" 
                + "\n");
    }
    public static void main(String [] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        String[] lsplited;
        Cami ca = null;

        while (sc.hasNextLine()) {
            try {
                lsplited = sc.nextLine().split(" ");
                switch(Integer.parseInt(lsplited[0])) {
                    case 1: {
                        Vertex v = new Vertex(Integer.parseInt(lsplited[1]), lsplited[2]);
                        Vertex v2 = new Vertex(Integer.parseInt(lsplited[3]), lsplited[4]);
                        Tram t = new Tram(v, v2, Integer.parseInt(lsplited[5])) ;
                        ca.afegirTram(t);
                        break;
                    }
                    case 2: {
                        ca.eliminarTram();
                        break;
                    }
                    case 3: {
                       // System.out.println("0=false, 1=true");
                        ca.llista();
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
