/**
 * Clase que genera una abtracción de un sistema planetario.
 * @author Brayan Zipa
 */
public class PlanetarySystem {
    /**
     * Representa la constante de gravitación universal.
     */
    final double gravitationalConstant = 6.67E-11;
    /**
     * Representa un contador que ira sumando cada vez que se crre un objeto de esta clase.
     */
    static int identifier = 0;
    /**
     * Representa el identificador del planeta o cuerpo celeste creado.
     */
    protected int id;
    /**
     * Representa el nombre del planeta o cuerpo celeste creado.
     */
    protected String name;
    /**
     * Representa la masa del planeta o cuerpo celeste creado.
     */
    protected double mass;
    /**
     * Representa la densidad del planeta o cuerpo celeste creado.
     */
    protected double density;
    /**
     * Representa el diámetro del planeta o cuerpo celeste creado.
     */
    protected double diameter;
    /**
     * Representa la distancia al sol del planeta o cuerpo celeste creado.
     */
    protected double distanceToSun;

    /**
     * Contructor que permite crear una instancia de la clase PlanetarySystem.
     * @param name
     * @param mass
     * @param density
     * @param diameter
     * @param distanceToSun
     */
    public PlanetarySystem(String name, double mass, double density, double diameter, double distanceToSun) {
        this.id = ++PlanetarySystem.identifier;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
    }

    public String toString(){
        String information = "Nombre: " + this.name + "\nIdentificador: " + this.id + "\nMasa: " + this.mass;
        return information ;
    }

    /**
     * Devuelve el valor de la atracción gravitatoria entre el planeta o cuerpo celeste creado y otro que se le pasa como argumento.
     * @param object Planeta o cuerpo celeste con el que se quiere calcular la atracción gravitatoria.
     * @param distance Distancia entre los dos planetas o cuerpos celestes.
     * @return Valor de la atracción gravitatoria.
     */
    public double gravityAttraction(PlanetarySystem object, double distance){
        double value = 0;
        value = (this.gravitationalConstant*this.mass*object.mass)/Math.pow(distance, 2);
        return value ;
    }    
}