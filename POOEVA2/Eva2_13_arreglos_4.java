/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_arreglos_4;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva2_13_arreglos_4 {
public static final int  TAMA = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int [] arregloEdad = new int [TAMA];
        System.out.println("Tamaño del arreglo: " + arregloEdad.length);
        Scanner input = new Scanner(System.in);
        for (int i= 0; i<arregloEdad.length; i++){
            System.out.println("Cual es su edad");
            arregloEdad[i] = input.nextInt();
        }
         for (int i= 0; i<arregloEdad.length; i++){
             System.out.println("["+arregloEdad[i]+"]");
         }
        
    }
        
    }
    

