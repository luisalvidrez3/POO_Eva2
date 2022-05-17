/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_herencia_interfaces;

/**
 *
 * @author luisa
 */
public class Eva2_8_herencia_interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
class Prueba implements B{
    
    @Override
    public void metodoB() {
      
    }

    @Override
    public void metodoA() {
       
    }
    
}

interface A{
    public void metodoA();
}

interface B extends A{
    public void metodoB();
}