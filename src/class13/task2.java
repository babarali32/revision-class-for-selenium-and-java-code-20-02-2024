package class13;

public class task2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters,
        // numbers and special characters. Find out how many Alphanumeric characters are there in the String.
        String str="$#@SRBBa245$@%4wasgfg";

          int a=str.replaceAll("[^A-z0-9]","").length();
          System.out.println(a);


    }
}
