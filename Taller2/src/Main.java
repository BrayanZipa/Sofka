import java.util.Scanner;
import java.util.ArrayList;

/**
 * Clase Main que prueba el funcionamiento de la clase abstracta y de las clases que extienden de esta.
 */
public class Main {

    public static Scanner keyboard = new Scanner(System.in);

    /**
     * Representa el nombre de la nave espacial.
     */
    public static String name = "";
    /**
     * Representa la potencia que genera la nave espacial al despegar.
     */
    public static double power = 0;
    /**
     * Representa la velocidad máxima que obtiene la nave espacial.
     */
    public static double speed = 0;
    /**
     * Representa el tipo de combustible que utiliza la nave espacial para funcionar.
     */
    public static String fuel = ""; 

    /**
     * Lista que va a almacenar los objetos de tipo ShuttleVehicles (Vehículos lanzadera).
     */
    public static ArrayList<ShuttleVehicles> ships1 = new ArrayList<ShuttleVehicles>();
    /**
     * Lista que va a almacenar los objetos de tipo UnmannedSpaceships (Nave espacial no tripulada).
     */
    public static ArrayList<UnmannedSpaceships> ships2 = new ArrayList<UnmannedSpaceships>();
    /**
     * Lista que va a almacenar los objetos de tipo MannedSpaceships (Nave espacial tripulada).
     */
    public static ArrayList<MannedSpaceships> ships3 = new ArrayList<MannedSpaceships>();
    
    public static void main(String[] args) {
        int n;

        do{
            System.out.println("MENU");
            System.out.println("1. Crear nueva nave\n2. Mostrar naves creadas\n3. Salir");
            n = keyboard.nextInt();
            System.out.println();
            switch (n) {
                case 1:
                    do{
                        System.out.println("CREACIÓN DE NAVES");
                        System.out.println("Que tipo de nave desea crear:\n1. Nave espacial no tripulada\n2. Nave espacial tripulada\n3. Volver al menú inicial");
                        n = keyboard.nextInt();
                        System.out.println();
                        ShuttleVehicles shuttleVehicle;
                        switch (n) {
                            case 1:
                                System.out.println("NAVE ESPACIAL NO TRIPULADA");
                                System.out.println("Crear el vehículo lanzadera que propulsará la nave.\n");  
                                requestData();
                                shuttleVehicle = createObjectShuttleVehicle(n);
                                System.out.println("\nCrear la nave espacial no tripulada.");
                                requestData();
                                createObjectSpaceship(n, shuttleVehicle);
                                break;

                            case 2:
                                System.out.println("NAVE ESPACIAL TRIPULADA");
                                System.out.println("Crear el vehículo lanzadera que propulsará la nave.\n");  
                                requestData();
                                shuttleVehicle = createObjectShuttleVehicle(n);
                                System.out.println("\nCrear la nave espacial tripulada."); 
                                requestData();
                                createObjectSpaceship(n, shuttleVehicle);
                                break;

                            case 3:
                                n = -3;
                                break;
                        
                            default:
                                System.out.println("Valor ingresado no válido\n");
                                break;
                        }
                    }while(n != -3);
                    break;
                
                case 2:
                    do{
                        System.out.println("NAVES CREADAS");
                        System.out.println("Elija el tipo de nave que desea visualizar:\n1. Vehículo lanzadera\n2. Nave espacial no tripulada\n3. Nave espacial tripulada\n4. Volver al menú inicial");
                        n = keyboard.nextInt();
                        System.out.println();
                        switch (n) {
                            case 1:
                                System.out.println("Vehículos lanzadera creados\n");
                                for (int i = 0; i < ships1.size(); i++) {
                                    System.out.println(ships1.get(i).finalReport() + "\n");
                                }
                                break;

                            case 2:
                                System.out.println("Naves espaciales no tripuladas creadas\n");
                                for (int i = 0; i < ships2.size(); i++) {
                                    System.out.println(ships2.get(i).finalReport() + "\n");
                                }
                                break;

                            case 3:
                                System.out.println("Naves espaciales tripuladas creadas\n");
                                for (int i = 0; i < ships3.size(); i++) {
                                    System.out.println(ships3.get(i).finalReport() + "\n");
                                }
                                break;

                            case 4:
                                n = -4;
                                break;
                        
                            default:
                                System.out.println("Valor ingresado no válido\n");
                                break;
                        }
                    }while(n != -4);
                    break;

                case 3:
                    System.out.println("Usted esta saliendo del programa, vuelva pronto.");
                    break;
            
                default:
                    System.out.println("Valor ingresado no válido\n");
                    break;
            }

        }while(n != 3);
    }

    /**
     * Método que permite pedir datos al usuario y almacenarlos en las variables declaradas.
     */
    public static void requestData(){                  
        System.out.println("Ingrese el nombre de la nave");
        name = keyboard.next();
        System.out.println("Ingrese la potencia de la nave");
        power = keyboard.nextDouble();
        System.out.println("Ingrese la velocidad máxima de la nave");
        speed = keyboard.nextDouble();
        System.out.println("Ingrese el combustible que utiliza la nave");
        fuel = keyboard.next();
    }

    /**
     * Método que crea, guarda y devuelve un objeto de tipo ShuttleVehicles (Vehículos lanzadera).
     * @param n Tipo de nave que selecciona el usuario, 1.Nave espacial no tripulada o 2.Nave espacial tripulada.
     * @return Objeto de tipo ShuttleVehicles
     */
    public static ShuttleVehicles createObjectShuttleVehicle(int n){      
        ShuttleVehicles shuttle = new ShuttleVehicles(name, power,speed, fuel);
        shuttle.mission(n);
        ships1.add(shuttle);
        System.out.println("Vehículo lanzadera " + shuttle.getName() + " creado");
        return shuttle;  
    }

    /**
     * Método que crea y guarda un objeto de tipo UnmannedSpaceships (Nave espacial no tripulada) o MannedSpaceships (Nave espacial tripulada).
     * @param n Tipo de nave que selecciona el usuario, 1.Nave espacial no tripulada o 2.Nave espacial tripulada.
     * @param shuttle Objeto de tipo ShuttleVehicles (Vehículos lanzadera).
     */
    public static void createObjectSpaceship(int n, ShuttleVehicles shuttle){
        if(n == 1){
            UnmannedSpaceships spaceShip = new UnmannedSpaceships(name, power,speed, fuel, shuttle);
            spaceShip.menu();
            n = keyboard.nextInt();
            spaceShip.mission(n);
            ships2.add(spaceShip);
            System.out.println("Nave espacial " + spaceShip.getName() + " no tripulada creada\n");
        } else{
            MannedSpaceships spaceShip = new MannedSpaceships(name, power,speed, fuel, shuttle);
            spaceShip.menu();
            n = keyboard.nextInt();
            spaceShip.mission(n);
            ships3.add(spaceShip);
            System.out.println("Nave espacial " + spaceShip.getName() + " tripulada creada\n");
        }
    }
}