import java.util.Objects;

/**
 * Class presenting basic vehicle characteristics
 *
 * @version 1.0.0 2022-07-04
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *
 * @since 1.0.0 2022-07-04
 *
 */

public class Vehicle {
    private int numPassengers;
    private boolean isManned;
    private int numWheels;
    private String enrollmentDate;
    private String environment;

    public Vehicle(int numPassengers, int numWheels, String enrollmentDate, String environment) {
        this.numPassengers = Objects.requireNonNull(numPassengers);
        this.numWheels = Objects.requireNonNull(numWheels);
        this.enrollmentDate = Objects.requireNonNull(enrollmentDate);
        this.environment = Objects.requireNonNull(environment);

        if(numPassengers > 0) {
            this.isManned = true;
        }else if(numPassengers == 0){
            this.isManned = false;
        }else {
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
