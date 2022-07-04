public class Boat extends Vehicle {
    private String material; //Material used to make a boat

    public Boat(int numPassengers, String enrollmentDate, String material) {
        super(numPassengers, 0, enrollmentDate, "Acuático");
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "numPassengers=" + super.getNumPassengers() +
                ", isManned=" + super.isManned() +
                ", numWheels=" + super.getNumWheels() +
                ", enrollmentDate='" + super.getEnrollmentDate() + '\'' +
                ", environment='" + super.getEnvironment() + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
