public class InsertionSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while( j > 0 && arr[j-1]> arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,3,89,54};
        sort(arr);

    }
}
