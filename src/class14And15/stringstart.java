package class14And15;

public class stringstart {
    public static void main(String[] args) {
        String str="Nasir";
        System.out.println(str.startsWith("N"));
        System.out.println(str.endsWith("r"));
        System.out.println(str.startsWith("N"));

        System.out.println(str.contains("s"));
        boolean b=str.toLowerCase().startsWith("a");
        System.out.println(b);
        System.out.println(str.equals("Nasir"));
        System.out.println(str.equalsIgnoreCase("nasir"));
    }
}
