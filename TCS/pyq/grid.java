import java.util.*;
public class grid{

	public static int result(int[][] grid, int i, int j, int m, int n){
		if( i == m || j == n) return 0;

		if(grid[i][j] == 1) return 0;

		if(i == m - 1 && j == n - 1) return 1;

		return result(grid, i+1, j, m, n) + result(grid, i, j+1, m, n);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

        int[][] grid = new int[m][n];

		for(int i=0; i<m; i++){
			for(int j = 0; j< n; j++){
				grid[i][j] = sc.nextInt();
			}
		}

 		int res = result(grid, 0, 0, m, n);
		System.out.println(res);

	}
}