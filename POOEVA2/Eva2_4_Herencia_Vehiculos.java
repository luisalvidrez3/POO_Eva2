/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_herencia_vehiculos;

/**
 *
 * @author luisa
 */
public class Eva2_4_Herencia_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vehiculos V1 = new vehiculos("Gasolina", 4,3.4,6,4,"honda","city",2021);
       
        V1.imprimirDatos();
         
    }
    
}

    class vehiculos{
        private String combustible;
        private int numLlantas;
        private double capacidadDeMotor;
        private int cilindros;
        private int pasajeros;
        private String marca;
          private String modelo;
            private int año;

    public vehiculos() {
    }

    public vehiculos(String combustible, int numLlantas, double capacidadDeMotor, int cilindros, int pasajeros, String marca, String modelo, int año) {
        this.combustible = combustible;
        this.numLlantas = numLlantas;
        this.capacidadDeMotor = capacidadDeMotor;
        this.cilindros = cilindros;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public double getCapacidadDeMotor() {
        return capacidadDeMotor;
    }

    public void setCapacidadDeMotor(double capacidadDeMotor) {
        this.capacidadDeMotor = capacidadDeMotor;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void imprimirDatos(){
        System.out.println("Combustible: " + combustible + "Numero de llantas: "+ numLlantas +
                "Capacidad de motor: " + capacidadDeMotor + " Lts " + "Cilindros: " + cilindros + 
                "Pasajerso: " + pasajeros + "Marca: " + marca + "Modelo: " + modelo + "Año: " + año );
    }
            
            
        
    }
class motocicletas extends vehiculos{
    private String tipoDeMotocicleta;

    public motocicletas() {
        super();
    }

   
    public motocicletas(String tipoDeMotocicleta, String combustible, int numLlantas, double capacidadDeMotor, int cilindros, int pasajeros, String marca, String modelo, int año) {
        super(combustible, numLlantas, capacidadDeMotor, cilindros, pasajeros, marca, modelo, año);
        this.tipoDeMotocicleta = tipoDeMotocicleta;
    }

    public String getTipoDeMotocicleta() {
        return tipoDeMotocicleta;
    }

    public void setTipoDeMotocicleta(String tipoDeMotocicleta) {
        this.tipoDeMotocicleta = tipoDeMotocicleta;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tipo de motocicleta: " + tipoDeMotocicleta);
        
    }
    
}
    class automoviles extends vehiculos{
        private String tipoVehiculo;
        private String transmision;
        private String equipamiento;

    public automoviles() {
        super();
    }


    public automoviles(String tipoVehiculo, String transmision, String equipamiento, String combustible, int numLlantas, double capacidadDeMotor, int cilindros, int pasajeros, String marca, String modelo, int año) {
        super(combustible, numLlantas, capacidadDeMotor, cilindros, pasajeros, marca, modelo, año);
        this.tipoVehiculo = tipoVehiculo;
        this.transmision = transmision;
        this.equipamiento = equipamiento;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }
        @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Tipo de vehiculo "+ tipoVehiculo + "Transmision: " + transmision + "Equipamiento: " + equipamiento);
    }
    }
    

class camionetas extends vehiculos{
    private int capacidadCarga;

    public camionetas() {
        super();
    }

    public camionetas(int capacidadCarga, String combustible, int numLlantas, double capacidadDeMotor, int cilindros, int pasajeros, String marca, String modelo, int año) {
        super(combustible, numLlantas, capacidadDeMotor, cilindros, pasajeros, marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

      @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Capacidad de carga: " + capacidadCarga);
    }
    
}