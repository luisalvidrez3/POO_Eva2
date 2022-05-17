/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_herencia;

/**
 *
 * @author luisa
 */
public class Eva2_3_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        animal anima1 = new animal();
        anima1.mover();
        vertebrado vertebrado1 = new vertebrado();
        vertebrado1.tenerEsqueleto();
        mamifero mamifero1= new mamifero();
        mamifero1.tenerPelo();
         primate primate1= new primate();
        primate1.tenerPulgares();
    }
    
}
class primate extends mamifero{

    public primate() {
        System.out.println("PRIMATES");
    }
    public void tenerPulgares(){
        System.out.println("PRIMATE: tiene pulgares");
    }
    
    
}




class mamifero extends vertebrado{

    public mamifero(){
        System.out.println("MAMIFERO");
        
    }
         public void tenerPelo(){
        System.out.println("MAMIFERO: tiene pelo");
    }
    
}




class vertebrado extends animal{

    public vertebrado() {
        System.out.println("VERTEBRADO");
    }
    public void tenerEsqueleto(){
        System.out.println("VERTEBRADO: tiene esqueleto");
    }
    
}



class animal{
    public animal(){
        System.out.println("ANIMAL");
    }
    public void mover(){
        System.out.println("ANIMAL:Movimiento");
    
    }
}