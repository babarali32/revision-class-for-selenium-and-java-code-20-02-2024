package class17;

public class privatemethod {
    private void hello(){
        System.out.println("i am private");
    }
    public void accessHello(){
        hello();
    }

    // now you can access outsie the class
    public static void main(String[] args) {
        privatemethod obj1=new privatemethod();
        obj1.accessHello();
    }
}
