public class Random {
    private final int[] randomArray = new int[10];

    public void printArray() {
        for(int value: randomArray) {
            System.out.println("" + value);
        }
    }

    private void fillArray() {
        for (int x=0;x<randomArray.length;x++)
            randomArray[x] = (int) (Math.random()*20)+1;
    }

    private static void bubble(int[] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length - 1; y++) {
                int current = array[y],
                        next = array[y + 1];
                if (current > next) {
                    array[y] = next;
                    array[y + 1] = current;
                }
            }
        }
    }

    private static void quicksort(int[] array, int izquierda, int derecha) {
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
