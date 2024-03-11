package class17;

public class constrctor {
  private   String name;
   private String color;
   private  String balance="400";
    public constrctor(String bname,String bcolor){
        color=bcolor;
        name=bname;
        System.out.println(name);
        System.out.println("constror is created");
        printname("s","e"); // method can be called inside the constructor
    }
    public void printname(String cname,String Col){
        name=cname;
        color=Col;
        // this will cause infinte time calling constructor
      //  new constrctor("ppp","e"); //constructor can be called inside the method
        System.out.println(balance);
    }
}
