package class16;
public class Dog1 {
    String name;
    static int noOfLegs;
    void printName(){
        System.out.println(name);
    }
      static void printlegs(){
          //System.out.println(name); // java is confused not allow
        System.out.println(noOfLegs);
    }
}
