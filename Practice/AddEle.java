import java.util.Scanner;

public class AddEle {

    public static int[] addAtBegin(int[] arr, int val){
        int[] arrN = new int[arr.length + 1];
        arrN[0] = val;

        for (int i = 0; i < arr.length; i++) {
            arrN[i+1] = arr[i];
        }

        return arrN;
    }

    public static int[] addAtEnd(int[] arr, int val){
        int[] arrN = new int[arr.length + 1];

        int n = arrN.length;

        arrN[n-1] = val;

        for (int i = 0; i < arr.length; i++) {
            arrN[i] = arr[i];
        }
        return arrN;
    }

    public static int[] addAtPos(int[] arr, int val, int pos){
        int[] arrN = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arrN[i] = arr[i];
        }

        arrN[pos] = val;

        for (int i = pos ; i < arr.length; i++) {
            arrN[i+1] = arr[i];
        }
        return arrN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        arr = addAtBegin(arr, 6);
        arr = addAtEnd(arr, 7);
        arr = addAtPos(arr,8,4);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
