package class14And15;

public class task02reverse {
    public static void main(String[] args) {

        String str="i am new here. reverse me all";
        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
