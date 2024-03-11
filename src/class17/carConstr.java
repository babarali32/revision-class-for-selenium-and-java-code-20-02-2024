package class17;

public class carConstr {
    private String name;
    private String make;
    private String model;
    private String color;
    private int year;
    private int engineCC;
    private String VIN;
    private int mileage;
    private int maxSpeed;
    private boolean sunroof;

    public carConstr() {
        System.out.println("zero constructor");
    }

    public carConstr(String cname) {
        name = cname;
    }

    // Constructor with 2 parameters
    public carConstr(String carName, String carMake) {
        name = carName;
        make = carMake;
    }

    // Constructor with 3 parameters
    public carConstr(String carName, String carMake, String carModel) {
        name = carName;
        make = carMake;
        model = carModel;
    }

    // Constructor with 4 parameters
    public carConstr(String carName, String carMake, String carModel, String carColor) {
        name = carName;
        make = carMake;
        model = carModel;
        color = carColor;
    }

    public void speed() {
        System.out.println(maxSpeed);
    }
    public carConstr(String carName, String carMake, String carModel, String carColor, int carYear, int carEngineCC, String carVin, int carMileage, int carMaxSpeed, boolean sunroof) {
        // Constructor code here
        name = carName;
        make = carMake;
        model = carModel;
        color = carColor;
        year = carYear;
        engineCC = carEngineCC;
        VIN = carVin;
        mileage = carMileage;
    }


}

