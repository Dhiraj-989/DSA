public class ReverseArray {
    public static void reverse(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, left + 1, right -1);
    }
    public static void onePtr(int[] arr, int i){
        int n = arr.length;
        if( i >= n / 2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        onePtr(arr, i+1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] arr2 = {1,2,3,4,5,6};
        onePtr(arr2, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
