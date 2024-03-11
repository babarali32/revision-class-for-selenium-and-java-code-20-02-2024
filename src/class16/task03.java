package class16;

public class task03 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.

    private String vowels(String word){
        word=word.replaceAll("[^aeiou]","");
        return word;
    }
    public static void main(String[] args) {
        task03 obj3=new task03();
        String word="hey man i am here. where are you?";
        System.out.println(obj3.vowels(word));

    }
}
