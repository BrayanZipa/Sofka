import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // ShuttleVehicles lanzadera = new ShuttleVehicles("navePrueba", 200, 500, "Hidrogeno");
        // lanzadera.menu();
        // System.out.println(lanzadera.functioning());
        // System.out.println(lanzadera.finalReport());

        Scanner keyboard = new Scanner(System.in);
        int n;

        do{
            System.out.println("MENU");
            System.out.println("1.Crear nueva nave\n2.Mostrar naves creadas\n3.Salir");
            n = keyboard.nextInt();
            System.out.println();
            switch (n) {
                case 1:
                    do{
                        System.out.println("CREACIÓN DE NAVES");
                        System.out.println("Que tipo de nave desea crear:\n1.Nave espacial no tripulada\n2.Nave espacial tripulada\n3.Volver al menú inicial");
                        n = keyboard.nextInt();
                        System.out.println();
                        switch (n) {
                            case 1:
                                
                                break;

                            case 2:
                                
                                break;

                            case 3:
                                n = -3;
                                break;
                        
                            default:
                                System.out.println("Valor ingresado no válido");
                                break;
                        }
                    }while(n != -3);
                    break;
                
                case 2:
                    
                    break;

                case 3:
                    System.out.println("Usted esta saliendo del programa, vuelva pronto.");
                    break;
            
                default:
                    System.out.println("Valor ingresado no válido");
                    break;
            }

        }while(n != 3);
    }
}
