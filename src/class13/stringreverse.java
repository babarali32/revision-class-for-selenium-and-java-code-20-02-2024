package class13;

public class stringreverse {
    public static void main(String[] args) {
        String str="ABCDE";
        System.out.println(str.length());
        for (int i=str.length()-1; i>=0;  i--){
            System.out.println(str.charAt(i));
        }
    }
}
