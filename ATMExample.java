package OtherEasyOne;
import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		
		 int balance = 10000, withdraw,deposit;
		 Scanner sc = new Scanner(System.in);
		 
		 
		 while(true) {
			 
			 System.out.println("Automated Teller Machine");
			 System.out.println("Choose 1 Withdraw");
			 System.out.println("Choose 2 Deposit");
			 System.out.println("Choose 3 Check Balance");
			 System.out.println("Choose 4 for Exit");
			 System.out.println("Choose the operation What you wanna perform :");
			 
			 
			 int choice = sc.nextInt();
			 switch(choice) {
			 
			 case 1: 
				 System.out.println("Choose the amount to withdrawn :");
				 withdraw = sc.nextInt();
				 if(balance >= withdraw) {
					 balance= balance - withdraw;
					 System.out.println("Please collect money:");
					 
				 }
				 
				 else {
					 System.out.println(" Insufficient Balance...");
				 }
				 
				 System.out.println(" ");
				 break;
			 
			 
			 case 2:
				 	System.out.print("Enter money to be deposited:");  
                 
			        deposit = sc.nextInt();  
			                      
			        balance = balance + deposit;  
			        System.out.println("Your Money has been successfully deposited");  
			        System.out.println("");  
			        break; 
			  
			       
			 case 3:
				 	System.out.println("The Updated Balance :" + balance);
				 	System.out.println(" ");
				 	break;
				 	
			 case 4:
				 	System.exit(0);
				 	
			 }      
		 }

	}

}
