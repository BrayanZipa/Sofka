import java.util.ArrayList;

/**
 * Representa una fruta y sus atributos.
 * @author Brayan Zipa
 */
public class Fruit {
    /**
     * Representa el nombre de la fruta.
     */
    public String name;
    /**
     * Representa el peso promedio de la fruta.
     */
    private float averageWeight;
    /**
     * Representa una lista de los diferentes colores que puede tener la fruta.
     */
    public ArrayList<String> colors;
    
    /**
     * Crea una instancia de la clase Fruta.
     * @param name
     * @param averageWeight
     * @param colors 
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    /**
     * Devuelve el nombre actual de la fruta.
     * @return Nombre actual de la fruta.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Devuelve el peso promedio actual de la fruta.
     * @return Peso promedio actual de la fruta.
     */
    public float getAverageWeight() {
        return this.averageWeight;
    }
    
    /**
     * Actualiza el peso promedio de la fruta.
     * @param averageWeight Nuevo peso promedio de la fruta.
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    
    /**
     * Devuelve una lista de los colores que puede tener la fruta.
     * @return Lista de los colores que puede tener la fruta.
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }
    
    /**
     * Actualiza un color de la lista de colores que puede tener la fruta.
     * @param i Posición en la lista donde esta ubicado el color a cambiar.
     * @param color Nuevo color de la fruta.
     */
    public void setColor(int i, String color) {
        this.colors.set(i, color);
    }  
}