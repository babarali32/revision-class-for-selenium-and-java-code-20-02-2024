package class16;

public class defaultconstructor {
    String name;
    String color;
    private defaultconstructor(){
        System.out.println("zero argument constructor");
    }
    public defaultconstructor(String color){
        System.out.println(color);
    }

}
