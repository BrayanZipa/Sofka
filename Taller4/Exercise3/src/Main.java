import java.util.Scanner;

/**
 * Clase que prueba el funcionamiento de la clase RandomArray.
 * @author Brayan Zipa
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int option = 0, positions = 0;       
        do{
            System.out.println("Ingrese cuantos números quiere que tenga el Array aleatorio");
            positions = keyboard.nextInt();
            RandomArray random = new RandomArray(positions);
            System.out.println("\nArray aleatorio generado\n");
            random.showArray(random.getRandomArray());

            System.out.println("\n\nElija la opción con la cual desea ordenar el Array aletorio generado\n");
            System.out.println("1. Ordenar Array mediante el método burbuja\n2. Ordenar array mediante el método Quick Sort\n3. Salir");
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\nMétodo Burbuja\n");
                    random.showArray(random.bubbleMethod(random.getRandomArray()));
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("\nMétodo Quick Sort\n");
                    random.showArray(random.quickSortMethod(random.getRandomArray(), 0, random.getRandomArray().length-1));
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("Usted ha selecionado salir");
                    break;
                
                default:
                     System.out.println("\nOpción no válida\n");
                    break;
            }
            
        }while(option != 3);   
    }  
}

