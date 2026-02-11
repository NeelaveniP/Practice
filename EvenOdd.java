import java.util.Scanner;
public class EvenOdd{
	public static void main(String[]args){
		int a[] ={5,10,15,20,25};
		for(int i=0; i<a.length;i++){
			if(a[i]%2 == 0){
				System.out.println("This number is Even : "+a[i]);
			}
			else
			{
				System.out.println("This number is Odd : "+a[i]);
			}
		}
	}
}