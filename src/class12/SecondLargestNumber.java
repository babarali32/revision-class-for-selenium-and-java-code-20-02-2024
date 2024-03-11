package class12;


public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {8, 7, 6};
        // Initialize the largest and second largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        // Find the largest number
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
            System.out.println("Second largest number: " + secondLargest);
        }
    }
