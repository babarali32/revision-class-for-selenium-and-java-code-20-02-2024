package class17;
public class task01 {
    //Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
    String name;
    String address;
    public task01(String name, String address){
        this.name=name;
        this.address=address;
    }
    public void display(){
        System.out.println(name);
        System.out.println(address);
    }
}
