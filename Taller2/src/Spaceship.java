/**
 * Es una clase abstracta que representa una abstracción de una nave espacial y los atributos que esta posee.
 * @author Brayan Zipa
 */
public abstract class Spaceship {
    /**
     * Representa el nombre de la nave espacial.
     */
    public String name;
    /**
     * Representa la potencia que genera la nave espacial al despegar.
     */
    public double power;
    /**
     * Representa la velocidad máxima que obtiene la nave espacial.
     */
    public double speed;
    /**
     * Representa el tipo de combustible que utiliza la nave espacial para funcionar.
     */
    public String fuel;

    /**
     * Contructor que permite que los atributos de la nave espacial sean ingresados.
     * @param name
     * @param power
     * @param speed
     * @param fuel
     */
    public Spaceship(String name, double power, double speed, String fuel) {
        this.name = name;
        this.power = power;
        this.speed = speed;
        this.fuel = fuel;
    }
 
    /**
     * Devuelve el nombre ingresado de la nave espacial.
     * @return Nombre de la nave espacial.
     */
    public String getName() {
        return name;
    }

    /**
     * Devuelve la potencia ingresada de la nave espacial.
     * @return Potencia de la nave espacial.
     */
    public double getPower() {
        return power;
    }

    /**
     * Devuelve la velocidad máxima ingresada de la nave espacial.
     * @return Velocidad máxima de la nave espacial.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Devuelve el combustible ingresado de la nave espacial.
     * @return Combustible de la nave espacial.
     */
    public String getFuel() {
        return fuel;
    }
    
    /**
     * Método abstracto que retorna un informe del combustible utilizado y la potencia y velocidad que se genera con este cuando la nave esta en funcionamiento.
     * @return Informe del combustible utilizado y la potencia y velocidad que se generan.
     */
    public abstract String functioning();
    
    /**
     * Método abstracto que muestra un menú con todas las misiones que puede realizar una nave espacial.
     */
    public abstract void menu();

    /**
     * Método abstracto que asigna una misión a la nave espacial.
     * @param num Opción del menú de misiones elegida por el usuario.
     */
    public abstract void mission(int num);

    /**
     * Devueleve la misión que se le asigna al vehículo lanzadera.
     * @return Misión actual que va a realizar la nave espacial.
     */
    public abstract String getMission();
 
    /**
     * /**
     * Método abstracto que retorna un informe final de la nave espacial creada.
     * @return Informe de los atributos de la nave y su misión a realizar.
     */
    public abstract String finalReport();    
}