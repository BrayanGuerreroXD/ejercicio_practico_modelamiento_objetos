import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class PlanetarySystem {
    private ArrayList<CelestialBody> planetarySystem;
    private static final double gravity = 9.8;

    public PlanetarySystem() {
        this.planetarySystem = new ArrayList<CelestialBody>();
    }

    public PlanetarySystem(ArrayList<CelestialBody> planetarySystem) {
        this.planetarySystem = Objects.requireNonNull(planetarySystem);
    }

    public ArrayList<CelestialBody> getPlanetarySystem() {
        return planetarySystem;
    }

    public void setPlanetarySystem(ArrayList<CelestialBody> planetarySystem) {
        this.planetarySystem = Objects.requireNonNull(planetarySystem);
    }

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

    private void orderCelestialBodies() {
        planetarySystem.sort(new Comparator<CelestialBody>() {
            @Override
            public int compare(CelestialBody celestialBody1, CelestialBody celestialBody2) {
                return Double.compare(celestialBody1.getDistance(), celestialBody2.getDistance());
            }
        });
    }

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
