package class14And15;

public class stringbuilder {
    public static void main(String[] args) {


          String day="sunday";
          StringBuilder stringBuilder=new StringBuilder(day);
          stringBuilder.append(" monday");
          //stringBuilder.reverse();4`
          stringBuilder.delete(3,4);
          stringBuilder.insert(6,"=");
          System.out.println(stringBuilder);


    }
}
