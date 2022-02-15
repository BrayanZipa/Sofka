import java.util.ArrayList;

/**
 * Clase que hereda de la clase Vehicle y representa una moto.
 * @author Brayan Zipa
 */
public class Motorcycle extends Vehicle{
    /**
     * Lista que va a almacenar objetos de tipo Motorcycle.
     */
    private static ArrayList<Motorcycle> motorcycleList = new ArrayList<Motorcycle>();
    /**
     * Representa el cilindraje de la moto.
     */
    private String cylinderCapacity;

    /**
     * Contructor que permite que los atributos de la moto sean ingresados.
     * @param name
     * @param passengers
     * @param numberPassengers
     * @param displacementMedium
     * @param brand
     * @param model
     * @param color
     * @param cylinderCapacity
     */
    public Motorcycle(String name, boolean passengers, int numberPassengers, String displacementMedium, String brand, String model, String color, String cylinderCapacity) {
        super(name, passengers, numberPassengers, displacementMedium, brand, model, color);
        this.cylinderCapacity = cylinderCapacity;
    }
    
    /**
     * Devuelve el cilindraje actual de la moto.
     * @return Cilindraje de la moto.
     */
    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * Actualiza el cilindraje de la moto.
     * @param cylinderCapacity Nuevo cilindraje de la moto.
     */
    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * Método estático de la clase que permite almacenar los objetos creados en una lista.
     * @param motorcycle Objeto de tipo Motorcycle.
     */
    public static void addMotorcycle (Motorcycle motorcycle){
        Motorcycle.motorcycleList.add(motorcycle);
    }

    /**
     * Método estático de la clase que imprime por pantalla cada uno de los objetos tipo Motorcycle almacenados.
     */
    public static void getMotorcycleList() {
        for (Motorcycle motorcycle: motorcycleList) {
            System.out.println(motorcycle.report());
        }
    }

    /**
     * Método abtracto sobreescrito de la clase Vehicle, genera un informe del vehículo.
     */ 
    @Override
    public String report() {
        String report = "Nombre: " + super.getName() + "\nNúmero de pasajeros: " + super.getNumberPassengers() +
        "\nMedio de desplazamiento: " + super.getDisplacementMedium() + "\nMarca: " + super.getBrand() + 
        "\nModelo: " + super.getModel() + "\nColor: " + super.getColor() + "\nCilindraje: " + this.getCylinderCapacity() + "\n";
        return report;
    }   
}