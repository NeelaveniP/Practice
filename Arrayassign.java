import java.util.Scanner;
public class Arrayassign{
	public static void main(String[]args){
		Scanner obj = new Scanner(System.in);
		int a[] = new int[5];
		
		for(int i=0; i<a.length; i++){
			System.out.println("Enter the value for an index : " +i);
			a[i] = obj.nextInt();
		}
		
		for(int j=a.length-1; j>=0 ; j--){
			System.out.println(a[j]);
		}
	}
}