package class17;
public class tester04 {
    public static void main(String[] args) {
        // 1. Inside same class
        task04 obj1 = new task04(1, 2, 3, 4);
     //   System.out.println("Object 1 - Private Value: " + obj1.privateValue);
        System.out.println("Object 1 - Public Value: " + obj1.publicValue);
        System.out.println("Object 1 - Default Value: " + obj1.defaultValue);
        System.out.println("Object 1 - Protected Value: " + obj1.protectedValue);
    }
}