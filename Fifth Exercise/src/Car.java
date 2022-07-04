/**
 * Class presenting basic vehicle characteristics
 *
 * @version 1.0.0 2022-07-04
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *
 * @since 1.0.0 2022-07-04
 *
 */

public class Car extends Vehicle {
    private boolean notFourWheels;

    public Car(int numPassengers, int numWheels, String enrollmentDate) {
        super(numPassengers, numWheels, enrollmentDate, "Terrestre");

        if(numWheels != 4) {
            notFourWheels = true;
        }else {
            notFourWheels = false;
        }
    }

    public boolean isNotFourWheels() {
        return notFourWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "notFourWheels=" + notFourWheels +
                '}';
    }
}
