import java.util.ArrayList;

/**
 * Clase que hereda de la clase Vehicle y representa un carro.
 * @author Brayan Zipa
 */
public class Car extends Vehicle {
    /**
     * Lista que va a almacenar objetos de tipo Car.
     */
    private static ArrayList<Car> carList = new ArrayList<Car>();
    /**
     * Representa el número de puertas que tiene el carro.
     */
    private String numDoors;

    /**
     * Contructor que permite que los atributos del carro sean ingresados.
     * @param name
     * @param passengers
     * @param numberPassengers
     * @param displacementMedium
     * @param brand
     * @param model
     * @param color
     * @param numDoors
     */
    public Car(String name, boolean passengers, int numberPassengers, String displacementMedium, String brand, String model, String color, String numDoors) {
        super(name, passengers, numberPassengers, displacementMedium, brand, model, color);
        this.numDoors = numDoors;
    }

    /**
     * Devuelve el número actual de puertas que tiene el carro.
     * @return Número de puertas del carro.
     */
    public String getNumDoors() {
        return numDoors;
    }

    /**
     * Actualiza el número de puertas del carro.
     * @param numDoors Nuevo número de puertas del carro.
     */
    public void setNumDoors(String numDoors) {
        this.numDoors = numDoors;
    }

    /**
     * Método estático de la clase que permite almacenar los objetos creados en una lista.
     * @param car Objeto de tipo Car.
     */
    public static void addCar(Car car){
        Car.carList.add(car);
    }

    /**
     * Método estático de la clase que imprime por pantalla cada uno de los objetos tipo Car almacenados.
     */
    public static void getCarList() {
        for (Car car : carList) {
            System.out.println(car.report());
        }
    }

    /**
     * Método abtracto sobreescrito de la clase Vehicle, genera un informe del vehículo.
     */ 
    @Override
    public String report() {
        String report = "Nombre: " + super.getName() + "\nNúmero de pasajeros: " + super.getNumberPassengers() +
        "\nMedio de desplazamiento: " + super.getDisplacementMedium() + "\nMarca: " + super.getBrand() + 
        "\nModelo: " + super.getModel() + "\nColor: " + super.getColor() + "\nNúmero de puertas: " + this.getNumDoors() + "\n";
        return report;
    } 
}