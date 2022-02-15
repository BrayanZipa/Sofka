import java.util.ArrayList;

/**
 * Clase que hereda de la clase Vehicle y representa a un Ferry o barco.
 * @author Brayan Zipa
 */
public class Ferry extends Vehicle {
    /**
     * Lista que va a almacenar objetos de tipo Ferry.
     */
    private static ArrayList<Ferry> ferryList = new ArrayList<Ferry>();
    /**
     * Representa el destino o a donde se dirije el Ferry.
     */
    private String destination;

    /**
     * Contructor que permite que los atributos del Ferry sean ingresados.
     * @param name
     * @param passengers
     * @param numberPassengers
     * @param displacementMedium
     * @param brand
     * @param model
     * @param color
     * @param destination
     */
    public Ferry(String name, boolean passengers, int numberPassengers, String displacementMedium, String brand, String model, String color, String destination) {
        super(name, passengers, numberPassengers, displacementMedium, brand, model, color);
        this.destination = destination;
    }

    /**
     * Devuelve el destino actual del ferry.
     * @return Destino del ferry.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Actualiza el destino del ferry.
     * @param destination Nuevo destino del ferry.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Método estático de la clase que permite almacenar los objetos creados en una lista.
     * @param ferry Objeto de tipo Ferry.
     */
    public static void addFerry(Ferry ferry){
        Ferry.ferryList.add(ferry);
    }

    /**
     * Método estático de la clase que imprime por pantalla cada uno de los objetos tipo Ferry almacenados.
     */
    public static void getFerryList() {
        for (Ferry ferry : ferryList) {
            System.out.println(ferry.report());
        }
    }

    /**
     * Método abtracto sobreescrito de la clase Vehicle, genera un informe del vehículo.
     */ 
    @Override
    public String report() {
        String report = "Nombre: " + super.getName() + "\nNúmero de pasajeros: " + super.getNumberPassengers() +
        "\nMedio de desplazamiento: " + super.getDisplacementMedium() + "\nMarca: " + super.getBrand() + 
        "\nModelo: " + super.getModel() + "\nColor: " + super.getColor() + "\nDestino del Ferry: " + this.getDestination() + "\n";
        return report;
    }
}