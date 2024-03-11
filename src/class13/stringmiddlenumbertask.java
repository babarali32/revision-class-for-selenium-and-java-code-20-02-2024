package class13;

public class stringmiddlenumbertask {
    public static void main(String[] args) {
        //Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters,
        // print the character in the middle of the String.
        String str="pakistani";
        if(!str.isEmpty() && str.length()%2!=0 && str.length()>3){
            int a=str.length()/2;
            System.out.println(str.charAt(a));
        }  else {
            System.out.println("number is even has no middle ");
        }
    }

}
