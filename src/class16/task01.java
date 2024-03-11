package class16;

public class task01 {
    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.
    public int acceptArray(int [] arr){
             int sum = 0;
             for (int num : arr) {
              sum += num;
        }
             return sum;
    }
    public static void main(String[] args) {
        task01 obj=new task01();
        int [] arr={3,4,5,6,7,8};
       int sum= obj.acceptArray(arr);
        System.out.println(sum);

    }
}
