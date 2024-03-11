package class12;
public class returnmethods {
    int getmax(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    public static void main(String[] args) {
        returnmethods obj1=new returnmethods();
         int c =obj1.getmax(2,4);
        System.out.println(c);
    }
}
