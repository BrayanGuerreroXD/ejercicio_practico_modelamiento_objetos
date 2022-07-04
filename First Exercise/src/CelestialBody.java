import java.util.Objects;

public class CelestialBody {
    private final String name;
    private final int id;
    private final double mass;
    private final double density;
    private final double diameter;
    private final double distance;

    public CelestialBody(String name, int id, double mass, double density, double diameter, double distance) {
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

    public double getMass() {
        return mass;
    }

    public double getDensity() {
        return density;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getDistance() {
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
