public class Test {
    public static void main(String[] args) {
        PlanetarySystem ps = new PlanetarySystem();

        ps.addCelestialBody(new CelestialBody("Sun", 1, (1.98*(10^30)), 1.41, 1392700., 0.0 ));
        ps.addCelestialBody(new CelestialBody("Mercury", 2, (3.28*(10^23)), 5.43, 4879.4, (5.79*(10^10))));
        ps.addCelestialBody(new CelestialBody("Venus", 3, (4.83*(10^24)), 5.24, 12104., (1.08*(10^11))));
    }
}
