/**
 * Clase que representa a una nave espacial tripulada.
 * @author Brayan Zipa
 */
public class MannedSpaceships extends Spaceship {
    /**
     * Representa el vehículo lanzadera que va a utilizar la nave para despegar.
     */
    public ShuttleVehicles shuttle;
    /**
     * Representa la misión que va a realizar la nave espacial tripulada.
     */
    public String mission;

    /**
     * Contructor que permite generar una instancia de la clase MannedSpaceships.
     * @param name
     * @param power
     * @param speed
     * @param fuel
     * @param shuttle
     */
    public MannedSpaceships(String name, double power, double speed, String fuel, ShuttleVehicles shuttle) {
        super(name, power, speed, fuel);
        this.shuttle = shuttle;
    }

    /**
     * Método abtracto sobreescrito de la clase Spaceship, genera un informe del funcionamiento de la nave.
     */  
    @Override
    public String functioning() {
        String ship = "La nave espacial es una nave tripulada que funciona con " + super.getFuel() + " como combustible, "
                   + "tiene una potencia de " + super.getPower() + " y alcanza una velocida máxima de " + super.getSpeed() + "km/h.";
        return ship;
    }

    /**
     * Método abtracto sobreescrito de la clase Spaceship, muestra un menú de las posibles misiones de la nave.
     */
    @Override
    public void menu() {
        String menu = "Seleccione la misión que va a realizar la nave tripulada\n"
        + "1. Exploración lunar\n"
        + "2. Experimentación y estudio del comportamiento humano en condiciones ingrávidas\n"
        + "3. Mantenimiento de satélites, acoplamientos y equipos electrónicos";

        System.out.println(menu);
    }

   /**
     * Método abtracto sobreescrito de la clase Spaceship, asigna la misión de la nave.
     */ 
    @Override
    public String mission(int num) {
        String option = "";
        if(num == 1){
            option = "Exploración lunar";
        } else if(num == 2){
            option = "Experimentación y estudio del comportamiento humano en condiciones ingrávidas";
        } else if (num == 3){
            option = "Mantenimiento de satélites, acoplamientos y equipos electrónicos";
        } else {
            option = "Misión no asignada";
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
                        + "Misión: " + this.getMission() + "\n"
                        + "Lanzadera: La nave será impulsada por la lanzadera " + this.shuttle.getName();
        return report;
    }
}
