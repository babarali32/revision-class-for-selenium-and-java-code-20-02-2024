package javaclasses;

public class stringClass {
    public static void main(String[] args) {
        String num="12$$%^&093afjERBAFnp04kfAJKH448FJHJK";
        System.out.println(num.replaceAll("[^A-Za-z0-9]",""));
        System.out.println(num.replaceAll("[^A-Za-z0-9]","").length());
    }
}
