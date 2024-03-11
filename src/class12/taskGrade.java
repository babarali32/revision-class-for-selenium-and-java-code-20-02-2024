package class12;

public class taskGrade {
    //Create  class Student that will have a method getGrade.
    // Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F
    String getGrage(int score) {
        if (score > 90) {
            return "A";
        } else if (score>80){
            return "B";
        }   else if (score>70){
            return "C";
        } else if (score>60){
            return "D";
        } else if (score>50) {
            return "E";
        }
        else return "fail";
    }
    public static void main(String[] args) {
        taskGrade obj1=new taskGrade();
        System.out.println(obj1.getGrage(83));
    }
}
