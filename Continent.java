import java.util.ArrayList;
public class Continent {
    ArrayList<Country> countryList = new ArrayList<>();

    public void addCountry(Country countryObj) {
        countryList.add(countryObj);
    }
    public void printAll() {
        for(Country object : countryList) {
            System.out.println(object.toString());
        }
    }
    public String printMax() {
        int maxValue = 0;
        String printString = "";
        for(Country object : countryList) {
            if(object.getMaxElevation() > maxValue) {
                maxValue = object.getMaxElevation();
                printString = object.toString();
            }
        }
        return(printString);
    }
}