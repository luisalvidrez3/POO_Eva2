/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_final;

/**
 *
 * @author luisa
 */
public class Eva2_14_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
final class estudiante extends persona{
    private String numControl;

    public estudiante() {
    }

  
    public estudiante(String numControl, String nombre) {
        super(nombre);
        this.numControl = numControl;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    
    
} 
class esudiantePosgrado extends estudiante{
    
    
}