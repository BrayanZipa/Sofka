import java.util.Date;

/**
 * Representa a una persona y la información que esta posee.
 * @author Brayan Zipa
 */
public class Person {
    /**
     * Representa el nombre de la persona.
     */
    public String name;
    /**
     * Representa el primer apellido de la persona.
     */
    public String lastName1;
    /**
     * Representa el segundo apellido de la persona.
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento de la persona.
     */
    public Date dateBirth;
    /**
     * Representa la altura de la persona.
     */
    public float height;

    /**
     * Crea una instancia de la clase Persona.
     * @param name 
     * @param lastName1
     * @param lastName2
     * @param dateBirth
     * @param height 
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    
    /**
     * Devuelve el nombre de la persona actual.
     * @return Nombre actual de la persona.
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Actualiza el nombre de la persona.
     * @param name Nuevo nombre de la persona.
     */
    public void setName(String name){
        this.name = name;
    } 
}