import java.util.*;
class add{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;

		if( st < 0 || end > 9999 || st > end){
            System.out.println("invalid");
            return;
        }
	
		for(int i = st; i<= end; i++){
			sum += i;
		}

		System.out.println(sum);
	}
}