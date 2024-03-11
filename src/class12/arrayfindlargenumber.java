package class12;

public class arrayfindlargenumber {
    public static void main(String[] args) {
        int [] numbers={12,34,9,42,32,3};
        int largenumber=Integer.MIN_VALUE; // compare with -2143442422
        int smallnumber=Integer.MAX_VALUE;  // cpmpare with +2143442334
        // if you will debug then you will understand this, min.value mean it will replace if value 12 is greater
        // then -2142424 now lagevalue at first iteration is 12. now it comapre 12 is greater then 34 now it will save 34
        for (int num:numbers){
            if (num>largenumber){
                largenumber=num; // this will store 12 inside it. first iteration then last iteratino it will store 42;
            } else if (num<smallnumber) {
                smallnumber=num;
            }
        }
//        for (int i=0; i<numbers.length; i++){
//            if (numbers[i]>largenumber){
//                largenumber=numbers[i];
//
//            }  else if (numbers[i]<smallnumber){
//                smallnumber=numbers[i];
//            }
//
//        }
        System.out.println(largenumber);
        System.out.println(smallnumber);
    }
}
