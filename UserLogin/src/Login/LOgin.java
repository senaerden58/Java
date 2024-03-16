package Login;
import java.util.Scanner;
public class LOgin {
	public static void main(String[] args)
	{
		String userName,password;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Username: ");
		userName=input.nextLine();
		
		if(userName.equals("patika"))
		{
			System.out.print("Password: ");
			password=input.nextLine();
			if(password.equals("sena"))
			{
				System.out.println("Correct.Entry successful");
			}
			else
			{
				System.out.println("Password is incorrect.");
			}
		}
		else
		{
			System.out.println("Username is wrong.");
		}
	}
}
