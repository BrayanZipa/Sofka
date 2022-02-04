/**
 * Representa un vehículo y las especificaciones que lo componen.
 * @author Brayan Zipa
 */
public class Vehicle {
    /**
     * Representa el tipo de vehículo (carro, moto, camión, etc).
     */
    public String type;
    /**
     * Representa el estado del vehículo (usado o nuevo).
     */
    public boolean state;
    /**
     * Representa el nombre de la marca del vehículo.
     */
    public String brand;
    /**
     * Representa el modelo del vehículo.
     */
    public String model;

    /**
     * Crea una instancia de la clase Vehicle.
     * @param type
     * @param state
     * @param brand
     * @param model 
     */
    public Vehicle(String type, boolean state, String brand, String model) {
        this.type = type;
        this.state = state;
        this.brand = brand;
        this.model = model;
    }

    /**
     * Devuelve el tipo actual del vehículo.
     * @return Tipo actual del vehículo.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Actualiza el tipo de vehículo.
     * @param type Nuevo tipo de vehículo.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Devuelve el estado actual del vehículo.
     * @return true o false.
     */
    public boolean isState() {
        return this.state;
    }

    /**
     * Actualiza el estado del vehículo.
     * @param state Nuevo estado true o false.
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * Devuelve el nombre de la marca del vehículo.
     * @return Nombre de la marca del vehículo.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Devuelve el modelo del vehículo.
     * @return Modelo del vehículo.
     */
    public String getModel() {
        return this.model;
    }
    
    /**
     * Devuelve si el vehículo es Usado o Nuevo dependiendo del estado actual del vehículo.
     * @param state Estado actual del vehículo.
     * @return Nuevo o Usado.
     */
    public String state(boolean state) {
        if(state){
            return "Nuevo";
        } else{
            return "Usado";
        }     
    }   
}