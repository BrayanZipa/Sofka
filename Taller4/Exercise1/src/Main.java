/**
 * Clase que prueba el funcionamiento de la clase PlanetarySystem.
 * @author Brayan Zipa
 */
public class Main {
    public static void main(String[] args) {

        PlanetarySystem sun = new PlanetarySystem("Sol", 1.989E30, 1410, 0, 0);
        PlanetarySystem earth = new PlanetarySystem("Planeta Tierra", 5.972E24, 0, 0, 0);
        PlanetarySystem moon = new PlanetarySystem("Luna", 7.349E22, 0, 0, 0);
        
        System.out.println(sun.toString() + "\n");
        System.out.println(earth.toString() + "\n");
        System.out.println(moon.toString() + "\n");

        System.out.println("Atracción gravitatoria entre el sol y la tierra: " + sun.gravityAttraction(earth, 1.496E11) + "\n");
        System.out.println("Atracción gravitatoria entre la tierra y la luna: " + earth.gravityAttraction(moon, 3.84E8) + "\n");
        System.out.println("Atracción gravitatoria entre la luna y el sol: " + moon.gravityAttraction(sun, 1.492E11) + "\n");
    }  
}