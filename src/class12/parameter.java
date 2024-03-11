package class12;

public class parameter {
    public void twonumber(int a, int b , int c){
        if (a>b && a>c){
            System.out.println(a+" is larger thern ");
        }
        else if (b>a && b>c){
            System.out.println(b+" is greater then ");
        } else if (c>a && c>b) {
            System.out.println(c+" is large number ");
        }
    }

    public static void main(String[] args) {
        parameter obj1=new parameter();
        obj1.twonumber(3,5,7);
        obj1.twonumber(6,3,4);
        obj1.twonumber(6,7,9);
    }

}
