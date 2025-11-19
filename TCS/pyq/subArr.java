import java.util.*;
public class subArr{
    public static void res(int[] arr,int n, int k){
		int count = 0;
		int prefSum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0,1);
		
		for(int i = 0; i<n; i++){
			prefSum += arr[i];
			int remove = prefSum - k;
			if(map.containsKey(remove)){
				count += map.get(remove);
			}

			if(map.containsKey(prefSum)){
				map.put(prefSum, map.get(prefSum) + 1);
			}else{
				map.put(prefSum, 1);
			}
					}
		System.out.println(count);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		
		for(int i = 0; i < n ; i++){
			arr[i] = sc.nextInt();
		}

		
		int count = 0;

		for(int i = 0; i < n; i++){
            int sum = 0;
			for(int j = i; j < n; j++){
				sum += arr[j];
                if(sum == k){
				count++;
			}
			
			}
		}
		System.out.println(count);

        res(arr, n, k);
	}
}
		
		