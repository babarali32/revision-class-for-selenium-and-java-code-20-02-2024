package class13;

public class stringChar {
    public static void main(String[] args) {

        String str="Batch A is awesome";
        System.out.println(str.charAt(9));
        System.out.println("-------------------------------");
        int count=0;
       for (int i=0; i<str.length(); i++) {
           if (str.charAt(i)=='a' || str.charAt(i)=='A') {
              count++;
           }
       }
        System.out.println(count);

        System.out.println("-------------------------------");
        char [] val=str.toCharArray();
        System.out.println(val[3]);
        System.out.println("----------------------------------");
        for (char all:val
             ) {
            System.out.print(all); // printline is skipped
        }

    }
}
