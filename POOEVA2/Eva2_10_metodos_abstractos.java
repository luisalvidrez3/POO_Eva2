/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_metodos_abstractos;

/**
 *
 * @author luisa
 */
public class Eva2_10_metodos_abstractos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class ImplementsAbstracto extends ClaseAbstracta{

    @Override
    public void metodoAbstracto() {
      
    }
    
}



abstract class ClaseAbstracta{
    public void metodoImplementado(){
        System.out.println("Metodo implementado");
        
    }
    public abstract void metodoAbstracto();
}