
public class Country {
    String countryName;
    String highPointName;
    int maxElevation;
    public Country(String countryName, HighPoint highest) {
        setCountry(countryName);
        this.highPointName = highest.getHighPointName();
        this.maxElevation = highest.getMaxElevation();
    }
    public void setCountry(String countryName) {
        this.countryName = countryName;
    }
    public String getCountry() {
        return(countryName);
    }
    public int getMaxElevation() {
        return(maxElevation);
    }
    public String getHighPointName() {
        return(highPointName);
    }
    public String toString() {
        return(String.format("Country name: %s, "
                + "highest point name: %s, max elevation: "
                + "%d", countryName, highPointName, maxElevation));
    }
}
    
