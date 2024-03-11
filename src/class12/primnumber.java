package class12;

public class primnumber {
    public static void main(String[] args) {
        int num = 4;
        boolean isprime = true;
            if (num <= 1) {
                isprime = false;
            } else {   for (int i = 2;  i <= num/2; i++) {
                if (num % i == 0) {
                    isprime = false;
                }
            }
        }
            if (isprime){
                System.out.println("is prime number");
            } else {
                System.out.println(" not prime");
            }
    }
}
