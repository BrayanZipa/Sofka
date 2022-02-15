import java.util.ArrayList;

/**
 * Clase que hereda de la clase Vehicle y representa un camión.
 * @author Brayan Zipa
 */
public class Truck extends Vehicle{
    /**
     * Lista que va a almacenar objetos de tipo Truck.
     */
    private static ArrayList<Truck> truckList = new ArrayList<Truck>();
    /**
     * Representa la altura del camión.
     */
    private String height;

    /**
     * Contructor que permite que los atributos del camión sean ingresados.
     * @param name
     * @param passengers
     * @param numberPassengers
     * @param displacementMedium
     * @param brand
     * @param model
     * @param color
     * @param height
     */
    public Truck(String name, boolean passengers, int numberPassengers, String displacementMedium, String brand, String model, String color, String height) {
        super(name, passengers, numberPassengers, displacementMedium, brand, model, color);
        this.height = height;
    }

    /**
     * Devuelve la altura actual del camión.
     * @return Altura del camión.
     */
    public String getHeight() {
        return height;
    }

    /**
     * Actualiza la altura del camión.
     * @param height Nueva altura del camión.
     */
    public void setHeight(String height) {
        this.height = height;
    }


    /**
     * Método estático de la clase que permite almacenar los objetos creados en una lista.
     * @param truck Objeto de tipo Truck.
     */
    public static void addTruck(Truck truck){
        Truck.truckList.add(truck);
    }

    /**
     * Método estático de la clase que imprime por pantalla cada uno de los objetos tipo Truck almacenados.
     */
    public static void getTruckList() {
        for (Truck truck: truckList) {
            System.out.println(truck.report());
        }
    }

    /**
     * Método abtracto sobreescrito de la clase Vehicle, genera un informe del vehículo.
     */ 
    @Override
    public String report() {
        String report = "Nombre: " + super.getName() + "\nNúmero de pasajeros: " + super.getNumberPassengers() +
        "\nMedio de desplazamiento: " + super.getDisplacementMedium() + "\nMarca: " + super.getBrand() + 
        "\nModelo: " + super.getModel() + "\nColor: " + super.getColor() + "\nAltura: " + this.getHeight() + "\n";
        return report;
    } 
}