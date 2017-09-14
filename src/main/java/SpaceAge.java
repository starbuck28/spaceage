import java.util.Map;
import java.util.HashMap;

class SpaceAge {
  private double ageInSeconds;
  private double ageInYearsOnEarth;
  private Map<String, Double> planetAgeRatios;


    SpaceAge(double seconds) {
        this.ageInSeconds = seconds;
        planetAgeRatios = new HashMap<>();
        planetAgeRatios.put("Earth", 31557600.0);
        planetAgeRatios.put("Mercury", 0.2408467);
        planetAgeRatios.put("Venus", 0.61519726);
        planetAgeRatios.put("Mars", 1.8808158);
        planetAgeRatios.put("Jupiter", 11.862615);
        planetAgeRatios.put("Saturn", 29.447498);
        planetAgeRatios.put("Uranus", 84.016846);
        planetAgeRatios.put("Neptune", 164.79132);
    }

    double getSeconds() {
        return ageInSeconds;
    }

    double onEarth() {
      ageInYearsOnEarth = ageInSeconds/planetAgeRatios.get("Earth");
      return ageInYearsOnEarth;
    }

    double onMercury() {
      return ageInYearsOnEarth / planetAgeRatios.get("Mercury");
    }

    double onVenus() {
        return ageInYearsOnEarth / planetAgeRatios.get("Venus");
    }

    double onMars() {
        return ageInYearsOnEarth / planetAgeRatios.get("Mars");
    }

    double onJupiter() {
      return ageInYearsOnEarth / planetAgeRatios.get("Jupiter");
    }

    double onSaturn() {
      return ageInYearsOnEarth / planetAgeRatios.get("Saturn");
    }

    double onUranus() {
      return ageInYearsOnEarth / planetAgeRatios.get("Uranus");
    }

    double onNeptune() {
      return ageInYearsOnEarth / planetAgeRatios.get("Neptune");
    }

}
