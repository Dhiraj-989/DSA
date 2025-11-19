public class DUPRemoveUnsorted {
    public static void main(String[] args) {
        int[] arr = {2,3,1,9,3,1,3,9};

        int[] marked = new int[arr.length];

        for (int i = 0; i < marked.length; i++) {
            marked[i] = 1;
        }

        for (int i = 0; i < marked.length; i++) {
            if(marked[i] == 1){
                for (int j = i+1; j < marked.length; j++) {
                    if(arr[i] == arr[j]){
                        marked[j] = 0;
                    }
                }
            }
        }
        
        for (int i = 0; i < marked.length; i++) {
            if(marked[i] == 1){
                System.out.print(arr[i]);
            }
        }
    }
}
