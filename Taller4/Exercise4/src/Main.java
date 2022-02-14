import java.util.Scanner;

/**
 * Clase Main que prueba el funcionamiento de la clase abstracta Vehicle y de la clase Ferry que extiende de esta.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        String name;
        boolean passengers;
        int numberPassengers;
        String displacementMedium;
        String brand;
        String model;
        String color;
        String destination;

        int option;

        for (int i = 1; i <= 10; i++) {
            System.out.println("CONTROL DE FERRYS\n");
            System.out.println("Ingrese el nombre del Ferry");
            name = keyboard.nextLine();
            System.out.println("¿El vehículo tiene pasajeros?\n1. Si\n2. No");
            option = keyboard.nextInt();
            if(option == 1){
                passengers = true;
                System.out.println("Ingrese el número de pasajeros");
                numberPassengers = keyboard.nextInt();
            }             
            else{
                passengers = false;
                numberPassengers = 0;
            }
            System.out.println("Ingrese el medio de desplazamiento del Ferry");
            keyboard.nextLine();
            displacementMedium = keyboard.nextLine();
            System.out.println("Ingrese la marca del Ferry");
            brand = keyboard.nextLine();
            System.out.println("Ingrese el modelo del Ferry");
            model = keyboard.nextLine();
            System.out.println("Ingrese el color del Ferry");
            color = keyboard.nextLine();
            System.out.println("Ingrese el destino del Ferry");
            destination = keyboard.nextLine();
            System.out.println();

            Ferry ferry = new Ferry(name, passengers, numberPassengers, displacementMedium, brand, model, color, destination);
            Ferry.addFerry(ferry);
        }  
        System.out.println("LISTA DE FERRYS INGRESADOS\n");
        Ferry.getFerryList();
    }
}
