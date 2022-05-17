/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_arreglos_3_obj;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva2_12_arreglos_3_obj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona[] arregloPer = new persona[32];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <32;i++){
            arregloPer [i] = new persona();
            System.out.println("Cual es tu nombre?");
            arregloPer[i].setNombre(input.nextLine());
        }
         for(int i = 0; i <32;i++){
             System.out.println("Nombre: " + arregloPer[i].getNombre());
         }
    }
    
}
class persona{
private String nombre;

    public persona() {
    }

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
