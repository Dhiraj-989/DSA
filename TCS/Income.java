
import java.util.*;
public class Income{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int totalIncome = 0;
		int totalExp = 0;
		String[] typeArr = new String[100];
		int[] expArr = new int[100];
		int count = 0;

		
		while(true){
			System.out.println("Enter income (or 'done' to finish): ");
			String input = sc.next();
			
			if(input.equalsIgnoreCase("done")){
				break;
			}

			int income = Integer.parseInt(input);
			totalIncome += income;

			System.out.println("Enter type of material: ");
			String type = sc.next();

		    System.out.println("Enter expenditure on " + type + ":" );
			int exp = sc.nextInt();

			typeArr[count] = type;
			expArr[count]= exp;
            count++;
			totalExp += exp;

		}

		
		System.out.println("Total income: " + totalIncome);
		System.out.println("Savings: " + (totalIncome - totalExp));
		

		for(int i = 0; i < count; i++){
			System.out.println(typeArr[i] + " -> " + expArr[i]);
		}

	}
}






		