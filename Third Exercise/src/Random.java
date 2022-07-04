/**
 *Random class that allows you to have an array with random numbers inside and sorting methods.
 *
 * @version 1.0.0 2022-07-03
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *
 * @since 1.0.0 2022-07-03
 *
 */

public class Random {
    private final int[] randomArray = new int[10];

    public int[] getRandomArray() {
        return randomArray;
    }

    /**
     * Method that prints the array values
     */
    public void printArray() {
        for(int value: randomArray) {
            System.out.println("" + value);
        }
    }

    /**
     * Method that adds random numbers to the array
     */
    public void fillArray() {
        for (int x=0;x<randomArray.length;x++)
            randomArray[x] = (int) (Math.random()*20)+1;
    }

    /**
     * Bubble sorting method
     */
    public void bubble() {
        for (int x = 0; x < this.randomArray.length; x++) {
            for (int y = 0; y < this.randomArray.length - 1; y++) {
                int current = this.randomArray[y],
                        next = this.randomArray[y + 1];
                if (current > next) {
                    this.randomArray[y] = next;
                    this.randomArray[y + 1] = current;
                }
            }
        }
    }

    /**
     * Quicksort ordering method
     * @param array
     * @param izquierda
     * @param derecha
     */
    public void quicksort(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(array, izquierda, derecha);
            quicksort(array, izquierda, indiceParticion);
            quicksort(array, indiceParticion + 1, derecha);
        }
    }

    private static int particion(int arreglo[], int izquierda, int derecha) {
        int pivote = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }
}
