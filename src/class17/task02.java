package class17;
public class task02 {
    //Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    String english;
    String urdu;
    public task02(){
        this("book","book2");
        System.out.println(english+" "+urdu);
    }
    public task02(String urdu,String english){
        this.urdu=urdu;
        this.english=english;

    }
}
