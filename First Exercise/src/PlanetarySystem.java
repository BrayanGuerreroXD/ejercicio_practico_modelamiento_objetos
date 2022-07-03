import java.util.ArrayList;
import java.util.Comparator;

public class PlanetarySystem {
    private ArrayList<CelestialBody> planetarySystem;

    public PlanetarySystem() {
        this.planetarySystem = new ArrayList<CelestialBody>();
    }

    public PlanetarySystem(ArrayList<CelestialBody> planetarySystem) {
        this.planetarySystem = planetarySystem;
    }

    public ArrayList<CelestialBody> getPlanetarySystem() {
        return planetarySystem;
    }

    public void setPlanetarySystem(ArrayList<CelestialBody> planetarySystem) {
        this.planetarySystem = planetarySystem;
    }

    private void orderCelestialBodies() {
        planetarySystem.sort(new Comparator<CelestialBody>() {
            @Override
            public int compare(CelestialBody celestialBody1, CelestialBody celestialBody2) {
                return Integer.compare(celestialBody1.getDistance(), celestialBody2.getDistance());
            }
        });
    }

    private void addCelestialBody(CelestialBody cb) {
        if(cb.getName().equalsIgnoreCase("sun")) {
            this.planetarySystem.add(cb);
            this.orderCelestialBodies();
        }else{

        }
    }
}
