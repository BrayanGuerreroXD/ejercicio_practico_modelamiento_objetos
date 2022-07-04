public class Truck extends Vehicle {
    private int height; //Defined in meters

    public Truck(int numPassengers, int numWheels, String enrollmentDate, String environment, int height) {
        super(numPassengers, numWheels, enrollmentDate, environment);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
