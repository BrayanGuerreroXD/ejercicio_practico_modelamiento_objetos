import java.util.ArrayList;
import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        int aux = 2;

        while(aux != 0) {
            System.out.println("Agrega un nuevo vehiculo:");
            System.out.print("Numero de pasajeros: ");
            int numPassangers = sc.nextInt();
            System.out.print("Numero de llantas: ");
            int numWheels = sc.nextInt();
            System.out.print("Fecha de Matricula (dd-mm-yyyy): ");
            String enrollmentDate = sc.next();
            System.out.print("Medio por el que se transporta: ");
            String environment = sc.next();

            vehicles.add(new Vehicle(numPassangers, numWheels, enrollmentDate, environment));

            aux--;
        }

        for(Vehicle vehicle: vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("------------------");
        }
    }
}
