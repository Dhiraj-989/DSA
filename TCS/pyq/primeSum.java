import java.util.*;
public class primeSum{

	public static boolean isPrime(int n){
        if(n < 2) return false;
        int count = 0;
		for(int i = 1; i*i <= n; i++){
			if(n % i == 0){
                count++;
                if(n / i != i) count++;
            }
		}

		if(count == 2){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;

		for(int i = 0; i<n; i++){
			if(isPrime(i)){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
		
			
			