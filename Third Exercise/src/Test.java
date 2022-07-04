import java.util.Scanner;

/**
 *Class that tests the program's functionalities
 *
 * @version 1.0.0 2022-07-03
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *
 * @since 1.0.0 2022-07-03
 *
 */

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        random.fillArray();
        random.printArray();

        System.out.println("Con que método deseas ordenar el array? :");
        System.out.println("1. Burbuja");
        System.out.println("2. QuickSort");

        int choise = in.nextInt();

        if(choise==1) {
            random.bubble();
        }else {
            random.quicksort(random.getRandomArray(), 0, (random.getRandomArray().length-1));
        }

        System.out.println("");
        System.out.println("Array Ordenado: ");
        random.printArray();
    }
}
