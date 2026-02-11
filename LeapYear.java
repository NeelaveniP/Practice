import java.util.Scanner;
public class LeapYear{
  static void checkLeapYear(int year){
    if((year%400==0) || (year%4==0 && year%100 != 0))
	{
       System.out.println(year+" is a LeapYear");
    }
    else
	{
       System.out.println(year+" is Not a LeapYear");
    }
}    
public static void main(String[]args){
Scanner ns=new Scanner(System.in);
System.out.println("Enter a Year :");
int year = ns.nextInt();
checkLeapYear(year);

ns.close();
}
}



