import java.util.*;

public class ChainMarket{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String parent = sc.nextLine();
		String hasChild = sc.nextLine();
		String child = sc.nextLine();

		String[] elements = child.split(",");
		int count = elements.length;
		
		

		if(hasChild.equals("y")){
			System.out.println("Total members: " + (count + 1));
		
			System.out.println("Commission Details: ");
			
			System.out.println(parent + ":" + count*10*50);
			for(int i = 0; i < count; i++){
				System.out.println(elements[i] + ":" + 0.05*5000);
			}
		}
		else{
				System.out.println("Total members: " + 1);
		
				System.out.println("Commission Details: ");
				System.out.println(parent + ":" + 0.05*5000);
		}
	}
}	 
    

