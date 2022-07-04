public class Motorcycle extends Vehicle {
    private int cylinderCapacity;

    public Motorcycle(int numPassengers, int numWheels, String enrollmentDate, String environment, int cylinderCapacity) {
        super(numPassengers, numWheels, enrollmentDate, environment);
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }
}
