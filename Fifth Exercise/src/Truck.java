public class Truck extends Vehicle {
    private int height; //Defined in meters

    public Truck(int numPassengers, int numWheels, String enrollmentDate, int height) {
        super(numPassengers, numWheels, enrollmentDate, "Terrestre");
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numPassengers=" + super.getNumPassengers() +
                ", isManned=" + super.isManned() +
                ", numWheels=" + super.getNumWheels() +
                ", enrollmentDate='" + super.getEnrollmentDate() + '\'' +
                ", environment='" + super.getEnvironment() + '\'' +
                ", height=" + height +
                '}';
    }
}
