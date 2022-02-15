import java.util.ArrayList;

/**
 * Clase que hereda de la clase Vehicle y representa una lancha.
 * @author Brayan Zipa
 */
public class Launch extends Vehicle {
    /**
     * Lista que va a almacenar objetos de tipo Launch.
     */
    private static ArrayList<Launch> launchList = new ArrayList<Launch>();
    /**
     * Representa el ancho de la lancha.
     */
    private String width;

    /**
     * Contructor que permite que los atributos de la lancha sean ingresados.
     * @param name
     * @param passengers
     * @param numberPassengers
     * @param displacementMedium
     * @param brand
     * @param model
     * @param color
     * @param width
     */
    public Launch(String name, boolean passengers, int numberPassengers, String displacementMedium, String brand, String model, String color, String width) {
        super(name, passengers, numberPassengers, displacementMedium, brand, model, color);
        this.width = width;
    }
 
    /**
     * Devuelve el ancho actual de la lancha.
     * @return Ancho de la lancha.
     */
    public String getWidth() {
        return width;
    }

    /**
     * Actualiza el ancho de la lancha.
     * @param width Nuevo ancho de la lancha.
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * Método estático de la clase que permite almacenar los objetos creados en una lista.
     * @param launch Objeto de tipo Launch.
     */
    public static void addLaunch(Launch launch){
        Launch.launchList.add(launch);
    }

    /**
     * Método estático de la clase que imprime por pantalla cada uno de los objetos tipo Launch almacenados.
     */
    public static void getLaunchList() {
        for (Launch launch: launchList) {
            System.out.println(launch.report());
        }
    }

    /**
     * Método abtracto sobreescrito de la clase Vehicle, genera un informe del vehículo.
     */ 
    @Override
    public String report() {
        String report = "Nombre: " + super.getName() + "\nNúmero de pasajeros: " + super.getNumberPassengers() +
        "\nMedio de desplazamiento: " + super.getDisplacementMedium() + "\nMarca: " + super.getBrand() + 
        "\nModelo: " + super.getModel() + "\nColor: " + super.getColor() + "\nAncho: " + this.getWidth() + "\n";
        return report;
    } 
}