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
    Scanner sc = new Scanner(System.in);
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addCar() {
        System.out.println("Agrega un nuevo automovil:");
        System.out.print("Numero de pasajeros: ");
        int numPassangers = sc.nextInt();
        System.out.print("Numero de llantas: ");
        int numWheels = sc.nextInt();
        System.out.print("Fecha de Matricula (dd-mm-yyyy): ");
        String enrollmentDate = sc.next();

        vehicles.add(new Car(numPassangers, numWheels, enrollmentDate));
    }

    public void addMotorcycle() {
        System.out.println("Agrega una nuevo motocicleta:");
        System.out.print("Numero de pasajeros: ");
        int numPassangers = sc.nextInt();
        System.out.print("Numero de llantas: ");
        int numWheels = sc.nextInt();
        System.out.print("Fecha de Matricula (dd-mm-yyyy): ");
        String enrollmentDate = sc.next();
        System.out.print("Capacidad de cilindraje: ");
        int cylinderCapacity = sc.nextInt();

        vehicles.add(new Motorcycle(numPassangers, numWheels, enrollmentDate, cylinderCapacity));
    }

    public void addBicycle() {
        System.out.println("Agrega una nuevo bicicleta:");
        System.out.print("Numero de pasajeros: ");
        int numPassangers = sc.nextInt();
        System.out.print("Fecha de Matricula (dd-mm-yyyy): ");
        String enrollmentDate = sc.next();
        System.out.print("Tipo de bicicleta: ");
        String type = sc.next();

        vehicles.add(new Bicycle(numPassangers, enrollmentDate, type));
    }

    public void addTruck() {
        System.out.println("Agrega una nueva camioneta:");
        System.out.print("Numero de pasajeros: ");
        int numPassangers = sc.nextInt();
        System.out.print("Numero de llantas: ");
        int numWheels = sc.nextInt();
        System.out.print("Fecha de Matricula (dd-mm-yyyy): ");
        String enrollmentDate = sc.next();
        System.out.print("Altura: ");
        int height = sc.nextInt();

        vehicles.add(new Truck(numPassangers, numWheels, enrollmentDate, height));
    }

    public void addBoat() {
        System.out.println("Agrega un nuevo bote:");
        System.out.print("Numero de pasajeros: ");
        int numPassangers = sc.nextInt();
        System.out.print("Fecha de Matricula (dd-mm-yyyy): ");
        String enrollmentDate = sc.next();
        System.out.print("Material del bote: ");
        String material = sc.next();

        vehicles.add(new Boat(numPassangers, enrollmentDate, material));
    }

    public static void main(String[] args) {
        Test test = new Test();

        int aux = 2;

        while(aux != 0) {
            System.out.println("Que quieres agregar?:");
            System.out.println("1. Carro");
            System.out.println("2. Motocicleta");
            System.out.println("3. Bicicleta");
            System.out.println("4. Camioneta");
            System.out.println("5. Bote");
            int choise = test.sc.nextInt();
            switch(choise) {
                case 1: {
                    test.addCar();
                }
                case 2: {
                    test.addMotorcycle();
                }
                case 3: {
                    test.addBicycle();
                }
                case 4: {
                    test.addTruck();
                }
                case 5: {
                    test.addBoat();
                }
                default: {
                    break;
                }
            }

            System.out.println("--------------");

            aux--;
        }

        for(Vehicle vehicle: test.vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("------------------");
        }
    }
}
