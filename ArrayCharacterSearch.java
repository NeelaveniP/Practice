import java.util.Scanner;

public class ArrayCharacterSearch {
    public static void main(String[] args) {
        Scanner neelu = new Scanner(System.in);
        String[] arr = new String[5];

        System.out.println("Enter 5 words:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter word : ");
            arr[i] = neelu.nextLine();
        }
        System.out.println("\nArray elements :");
        int index = 0;
        for (String s : arr) {
            System.out.println("Index " + index + " : " + s);
            index++;
        }
        System.out.print("\nEnter a character to search: ");
        char ch = neelu.next().charAt(0);
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == ch) {
                    System.out.println( ch + 
                        "  found in " + word + 
                        "  at Array Index: " + i + 
                        " and Position: " + j);
                    
                }
            }
        
		}
        neelu.close();
    }
}