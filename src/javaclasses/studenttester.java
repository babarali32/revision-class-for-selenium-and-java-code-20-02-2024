package javaclasses;

public class studenttester {
    public static void main(String[] args) {

        student ob1=new student();
        ob1.name="one";
        ob1.id=90;
        student.numbrofstudents++;

        student ob2=new student();
        ob2.name="two";
        ob2.id=80;
        student.numbrofstudents++;

        student ob3=new student();
        ob3.name="three";
        ob3.id=70;
        student.numbrofstudents++;
        System.out.println(student.numbrofstudents);
    }
}
