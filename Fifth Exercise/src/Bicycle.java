public class Bicycle extends Vehicle {
    private String type;

    public Bicycle(int numPassengers, String enrollmentDate, String type) {
        super(numPassengers, 2, enrollmentDate, "Terrestre");
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "type='" + type + '\'' +
                '}';
    }
}
