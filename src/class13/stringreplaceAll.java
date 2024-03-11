package class13;

public class stringreplaceAll {
    public static void main(String[] args) {
        String str = "$%463g gy56FGh 4hdgGe 535^&*545";
        System.out.println(str.replaceAll(" ", ""));
        System.out.println(str.replaceAll("[&]", " "));
        System.out.println(str.replaceAll("[\\d\\w\\s]", " "));
        System.out.println(str.replaceAll("[A-Z]", " "));
        System.out.println(str.replaceAll("[^0-9]", " "));
        System.out.println(str.replaceAll("[A-z0-9]", " "));
    }
}
