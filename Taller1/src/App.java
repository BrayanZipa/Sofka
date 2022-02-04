import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); 
        Date fecha = new Date();    
        System.out.println(fecha); 

        Person persona = new Person("Juan","Diaz","Jimenez", fecha, 55.5f);

        System.out.println(persona.height); 
    }
}
