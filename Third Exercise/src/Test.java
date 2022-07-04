import java.util.Scanner;

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
