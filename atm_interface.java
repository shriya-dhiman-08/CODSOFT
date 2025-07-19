//atm interface
import java.util.Scanner;
interface user_acc{
	public void check_balance();
}
class atm_machine implements user_acc{
	int principle=3000;
	public void withdrawing(int amount)
	{
		if(principle>1000 && principle>amount)
		{
			principle=principle-amount;
			System.out.println("Amount "+amount+" is withdrawen and principle left is "+principle);
		}
		else{
			System.out.println("Not enough money!");
		}
	}
	public void depositing(int amount)
	{
		principle=principle+amount;
		System.out.println("After depositing "+amount+" principle is "+principle);
	}
	public void check_balance()
	{
		System.out.println("Checking Balance...");
		System.out.println("Balance is: "+principle);
	}
}
public class atm_interface{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		atm_machine am=new atm_machine();
		
		am.check_balance();
		
		System.out.print("Enter the amount to be withdrawen:");
		int withdraw=sc.nextInt();
		am.withdrawing(withdraw);
		am.check_balance();
		
		System.out.print("Enter the amount to be deposited:");
		int dipo=sc.nextInt();
		am.depositing(dipo);
		am.check_balance();
		
		
	}
}