import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 *Planetary system is an abstraction of the characteristics of a solar system
 *
 * @version 1.0.0 2022-07-03
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *
 * @since 1.0.0 2022-07-03
 *
 */

public class PlanetarySystem {
    private ArrayList<CelestialBody> planetarySystem;
    private static final double gravity = 9.8;  // Static variable that indicates the value of gravity determined in m/s^2

    /**
     * Constructor that initializes the planetarSystem variable
     */
    public PlanetarySystem() {
        this.planetarySystem = new ArrayList<CelestialBody>();
    }

    /**
     * Builder receiving a list of the planetary system
     * @param planetarySystem
     */
    public PlanetarySystem(ArrayList<CelestialBody> planetarySystem) {
        this.planetarySystem = Objects.requireNonNull(planetarySystem);
    }

    public ArrayList<CelestialBody> getPlanetarySystem() {
        return planetarySystem;
    }

    public void setPlanetarySystem(ArrayList<CelestialBody> planetarySystem) {
        this.planetarySystem = Objects.requireNonNull(planetarySystem);
    }

    /**
     * Method that adds a celestial body to the planetary system
     * @param cb
     */
    public void addCelestialBody(CelestialBody cb) {
        if(cb.getName().equalsIgnoreCase("sun") && !this.searchCelestialBody("sun")) {
            this.planetarySystem.add(cb);
            this.orderCelestialBodies();
        }else if(!this.searchCelestialBody(cb.getName())) {
            this.planetarySystem.add(cb);
            this.orderCelestialBodies();
        }else {
            throw new IllegalArgumentException("No se puede agregar otro sol al sistema solar");
        }
    }

    /**
     * Method that searches by name and returns a celestial body
     * @param name //Celestial body name
     * @return Object CelestialBody
     */
    public CelestialBody getCelestialBody(String name) {
        CelestialBody celestialBody = null;

        for(CelestialBody cb: planetarySystem) {
            if(cb.getName().equalsIgnoreCase(name)) {
                celestialBody = cb;
                break;
            }
        }

        return celestialBody;
    }

    /**
     * Method that receives two celestial bodies and calculates their gravitational force of attraction
     * @param cb1
     * @param cb2
     * @return //Value of the gravitational force of attraction
     */
    public double calculateGravitationalAttraction(CelestialBody cb1, CelestialBody cb2) {
        double r = 0.0; //Distance between the centers of mass of the two bodies
        double gbf = 0.0; //gravitational attraction force
        double m1 = cb1.getMass();
        double m2 = cb2.getMass();
        double radio1 = (cb1.getDiameter()/2);
        double radio2 = (cb2.getDiameter()/2);

        r = radio1 + radio2 + Math.abs(cb1.getDistance() - cb2.getDistance());
        gbf = (gravity * ((m1 * m2) / (r * r)));

        return gbf;
    }

    /**
     * Method ordering planetary system list
     */
    private void orderCelestialBodies() {
        planetarySystem.sort(new Comparator<CelestialBody>() {
            @Override
            public int compare(CelestialBody celestialBody1, CelestialBody celestialBody2) {
                return Double.compare(celestialBody1.getDistance(), celestialBody2.getDistance());
            }
        });
    }

    /**
     * Method that searches for a celestial body by name and returns whether it is present or not
     * @param name
     * @return // Boolean value on the presence of the celestial body in the planetary system
     */
    private boolean searchCelestialBody(String name) {
        boolean isPresent = false;

        for(CelestialBody cb: planetarySystem) {
            if(cb.getName().equalsIgnoreCase(name)) {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }
}
