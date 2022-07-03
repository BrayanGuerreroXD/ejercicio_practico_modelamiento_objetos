import java.util.Objects;

public class CelestialBody {
    private final String name;
    private final int id;
    private final int mass;
    private final int density;
    private final int diameter;
    private final int distance;

    public CelestialBody(String name, int id, int mass, int density, int diameter, int distance) {
        this.name = Objects.requireNonNull(name);
        this.id = Objects.requireNonNull(id);
        this.mass = Objects.requireNonNull(mass);
        this.density = Objects.requireNonNull(density);
        this.diameter = Objects.requireNonNull(diameter);
        this.distance = Objects.requireNonNull(distance);

        if((mass <= 0) || (density <= 0) || (diameter <= 0) || (distance <= 0)) {
            throw new IllegalArgumentException("No se pueden ingresar valores menores o igual a cero");
        }
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
