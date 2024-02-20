package javaclasses;

public class sumairtester {
    public static void main(String[] args) {
        tasksumair.ceo="sumair";
        tasksumair obj1=new tasksumair();
        obj1.empID="01";
        obj1.salary="200";
        obj1.age=20;
        obj1.sleep();

        System.out.println(obj1.ceo);
        System.out.println(obj1.age);

        tasksumair obj2=new tasksumair();
        obj2.empID="02";
        obj2.salary="400";
        obj2.sleep();

        System.out.println(obj2.ceo);
        System.out.println(obj2.age);

    }
}
