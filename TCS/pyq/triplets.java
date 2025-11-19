import java.util.*;
class triplets{

	public static int triplet(int[] arr){
		Arrays.sort(arr);
		int limit = 1000;
		int steps = 0;
        

		while(limit-- > 0){
			if(arr[0] == arr[1] && arr[1] == arr[2]){
				return steps;
			}
			arr[0]++;
			arr[1]++;
			arr[2]--;
			steps++;
		}
		return -1;
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0){
			int[] arr = new int[3];
			for(int i = 0; i < 3; i++) arr[i] = sc.nextInt();
			int steps = triplet(arr);

			System.out.println(steps);

		}
	}
}