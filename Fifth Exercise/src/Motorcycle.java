public class Motorcycle extends Vehicle {
    private int cylinderCapacity;

    public Motorcycle(int numPassengers, int numWheels, String enrollmentDate, int cylinderCapacity) {
        super(numPassengers, numWheels, enrollmentDate, "Terrestre");
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "numPassengers=" + super.getNumPassengers() +
                ", isManned=" + super.isManned() +
                ", numWheels=" + super.getNumWheels() +
                ", enrollmentDate='" + super.getEnrollmentDate() + '\'' +
                ", environment='" + super.getEnvironment() + '\'' +
                ", cylinderCapacity=" + cylinderCapacity +
                '}';
    }
}
