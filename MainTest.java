public class MainTest {
    public static void main(String[] args) {
        Continent asia = new Continent();
 
        Country asianOne = new Country("Japan",
                new HighPoint("Mount Fuji", 4389));
        asia.addCountry(asianOne);
 
        Country asianTwo = new Country("Pakistan",
                new HighPoint("K2",8611));
        asia.addCountry(asianTwo);

        Country asianThree = new Country("Nepal", 
                new HighPoint("Mount Everest", 9284));
        asia.addCountry(asianThree);

        Country asianFour = new Country("China", 
                new HighPoint("Badaling", 2341));
        asia.addCountry(asianFour);

        asia.printAll();
        System.out.println();
        System.out.println(asia.printMax());
    }
}