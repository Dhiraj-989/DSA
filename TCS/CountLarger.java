public class CountLarger {

    public static void count(int[] arr){

        
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr = {7,4,8,2,9};
        count(arr);
    }
}
