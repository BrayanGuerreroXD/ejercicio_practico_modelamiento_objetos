import java.util.Scanner;
import java.util.Vector;

/**
 *Class that tests the program's functionalities
 *
 * @version 1.0.0 2022-07-04
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *
 * @since 1.0.0 2022-07-04
 *
 */

public class Test {
    private Vector vector = new Vector(20, 1);

    public void printNumbers() {
        for (Object number: vector) {
            System.out.println(""+number);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Scanner sc = new Scanner(System.in);

        System.out.println("Agrega numeros:");
        while(true) {
            int number = sc.nextInt();
            if(!test.vector.contains(number)) {
                test.vector.add(number);
            }else {
                System.out.println("-----------");
                System.out.println("Listado: ");
                test.printNumbers();
                break;
            }
        }
    }
}