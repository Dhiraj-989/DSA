public class QuickSort {
    public static void sort(int[] arr, int st, int end){
        if(st < end){
            int pivIdx = partition(arr, st, end);
            sort(arr, st, pivIdx-1);  // left half
            sort(arr, pivIdx+1, end); // right half
        }
    }

    public static int partition(int[] arr, int st, int end){
        int idx = st - 1;
        int pivot = arr[end];
        for(int j = st; j < end; j++){
            if(arr[j] <= pivot){
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp; 
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;
        return idx;

    }
    public static void main(String[] args) {
        int[] arr = {4,5,3,7,2,9};
        sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
