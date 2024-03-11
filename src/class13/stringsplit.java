package class13;

import java.util.Arrays;

public class stringsplit {
    public static void main(String[] args) {
         String str="i am good. how are you. what are you doing?";
         String [] val=str.split(" ");
            String wao=Arrays.toString(str.split(" "));
        System.out.println(Arrays.toString(str.split(" ")));
         System.out.println(val[1].trim());

        System.out.println(val.length);
    }
}
