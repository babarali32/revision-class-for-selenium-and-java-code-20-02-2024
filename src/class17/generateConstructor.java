package class17;
public class generateConstructor {
    private String name;
    private String make;
    private String model;
    private String color;
//    public generateConstructor() {
//
//    }
    public generateConstructor(String name, String make) {
      //  this();
        this.name=name;
        this.make = make;
    }
    public generateConstructor(String name, String make, String model) {
     //   this();
        this.model = model;

    }
    public generateConstructor(String name, String make, String model, String color) {
        this(name,make,model);
        this.color = color;
    }
}
