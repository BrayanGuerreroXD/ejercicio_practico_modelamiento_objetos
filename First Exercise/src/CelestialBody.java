import java.util.Objects;

/**
 *Celestial body is a class that performs an abstraction of the characteristics of a celestial body of the solar system
 *
 * @version 1.0.0 2022-07-03
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *
 * @since 1.0.0 2022-07-03
 *
 */

public class CelestialBody {
    private final String name;
    private final int id;
    private final double mass; // Determined mass in kilograms (Kg)
    private final double density; // Determined density in g/cm^3
    private final double diameter; // Determined diameter in kilometers (Km)
    private final double distance; // Determined distance in kilometers (Km)

    /**
     * Constructor of an instance of the class CelestialBody
     * @param name
     * @param id
     * @param mass
     * @param density
     * @param diameter
     * @param distance
     */
    public CelestialBody(String name, int id, double mass, double density, double diameter, double distance) {
        this.name = Objects.requireNonNull(name);
        this.id = Objects.requireNonNull(id);
        this.mass = Objects.requireNonNull(mass);
        this.density = Objects.requireNonNull(density);
        this.diameter = Objects.requireNonNull(diameter);
        this.distance = Objects.requireNonNull(distance);

        if((mass <= 0) || (density <= 0) || (diameter <= 0)) {
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
