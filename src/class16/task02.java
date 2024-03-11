package class16;

public class task02 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public String reverse(String word){
        StringBuilder obj=new StringBuilder(word);
        obj.reverse();
        return obj.toString();  // important string builder is like array of list. add value inside it.
    }

    public static void main(String[] args) {
        task02 obj2=new task02();
        String word="Hello man";
        obj2.reverse(word);
        System.out.println(obj2.reverse(word));
    }
}
