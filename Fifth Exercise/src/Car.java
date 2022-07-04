public class Car extends Vehicle {
    private boolean notFourWheels;

    public Car(int numPassengers, int numWheels, String enrollmentDate, String environment) {
        super(numPassengers, numWheels, enrollmentDate, environment);

        if(numWheels != 4) {
            notFourWheels = true;
        }else {
            notFourWheels = false;
        }
    }

    public boolean isNotFourWheels() {
        return notFourWheels;
    }
}
