package class16;

public class testerdefaultconstructor {
      public static void main(String[] args) {
       // defaultconstructor obj1=new default constructor(); not possible
        defaultconstructor ojb = new defaultconstructor("one");
        //if you create a constructor inside the class then
        //default construcotr is not created itself.
        //because in class you said i will initialize the variables
        //then java say i will not initialize the variables to default values now
        // you self provide values to variables.
    }
}