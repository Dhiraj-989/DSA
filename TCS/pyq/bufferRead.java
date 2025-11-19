import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class bufferRead{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		String[] input = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(input[i]);
		}

		for( int num : arr){
			System.out.println(num + " ");
		}
	}
}