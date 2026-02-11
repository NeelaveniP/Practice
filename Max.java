import java.util.Scanner;
public class Max{
	public static void main(String[]args){
		int a[] ={5,10,15,20,25};
		int max	= 0;
		for(int i=0; i<a.length;i++){
			if(a[i] > max)
		max = a[i];
		}
		System.out.println("The maximum number in the given array is : " +max);
	}
}