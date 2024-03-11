package class13;

public class task03 {
    public static void main(String[] args) {
        //You have a
        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        // How would you find out how many sentences are in that String?
        String [] val=str.split("[?]");
        System.out.println(val.length);
    }
}
