package class14And15;

public class stringparlindrom {

          public static void main(String[] args) {
              String str="madam";
              StringBuilder strb=new StringBuilder(str);
              strb.reverse();
              if (str.equals(strb)){
                  System.out.println("string is palindrome");
              }
    }
}
