public class BubbleSort {
    public static void sortBubble(int[] arr){
        int n = arr.length;

        for (int i = n-1 ; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp; 
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,55,6,6,33};
        sortBubble(arr);

    }
}
