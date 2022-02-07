/**
 * Clase que representa a un vehículo lanzadera, un tipo de nave espacial cruzial para el lanzamiento de naves espaciales.
 * @author Brayan Zipa
 */
public class ShuttleVehicles extends Spaceship {
    /**
     * Representa la misión que va a realizar el vehículo lanzadera.
     */
    public String mission;

    /**
     * Contructor que permite generar una instancia de la clase ShuttleVehicles.
     * @param name
     * @param power
     * @param speed
     * @param fuel
     */
    public ShuttleVehicles(String name, double power, double speed, String fuel) {
        super(name, power, speed, fuel);
    }

    /**
     * Método abtracto sobreescrito de la clase Spaceship, genera un informe del funcionamiento de la nave.
     */  
    @Override
    public String functioning() {
        String ship = "La nave espacial es un vehículo lanzadera que funciona con " + super.getFuel() + " como combustible, "
                   + "tiene una potencia de " + super.getPower() + " y alcanza una velocida máxima de " + super.getSpeed() + "km/h.";
        return ship;
    }

    /**
     * Método abtracto sobreescrito de la clase Spaceship, muestra un menú de las posibles misiones de la nave.
     */
    @Override
    public void menu(){
        String menu = "Seleccione la misión que va a realizar el vehículo lanzadera\n"
        + "1. Propulsar una nave espacial no tripulada\n"
        + "2. Propulsar una nave espacial tripulada";

        System.out.println(menu);
    };

    /**
     * Método abtracto sobreescrito de la clase Spaceship, asigna la misión de la nave.
     */  
    @Override
    public String mission(int num) {
        String option = "";
        if(num == 1){
            option = "Propulsar una nave espacial no tripulada";
        } else {
            option = "Propulsar una nave espacial tripulada";
        }

        return option;
    }

    /**
     * Método abtracto sobreescrito de la clase Spaceship, devuelve la misión actual de la nave.
     */    
    @Override
    public String getMission() {
        return mission;
    }

    /**
     * Método abtracto sobreescrito de la clase Spaceship, genera un informe final de lo que compone y va realizar la nave.
     */   
    @Override
    public String finalReport() {
        String report = "Nave: " + super.getName() + "\n"
                        + "Funcionalidad: " + this.functioning() + "\n"
                        + "Misión: " + this.getMission();
        return report;
    } 
}