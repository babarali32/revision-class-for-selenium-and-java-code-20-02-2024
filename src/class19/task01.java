package class19;
public class task01 {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    public static void main(String[] args) {
        B second=new B();
        System.out.println("--------------------------");
        C third=new C();
    }
}
class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        System.out.println("B");
    }
}class C extends B{
    public C(){
        System.out.println("C");
    }
}