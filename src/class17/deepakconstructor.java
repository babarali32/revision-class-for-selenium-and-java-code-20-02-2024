package class17;
public class deepakconstructor {
    String name;
    int empId;
    public deepakconstructor(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }
    public static void main(String[] args) {
        deepakconstructor obj1 = new deepakconstructor("deepak", 101);
        deepakconstructor obj2 = new deepakconstructor("abc", 102);
    }
}