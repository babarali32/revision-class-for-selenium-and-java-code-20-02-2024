package javaclasses;

public class StringMethods {
    public static void main(String[] args) {
        String str="lubo is manager.lubo is owner";
        System.out.println(str.replace("lubo","michael"));
        System.out.println(str.replaceAll("lubo","second "));
        System.out.println("---------------------------");
        String val="!@#$%#^&sfkj;wosnvowefnqwf";
        String one=val.replaceAll("[a-z]","-");
        System.out.println(one);
        //-----------------------------------------------
        String num="";
        for (int i = 0; i < 5; i++) {
            num=num+i;
        }
        System.out.println(num);
    }
}
