package simple_com;
import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Ënter amount\n");
		double amt=sc.nextDouble();
		System.out.println("Ënter no of years\n");
		double noofyrs=sc.nextDouble();
		System.out.println("Ënter the rate of interest\n");
		double intrstrate=sc.nextDouble();
		System.out.println("Enter type of interest\n1)Simple Interest\n2)Compound Interest\n");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			simple_Interest si = new simple_Interest(amt,noofyrs,intrstrate);
			System.out.println("Simple Interest :"+si.calculate());
			break;
		case 2:
			compund_Interest ci = new compund_Interest(amt,noofyrs,intrstrate);
			System.out.println("Compound Interest :"+ci.calculat());
			break;
		default:
			System.out.println("Enter valid interest type in range 1 or 2\n");
			break;
		}
	}

}
