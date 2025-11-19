
public class FindSmallestInArray{

    public static int smallest(int[] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int[] arr = {10,4,3,5,6};
        System.out.println(smallest(arr));
    }

}