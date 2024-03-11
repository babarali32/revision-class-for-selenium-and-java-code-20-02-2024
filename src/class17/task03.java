package class17;
public class task03 {
    String studentname;
    int marksEnglish;
    int marksUrdu;
    int markPhysics;
    public task03(String studentname,int marksEnglish,int marksUrdu,int markPhysics){
       this.studentname=studentname;
        this.marksUrdu=marksUrdu;
        this.markPhysics=markPhysics;
        this.marksEnglish=marksEnglish;
    }
    public void averagegrade(){
        double average=markPhysics+marksEnglish+marksUrdu/3;
        System.out.println("avaerage number of student "+studentname+" in 3 subjects are = "+average);
    }
}
