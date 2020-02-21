package simple_com;
import java.util.Scanner;

public class Construction {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Ënter total area");
		double area=sc.nextDouble();
		System.out.println("Enter type of standard\n1)Standard_material\n2)High_material\n3)Material\n4)Fully_automated");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			standard_Material sm = new standard_Material(area);
			System.out.println("Simple interest =" +sm.calculate());
			break;
		case 2:
			high_Material hm = new high_Material(area);
			System.out.println("Total cost =" +hm.calculate());
			break;
		case 3:
			material m = new material(area);
			System.out.println("Total cost =" +m.calculate());
			break;
		case 4:
			fully_Automated fm = new fully_Automated(area);
			System.out.println("Total cost ="+fm.calculate());
			break;
		default:
			System.out.println("Enter valid type in range 1 to 4");
			break;
		}
		
	}
}
