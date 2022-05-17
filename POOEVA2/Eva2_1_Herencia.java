/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_herencia;

/**
 *
 * @author luisa
 */
public class Eva2_1_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Estudiante Estu1 = new Estudiante("Juana", 20, "00112233");
        
        Estu1.ImprimirDatos();
        
        Maestro mtro1 = new Maestro ("Flabio", 20, "0044384");
        mtro1.ImprimirDatos();
        
        
    }
    
}
class Maestro extends Persona{
    private String NoRegistro;

    public Maestro() {
         super();
        System.out.println("Clase maestro");
    }

    public Maestro(String nombre, int edad, String NoRegistro) {
        super(nombre, edad);
        this.NoRegistro = NoRegistro;
    }
    
    public String getNoRegistro() {
        return NoRegistro;
    }

    public void setNoRegistro(String NoRegistro) {
        this.NoRegistro = NoRegistro;
    }
   
    @Override
    public void ImprimirDatos(){
        super.ImprimirDatos();
        System.out.println("Nmero de control: " + NoRegistro);
    }
}

class Estudiante extends Persona{
private String NumeroDeControl;

    public Estudiante() {
        super();
        System.out.println("Clase estudiante");
    }
    
    public Estudiante(String nombre, int edad, String numControl){
        super(nombre, edad);
        this.NumeroDeControl = numControl;
    }

    public String getNumeroDeControl() {
        return NumeroDeControl;
    }

    public void setNumeroDeControl(String NumeroDeControl) {
        this.NumeroDeControl = NumeroDeControl;
    }
    
  
    
    @Override
    public void ImprimirDatos(){
        super.ImprimirDatos();
        System.out.println("Nmero de control: " + NumeroDeControl);
    }
}

class Persona{
    
    private String nombre;
    private int edad;
    

    public String getNombre() {
        return nombre;
    }

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        System.out.println("Clase persona");
    }
        public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    
    public void ImprimirDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
    }
}