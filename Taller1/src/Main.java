import java.util.Date;
import java.util.ArrayList;

/**
 * Clase que prueba el funcionamiento de las demás clases.
 * @author Brayan Zipa
 */
public class Main {
    
    public static void main(String[] args) {
        
        /**
         * Funcionamiento de la clase Person.
         */      
        Date fecha = new Date(); 
        Person persona1 = new Person("Juan", "Diaz", "Jimenez", fecha, 58.5f);
         
        System.out.println(persona1.getName());
        persona1.setName("David");
        System.out.println(persona1.getName());
        System.out.println(persona1.dateBirth);
        
        /**
         * Funcionamiento de la clase Employee la cual hereda de la clase Person.
         */   
        System.out.println("----------------------------------------------------------------------------------------------------------");
        Employee empleado1 = new Employee("Luis", "Hernandez", "Salazar", fecha, 62.5f, "56894546", 1800000,"Analista Contable", "Contabilidad");
        System.out.println("Nombre: " + empleado1.getName() + " - Cargo: " + empleado1.getOccupation() + " - Salario: " + empleado1.getSalary());
        
        /**
         * Funcionamiento de la clase Fruit.
         */ 
        System.out.println("----------------------------------------------------------------------------------------------------------");
        ArrayList<String> listaColores = new ArrayList<>();
        listaColores.add("Rojo");
        listaColores.add("Verde");
        listaColores.add("Amarillo");
        
        Fruit fruta1 = new Fruit("Manzana", 150.2f, listaColores);
        
        System.out.println("Nombre: " + fruta1.getName() + " - Peso Promedio: " + fruta1.getAverageWeight());
        System.out.println("Lista de colores de la fruta: " + fruta1.getColors());
        fruta1.setColor(2, "Naranja");
        System.out.println("Lista de colores de la fruta actualizada: " + fruta1.getColors());
        
        /**
         * Funcionamiento de la clase BankAccount.
         */ 
        System.out.println("----------------------------------------------------------------------------------------------------------");
        BankAccount cuenta1 = new BankAccount(856653356, true);
        System.out.println("Número de cuenta: " + cuenta1.getAccountNumber() + " - Estado de la cuenta: " + cuenta1.state(cuenta1.isActivated()));
        
        /**
         * Funcionamiento de la clase Product.
         */ 
        System.out.println("----------------------------------------------------------------------------------------------------------");
        Product producto1 = new Product("Televisor", "2656326436", 1900000, 152);
        System.out.println("Nombre: " + producto1.getName() + " - Código: " + producto1.getBarcode() + " - Precio: " + producto1.getValue());
        
        /**
         * Funcionamiento de la clase Vehicle.
         */ 
        System.out.println("----------------------------------------------------------------------------------------------------------");
        Vehicle vehiculo1 = new Vehicle("Moto", false, "Pulsar", "2006" );
        System.out.println("Vehículo: " + vehiculo1.getType() + " - Marca: " + vehiculo1.getBrand() + " - Estado: " + vehiculo1.state(vehiculo1.isState()));
    }
    
}

