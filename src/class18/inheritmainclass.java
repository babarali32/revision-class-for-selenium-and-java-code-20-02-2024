package class18;
public class inheritmainclass {

    protected String name; // can not be inherit
    static String color; // static are not accessible directly
         // default is accessible within same package
    protected String hobby;

    public inheritmainclass(){}

    public inheritmainclass(String name, String color) {
        this.name = name;
        this.color = color;
    }
    protected void getname(){
        System.out.println(name);
    }
}
