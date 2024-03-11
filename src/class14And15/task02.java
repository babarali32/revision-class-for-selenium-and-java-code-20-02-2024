package class14And15;

public class task02 {
    //2.  Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    String name;
    int id;
    int nofstudents;
    static int students=0;
    public static void main(String[] args) {
        task02 s1=new task02();
        s1.id=10;
        s1.name="a";
        s1.nofstudents=4;
        students++;
        task02 s2=new task02();
        students++;
        task02 s3=new task02();
        students++;

        System.out.println(students);
    }
}
