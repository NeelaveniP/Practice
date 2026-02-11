import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={5,10,45,60,90};
        int largest = arr[0];
        int secondLargest = arr[0];      
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
               secondLargest = arr[i];
            }
        }
        System.out.println("Second largest number is: " + secondLargest);
        ;
    }
}