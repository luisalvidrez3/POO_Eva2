/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_clases_anonimas;

/**
 *
 * @author luisa
 */
public class Eva2_19_clases_anonimas {

    /**
     * @param  the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mensajes mensaje = new Mensajes (){
            @Override
            public void mostrarMensajes() {
                System.out.println("Hola mundo");
            }
        
    };
    }
}
    interface Mensajes {

    public void mostrarMensajes();
    }
