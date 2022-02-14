import java.util.Random;

/**
 * Clase que genera un Array con números reales aletorios y lo ordena mediante sus métodos.
 * @author Brayan Zipa
 */
public class RandomArray {
    /**
     * Representa el número de posiciones que tendrá el Array.
     */
    public int positions;
    /**
     * Representa un Array que almacenará números reales aleatorios.
     */
    private double[] randomArray;

    /**
     * Contructor que permite crear una instancia de la clase RandomArray.
     * @param positions
     */
    public RandomArray(int positions) {
        this.positions = positions;
        this.randomArray = new double[positions];
        generateArray(randomArray);
    }
    
    /**
     * Devuelve el Array de números reales aleatorios que se haya creado.
     * @return Array de números reales aleatorios.
     */
    public double[] getRandomArray() {
        return randomArray;
    }

    /**
     * Genera números reales aleatorios en cada una de las posiciones del Array creado.
     * @param array
     * @return Array de números reales aleatorios.
     */
    public double[] generateArray(double[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * random.nextInt(1000);
        }
        return array;
    }

    /**
     * Muestra por consola el orden actual de los elementos del Array.
     * @param array Array de números reales.
     */
    public void showArray(double[] array){
        for (double position : array) {
            System.out.print(position + "  ");
        }
    }

    /**
     * Ordena los elementos del Array de menor a mayor mediante el método Burbuja.
     * @param array Array de números reales aleatorios.
     * @return Array de números reales ordenado de menor a mayor.
     */
    public double[] bubbleMethod(double[] array){
        double aux;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]){  
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        return array;
    }

    /**
     * Ordena los elementos del Array de menor a mayor mediante el método Quick Sort.
     * @param array Array de números reales aleatorios.
     * @param izq Primera posicición del Array (cero).
     * @param der Cantidad total de elementos en el Array.
     * @return Array de números reales ordenado de menor a mayor.
     */
    public double[] quickSortMethod(double array[], int izq, int der) {
        if(izq>=der){
            return array;
        }
        int i = izq, d = der;
        if(izq != der){
            int pivot;
            double aux;
            pivot = izq;

            while (izq != der) {
                while(array[der] >= array[pivot] && izq<der)
                    der--;
                    while(array[izq] < array[pivot] && izq<der)
                        izq++;
                
                if(der != izq){
                    aux = array[der];
                    array[der] = array[izq];
                    array[izq] = aux;
                }
                if(izq == der){
                    quickSortMethod(array, i, izq-1);   
                    quickSortMethod(array, izq+1, d);  
                }
            }   
        } else {
            return array;
        }  
        
        return array;     
    }
}