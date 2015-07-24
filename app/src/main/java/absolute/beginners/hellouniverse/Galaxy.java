package absolute.beginners.hellouniverse;

/**
 * Created by Joshua on 7/11/2015.
 */
public class Galaxy {
    String galaxyName;
    int galaxySolarSystems;
    int galaxyPlanets;
    long galaxyColonies;
    double galaxyLifeforms;
    int galaxyFleets;
    int galaxyStarships;

    // CONSTRUCTOR
    public Galaxy (String name, int solarSys, int planets) {
        galaxyName = name;
        galaxySolarSystems = solarSys;
        galaxyPlanets = planets;
        galaxyColonies = 0;
        galaxyLifeforms = 0;
        galaxyFleets = 0;
        galaxyStarships = 0;
    }// end CONSTRUCTOR

    void setGalaxyColonies (long numberColonies) {
        galaxyColonies = numberColonies;
    }// end setGalaxyColonies()

    long getGalaxyColonies() {
        return galaxyColonies;
    }// end getGalaxyColonies()

    void setGalaxyPopulation(double numberLifeforms) {
        galaxyLifeforms = numberLifeforms;
    }// end setGalaxyPopulation()

    double getGalaxyPopulation() {
        return galaxyLifeforms;
    }// end getGalaxyPopulation()

    void setGalaxyFleets(int numberFleets) {
        galaxyFleets = numberFleets;
    }// end setGalacyFleets()

    int getGalaxyFleets() {
        return galaxyFleets;
    }// end getGalaxyFleets()

    void setGalaxyStarships(int numberStarships) {
        galaxyStarships = numberStarships;
    }// end setGalaxyStarships()

    int getGalaxyStarships() {
        return galaxyStarships;
    }// end getGalaxyStarships()

}// end CLASS
