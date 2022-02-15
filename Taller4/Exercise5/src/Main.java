import java.util.Scanner;

/**
 * Clase Main que prueba el funcionamiento de la clase abstracta Vehicle y de las demás clases que heredan de esta.
 */
public class Main {
    /**
     * Variable que permite ingresar datos por consola.
     */
    public static Scanner keyboard = new Scanner(System.in);
    
    /**
     * Representa el nombre que se le da al vehículo.
     */
    public static String name;
    /**
     * Representa si el vehículo tiene o no pasajeros.
     */
    public static boolean passengers;
    /**
     * Representa el número de pasajeros que hay en el vehículo.
     */
    public static int numberPassengers;
    /**
     * Representa el medio por el cual se desplaza el vehículo.
     */
    public static String displacementMedium;
    /**
     * Representa la marca del vehículo.
     */
    public static String brand;
    /**
     * Representa el modelo del vehículo.
     */
    public static String model;
    /**
     * Representa el color del vehículo.
     */
    public static String color;
    /**
     * Representa una variable que va almacenar información aletoria dependiendo del tipo de vehículo que se ingrese.
     */
    public static String random;
    /**
     * Variable que representa la opción elegida por el usuario al rellenar la variable passengers.
     */
    public static int option;

    public static void main(String[] args) throws Exception {
        int n = 0;
        do{
            System.out.println("Menú de opciones\n");
            System.out.println("1. Ingresar un vehículo\n2. Mostrar lista de vehículos ingresados\n3. Salir");
            n = keyboard.nextInt();
            switch (n) {
                case 1:
                    do {
                        String vehicle = "";
                        System.out.println("Seleccione el vehículo que quiere ingresar\n"); 
                        menu();
                        n = keyboard.nextInt();
                        switch (n) {
                            case 1: 
                                vehicle = "del Carro";
                                System.out.println("CONTROL DE CARROS\n");  
                                captureInformation(vehicle);
                                System.out.println("Ingrese el número de puertas del carro");
                                random = keyboard.nextLine(); 
                                Car car = new Car(name, passengers, numberPassengers, displacementMedium, brand, model, color, random);
                                Car.addCar(car);
                                System.out.println();   
                                break;

                            case 2:
                                vehicle= "de la Motocicleta"; 
                                System.out.println("CONTROL DE MOTOCICLETAS\n");  
                                captureInformation(vehicle);
                                System.out.println("Ingrese el tipo de cilindraje de la Motocicleta");
                                random = keyboard.nextLine(); 
                                Motorcycle motorcycle = new Motorcycle(name, passengers, numberPassengers, displacementMedium, brand, model, color, random);
                                Motorcycle.addMotorcycle(motorcycle);
                                System.out.println();  
                                break;  

                            case 3:
                                vehicle = "del Camión";
                                System.out.println("CONTROL DE CAMIONES\n");
                                captureInformation(vehicle);
                                System.out.println("Ingrese la altura del Camión");
                                random = keyboard.nextLine(); 
                                Truck truck= new Truck(name, passengers, numberPassengers, displacementMedium, brand, model, color, random);
                                Truck.addTruck(truck);
                                System.out.println();        
                                break;

                            case 4: 
                                vehicle = "del Ferry";
                                System.out.println("CONTROL DE FERRYS\n");
                                captureInformation(vehicle);
                                System.out.println("Ingrese el destino del Ferry");
                                random = keyboard.nextLine();
                                Ferry ferry = new Ferry(name, passengers, numberPassengers, displacementMedium, brand, model, color, random);
                                Ferry.addFerry(ferry);
                                System.out.println();       
                                break;

                            case 5: 
                                vehicle = "de la Lancha";
                                System.out.println("CONTROL DE LANCHAS\n"); 
                                captureInformation(vehicle);
                                System.out.println("Ingrese el ancho de la Lancha");
                                random = keyboard.nextLine();
                                Launch launch = new Launch(name, passengers, numberPassengers, displacementMedium, brand, model, color, random);
                                Launch.addLaunch(launch);
                                System.out.println();       
                                break;

                            case 6: 
                                vehicle = "de la Bicicleta";
                                System.out.println("CONTROL DE BICICLETAS\n"); 
                                captureInformation(vehicle);
                                System.out.println("Ingrese el tipo de freno de la Bicicleta");
                                random = keyboard.nextLine();
                                Bicycle bicycle  = new Bicycle (name, passengers, numberPassengers, displacementMedium, brand, model, color, random);
                                Bicycle.addBicycle(bicycle);
                                System.out.println();       
                                break;

                            case 7: 
                                System.out.println();       
                                break;

                            default:
                                System.out.println("Opción no válida, intentelo nuevamente\n"); 
                                break;
                        }
                    } while (n != 7);
                    break;

                case 2:
                    do {
                        System.out.println("Seleccione la lista de vehículos ingresados que quire visualizar\n"); 
                        menu();
                        n = keyboard.nextInt();
                        switch (n) {
                            case 1:
                                System.out.println("LISTA DE CARROS INGRESADOS\n");
                                Car.getCarList();       
                                break;

                            case 2:  
                                System.out.println("LISTA DE MOTOCICLETAS INGRESADAS\n");
                                Motorcycle.getMotorcycleList();         
                                break;

                            case 3: 
                                System.out.println("LISTA DE CAMIONES INGRESADOS\n");
                                Truck.getTruckList();          
                                break;

                            case 4:  
                                System.out.println("LISTA DE FERRYS INGRESADOS\n");
                                Ferry.getFerryList();             
                                break;

                            case 5: 
                                System.out.println("LISTA DE LANCHAS INGRESADAS\n");
                                Launch.getLaunchList();
                                break;

                            case 6:
                                System.out.println("LISTA DE BICICLETAS INGRESADAS\n");
                                Bicycle.getBicycleList();         
                                break;

                            case 7: 
                                System.out.println();       
                                break;

                            default:
                                System.out.println("Opción no válida, intentelo nuevamente\n"); 
                                break;
                        }                       
                    } while (n != 7);    
                    break;
            
                case 3: 
                    System.out.println("Ha seleccionado salir, vuelva pronto\n");   
                    break;

                default:
                    System.out.println("Opción no válida, intentelo nuevamente\n");  
                    break;
            }
        }while(n != 3);
    }

    /**
     * Muestra por pantalla el menú de selección de vehículos.
     */
    public static void menu(){       
        System.out.println("1. Carro");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camión");
        System.out.println("4. Ferry");
        System.out.println("5. Lancha");
        System.out.println("6. Bicicleta");
        System.out.println("7. Regresar al menú principal");
    }

    /**
     * Permite almacenar los datos por teclado ingresados por el usuario.
     */
    public static void captureInformation(String vehicle){
        keyboard.nextLine();
        System.out.println("Ingrese el nombre " + vehicle);
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
        System.out.println("Ingrese el medio de desplazamiento " + vehicle);
        keyboard.nextLine();
        displacementMedium = keyboard.nextLine();
        System.out.println("Ingrese la marca " + vehicle);
        brand = keyboard.nextLine();
        System.out.println("Ingrese el modelo " + vehicle);
        model = keyboard.nextLine();
        System.out.println("Ingrese el color " + vehicle);
        color = keyboard.nextLine();
    }
}