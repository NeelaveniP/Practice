public class Nestedif{
public static void main(String[] args){
int age=21;
String nationality="American";
boolean isvoter_id= true;

if (age>=18)
{
	if (nationality.equals("Indian"))
	{
		if(isvoter_id)
		{
			System.out.println("you are eligible to vote");
		}
        else{
	        System.out.println("you are not eligible to vote");
		}
    }
    else{
		System.out.println("you are not eligible to vote");
	}
}
else{
System.out.println("you are not eligible to vote");
}
}
}