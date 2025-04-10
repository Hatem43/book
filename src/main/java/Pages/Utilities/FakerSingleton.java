package Pages.Utilities;// FakerSingleton.java
import com.github.javafaker.Faker;

public class FakerSingleton {
    private static FakerSingleton instance;
    private Faker faker;
    private String testData;
    private String AgencyName;

    private FakerSingleton() {
        faker = new Faker();
        testData = faker.name().firstName(); // Example of generating a name
        AgencyName = faker.name().firstName(); // Example of generating a name
    }

    public static FakerSingleton getInstance() {
        if (instance == null) {
            instance = new FakerSingleton();
        }
        return instance;
    }

    public String getTestData() {
        return testData;
    }
    public String getAgencyName() {
        return AgencyName;
    }

}


