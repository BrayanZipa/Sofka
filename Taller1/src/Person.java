import java.util.Date;

/**
 * 
 */
public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    
    public String getName(){
        return this.name;
    }

    
    public void setName(String name){
        this.name = name;
    } 
}