public class Boat extends Vehicle {
    private String material; //Material used to make a boat

    public Boat(int numPassengers, String enrollmentDate, String environment, String material) {
        super(numPassengers, 0, enrollmentDate, environment);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
