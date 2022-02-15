/**
 * Es una clase abstracta que representa una abstracción de alguna clase de vehículo y los atributos que este posee.
 * @author Brayan Zipa
 */
public abstract class Vehicle {
    /**
     * Representa el nombre que se le da al vehículo.
     */
    private String name;
    /**
     * Representa si el vehículo tiene o no pasajeros.
     */
    private boolean passengers;
    /**
     * Representa el número de pasajeros que hay en el vehículo.
     */
    private int numberPassengers;
    /**
     * Representa el medio por el cual se desplaza el vehículo.
     */
    private String displacementMedium;
    /**
     * Representa la marca del vehículo.
     */
    private String brand;
    /**
     * Representa el modelo del vehículo.
     */
    private String model;
    /**
     * Representa el color del vehículo.
     */
    private String color;

    /**
     * Contructor que permite que los atributos del vehículo sean ingresados.
     * @param name
     * @param passengers
     * @param numberPassengers
     * @param displacementMedium
     * @param brand
     * @param model
     * @param color
     */
    public Vehicle(String name, boolean passengers, int numberPassengers, String displacementMedium, String brand, String model, String color) {
        this.name = name;
        this.passengers = passengers;
        this.numberPassengers = numberPassengers;
        this.displacementMedium = displacementMedium;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    /**
     * Devuelve el nombre actual del vehículo creado.
     * @return Nombre del vehículo.
     */
    public String getName() {
        return name;
    }

    /**
     * Actualiza el nombre del vehículo.
     * @param name Nuevo nombre del vehículo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve true o false dependiendo si el vehículo tiene o no pasajeros.
     * @return true o false.
     */
    public boolean isPassengers() {
        return passengers;
    }

    /**
     * Actualiza si hay o no pasajeros en el vehículo.
     * @param passengers true o false.
     */
    public void setPassengers(boolean passengers) {
        this.passengers = passengers;
    }

    /**
     * Devuelve el número de pasajeros actual del vehículo creado.
     * @return Número actual de pasajeros en el vehículo.
     */
    public int getNumberPassengers() {
        return numberPassengers;
    }

    /**
     * Actualiza el número de pasajeros en el vehículo.
     * @param numberPassengers Nuevo número de pasajeros.
     */
    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    /**
     * Devuelve el medio de desplazamiento actual del vehículo creado.
     * @return Medio de desplazamiento del vehículo.
     */
    public String getDisplacementMedium() {
        return displacementMedium;
    }

    /**
     * Actualiza el medio de desplazamiento del vehículo.
     * @param displacementMedium Nuevo medio de desplazamiento del vehículo.
     */
    public void setDisplacementMedium(String displacementMedium) {
        this.displacementMedium = displacementMedium;
    }

    /**
     * Devuelve la marca actual del vehículo creado.
     * @return Marca del vehículo.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Actualiza la marca del vehículo.
     * @param brand Nueva marca del vehículo.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Devuelve el modelo actual del vehículo creado.
     * @return Modelo del vehículo.
     */
    public String getModel() {
        return model;
    }

    /**
     * Actualiza el modelo del vehículo.
     * @param model Nuevo modelo del vehículo.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Devuelve el color actual del vehículo creado.
     * @return Color del vehículo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Actualiza el color del vehículo.
     * @param color Nuevo color del vehículo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *  Método abstracto que retorna un informe total del vehículo creado.
     * @return Informe del vehículo.
     */
    public abstract String report();
}