/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_arreglos;

/**
 *
 * @author luisa
 */
public class Eva2_11_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        arreglo[0] = 100;
        System.out.println("El valor del arreglo [0] es: " + arreglo[0]);
        arreglo [1] = 200;
         arreglo [2] = 300;
          arreglo [3] = 400;
           arreglo [4] = 500;
            arreglo [5] = 600;
             arreglo [6] = 70;
              arreglo [8] = 800;
               arreglo [9] = 900;
               
               String [] arreCade = new String[10];
               arreCade[5] = "Hola mundo";
               double[] arreDouble = new double[1000000];
               arreDouble[999999] = 0.2;
               Persona[] clasePOO = new Persona[32];
               
    }
    
}
class Persona{
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}