import java.util.Scanner;
public class Atm{
public void main (String[]args)
{  
Scanner obj =new Scanner(System.in);
String Password = "1403";
int Balance=10000;

System.out.println("Enter your Name :");
String name=obj.nextLine();
System.out.println("Enter your Phone Number :");
String Phone_number=obj.nextLine();
System.out.println("Enter your Password :");
String MyPassword=obj.nextLine();
   if(MyPassword.equals(Password))
   {
	   System.out.println(" LOGIN IS SUCCESSFUL NEELAVENI !");
	   
	   System.out.println(" Enter your Choice :");
	   int choice=obj.nextInt();
       
        switch(choice){
			case 1 :
			   System.out.println("Enter amount to deposit :");
			   int Deposit=obj.nextInt();
			   Balance += Deposit;
			   System.out.println(" Current Balance :" +Balance);
			   System.out.println(" Deposited successfully ");
			   break;
			case 2 :
			   System.out.println(" Enter amount to be Withdrawal :");
			   int Withdrawal=obj.nextInt();
			   Balance -= Withdrawal;
			   System.out.println(" Current Balance :" +Balance);
			   System.out.println(" Withdrawal successfully ");
			   break;
			case 3 :   
			   System.out.println(" YOUR CURRENT BALANCE :"+Balance);
			   break;
			case 4 :
			   System.out.println(" DO YOU WANT TO EXIT ");
			   break;
			default:
			System.out.println(" TRY AGAIN ");
			break;
		    }
        }
		
   else{
	   System.out.println("  INCORRECT PASSWORD : ACCESS DENIED ");
   }
   
}
}

			   
			
			
			
			   
			
			

