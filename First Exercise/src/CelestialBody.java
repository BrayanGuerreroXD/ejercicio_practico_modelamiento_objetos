public class CelestialBody {
    private final String name;
    private final int id;
    private final int mass;
    private final int density;
    private final int diameter;
    private final int distance;

    public CelestialBody(String name, int id, int mass, int density, int diameter, int distance) {
        this.name = name;
        this.id = id;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMass() {
        return mass;
    }

    public int getDensity() {
        return density;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "CelestialBody{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mass=" + mass +
                ", density=" + density +
                ", diameter=" + diameter +
                ", distance=" + distance +
                '}';
    }
}
