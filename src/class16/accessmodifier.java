package class16;
public class accessmodifier {
    private String name;
    int age;
       public double salary;
    void displayname(){
        System.out.println(name);
    }
    void  displayage(){
        System.out.println(age);
    }
    void displasalary(){
        System.out.println(salary);
    }
    public static void main(String[] args) {
        accessmodifier obj2=new accessmodifier();
        obj2.age=4;
        obj2.salary=4949;
        obj2.name="one";
    }
}
