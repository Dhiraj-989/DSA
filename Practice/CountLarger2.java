public class CountLarger2 {

    public static void count(int[] arr){
        int max = arr[0];
        int count = 1;
        

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                count++;
                max = arr[i];

            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,6};
        count(arr);
    }
}
