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
public class DriverCiutat {
    private static void menu() {
        System.out.println("Driver clase DiverCiutat"
                + "\n 0.Salir"
                + "\n 1.Ciutat(int id, String name, int longitud) {"
                + "\n 2.setNom(int id, String name)" 
                + "\n 3.setLong(int id, int longitud)" 
                + "\n 4.getNom(int id)"
                + "\n 5.getLong(int id)"
                + "\n");
    }
    public static void main(String [] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        String[] lsplited;
        Ciutat ciut = null;
        
        while (sc.hasNextLine()) {
            try {
                lsplited = sc.nextLine().split(" ");
                switch(Integer.parseInt(lsplited[0])) {
                    case 1: {
                        ciut = new Ciutat(Integer.parseInt(lsplited[1]), lsplited[2], Integer.parseInt(lsplited[3]));
                        break;
                    }
                    case 2: {
                        ciut.setNom(lsplited[1]);
                        break;
                    }
                    case 3: {
                        ciut.setLong(Integer.parseInt(lsplited[1]));
                        break;
                    }
                    case 4: {
                        System.out.println(ciut.getNom(Integer.parseInt(lsplited[1])));
                        break;
                    }
                    case 5: {
                        System.out.println(ciut.getLong(Integer.parseInt(lsplited[1])));
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
