/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva2_12_arreglos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arregloEdad = new int [32];
        Scanner input = new Scanner(System.in);
        for (int i= 0; i<32; i++){
            System.out.println("Cual es su edad");
            arregloEdad[i] = input.nextInt();
        }
         for (int i= 0; i<32; i++){
             System.out.println("["+arregloEdad[i]+"]");
         }
        
    }
    
}
