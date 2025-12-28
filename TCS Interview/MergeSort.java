import java.util.ArrayList;

public class MergeSort {
    public static void sort(int[] arr, int st, int end){
        if(st < end){
        int mid = st + (end-st) / 2;
        sort(arr, st, mid);
        sort(arr, mid+1, end);
        merge(arr, st, mid, end);
        }
    }

    public static void merge(int[] arr, int st, int mid, int end){
        int i = st;
        int j = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }

        while(j <= end){
            temp.add(arr[j]);
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            arr[k + st] = temp.get(k);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,5,7};
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
