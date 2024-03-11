package class12;
import java.util.Scanner;
public class voidmethodss {
    String method1(){
        return "sandy";
    }
    String method2(String name){
        return name;
    }
     void method4(String name){
         System.out.println(name);
     }
     String method5(String name){
        return "ayesha";
     }
    public static void main(String[] args) {
        voidmethodss obj1=new voidmethodss();
        obj1.method1();
        obj1.method2("return method one");
        obj1.method4("two");
        obj1.method5("three");
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any word ");
        String once =scan.next();
        System.out.println(once);
    }
}
