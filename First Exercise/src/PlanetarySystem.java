import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class PlanetarySystem {
    private ArrayList<CelestialBody> planetarySystem;

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

    private void orderCelestialBodies() {
        planetarySystem.sort(new Comparator<CelestialBody>() {
            @Override
            public int compare(CelestialBody celestialBody1, CelestialBody celestialBody2) {
                return Double.compare(celestialBody1.getDistance(), celestialBody2.getDistance());
            }
        });
    }

    public void addCelestialBody(CelestialBody cb) {
        if(cb.getName().equalsIgnoreCase("sun") && !this.searchCelestialBody("sun")) {
            this.planetarySystem.add(cb);
            this.orderCelestialBodies();
        }else{
            throw new IllegalArgumentException("No se puede agregar otro sol al sistema solar");
        }
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
