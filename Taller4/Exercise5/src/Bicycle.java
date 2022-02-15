import java.util.ArrayList;

/**
 * Clase que hereda de la clase Vehicle y representa una bicicleta.
 * @author Brayan Zipa
 */
public class Bicycle extends Vehicle{
    /**
     * Lista que va a almacenar objetos de tipo Bicycle.
     */
    private static ArrayList<Bicycle> bicycleList = new ArrayList<Bicycle>();
    /**
     * Representa el tipo de freno de la bicicleta (pastillas, disco, piñon fijo, etc).
     */
    private String brakeType;

    /**
     * Contructor que permite que los atributos de la bicicleta sean ingresados.
     * @param name
     * @param passengers
     * @param numberPassengers
     * @param displacementMedium
     * @param brand
     * @param model
     * @param color
     * @param brakeType
     */
    public Bicycle(String name, boolean passengers, int numberPassengers, String displacementMedium, String brand, String model, String color, String brakeType) {
        super(name, passengers, numberPassengers, displacementMedium, brand, model, color);
        this.brakeType = brakeType;
    }
  
    /**
     * Devuelve el tipo de freno actual de la bicicleta.
     * @return Tipo de freno de la bicicleta.
     */
    public String getBrakeType() {
        return brakeType;
    }

    /**
     * Actualiza el tipo de freno actual de la bicicleta.
     * @param brakeType Nuevo tipo de freno de la bicicleta.
     */
    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    /**
     * Método estático de la clase que permite almacenar los objetos creados en una lista.
     * @param bicycle Objeto de tipo Bicycle.
     */
    public static void addBicycle(Bicycle bicycle){
        Bicycle.bicycleList.add(bicycle);
    }

    /**
     * Método estático de la clase que imprime por pantalla cada uno de los objetos tipo Bicycle almacenados.
     */
    public static void getBicycleList() {
        for (Bicycle bicycle: bicycleList) {
            System.out.println(bicycle.report());
        }
    }

    /**
     * Método abtracto sobreescrito de la clase Vehicle, genera un informe del vehículo.
     */ 
    @Override
    public String report() {
        String report = "Nombre: " + super.getName() + "\nNúmero de pasajeros: " + super.getNumberPassengers() +
        "\nMedio de desplazamiento: " + super.getDisplacementMedium() + "\nMarca: " + super.getBrand() + 
        "\nModelo: " + super.getModel() + "\nColor: " + super.getColor() + "\nTipo de freno: " + this.getBrakeType() + "\n";
        return report;
    }    
}