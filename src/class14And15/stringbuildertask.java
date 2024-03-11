package class14And15;

public class stringbuildertask {
    public static void main(String[] args) {
        //reverse a sentence word by word
        String str="pakistan is very beautiful";
        String [] ar=str.split(" ");
        for (String word:ar){
            StringBuilder one=new StringBuilder(word);
            System.out.print(one.reverse());
        }
    }
}
