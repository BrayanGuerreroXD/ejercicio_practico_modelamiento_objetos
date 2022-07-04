import java.util.Objects;

/**
 *
 *
 * @version 1.0.0 2022-07-04
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *
 * @since 1.0.0 2022-07-04
 *
 */

public class Vehiculo {
    private int numPassengers;
    private boolean isManned;
    private int numWheels;
    private String enrollmentDate;
    private String environment;

    public Vehiculo(int numPassengers, boolean isManned, int numWheels, String enrollmentDate, String environment) {
        this.numPassengers = Objects.requireNonNull(numPassengers);
        this.isManned = Objects.requireNonNull(isManned);
        this.numWheels = Objects.requireNonNull(numWheels);
        this.enrollmentDate = Objects.requireNonNull(enrollmentDate);
        this.environment = Objects.requireNonNull(environment);

        if((!isManned && numPassengers > 0) || (isManned && numPassengers <= 0) || numPassengers < 0) {
            throw new IllegalArgumentException("Inconsistencia en los datos");
        }
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public boolean isManned() {
        return isManned;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getEnvironment() {
        return environment;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numPassengers=" + numPassengers +
                ", isManned=" + isManned +
                ", numWheels=" + numWheels +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", environment='" + environment + '\'' +
                '}';
    }
}
