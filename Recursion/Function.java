import java.util.Scanner;

public class Function {
    
    public void count(int i, int count){
        if( i > count){
            return;
        }
        System.out.print(i + " ");
        
        count(i + 1, count);
    }
    public void revCount(int i, int count){
        if(i < 1){
            return;
        }
        System.out.print(i + " ");
        revCount(i-1, count);
    }

    public void backTrack(int i, int n){
        if(i < 1){
            return;
        }
        backTrack(i-1, n);
        System.out.print(i + " ");
    }

    public void backTrackRev(int i, int n){
        if( i > n){
            return;
        }
        backTrackRev(i+1, n);
        System.out.print(i + " ");
    }
    public static void main(String[] args) {
        Function f = new Function();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Linear: ");
        f.count(1, n);
        System.out.println();

        System.out.println("rev:");
        f.revCount(n, n);
        System.out.println();

        System.out.println("Backtracking linear: ");
        f.backTrack(n, n);
        System.out.println();

        System.out.println("BackTracking rev: ");
        f.backTrackRev(1,n);
    }
}
