public class Bicycle extends Vehicle {
    private String type;

    public Bicycle(int numPassengers, String enrollmentDate, String environment, String type) {
        super(numPassengers, 2, enrollmentDate, environment);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
