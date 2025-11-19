

public class SmallestNLargest2nd {
    
    /* // using sort
    public static void res(int[] arr){
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[arr.length - 2];
        System.out.println("second smallest: " + small);
        System.out.println("Second Largest: " + large);
    } */

    /* // two pass 
    public static void res(int[] arr){
        int min = Integer.MAX_VALUE;   //set the max value as min so to update later 
        int max = Integer.MIN_VALUE;    // set the min value

        for(int num : arr){
            if(num < min) min = num;    // update min and max value
            if(num > max) max = num;
        }

        int secondMin = Integer.MAX_VALUE;   // same as max and min and update second max min
        int secondMax = Integer.MIN_VALUE;
        for(int num : arr){
            if( num > min && num < secondMin){
                secondMin = num;
            }
            if( num < max && num > secondMax){
                secondMax = num;
            }
        }
        System.out.println("Second smallest: " + secondMin);
        System.out.println("Second Largest: " + secondMax);
    } */

    //single pass
    public static void res( int[] arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : arr){
            //for max
            if(num > max1){
                max2 = max1;
                max1 = num;
            }else if(num > max2 && num != max1){
                max2 = num;
            }

            // for min

            if(num < min1){
                min2 = min1;
                min1 = num;
            }else if(num < min2 && num != min1){
                min2 = num;
            }
            
        
        }
        System.out.println("Second min: " + min2);
        System.out.println("Second max: " + max2);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,7,700000000,53545};

        res(arr);
        
    }
}

    

