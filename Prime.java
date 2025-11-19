public class Prime {
    public static void brutePrime(int n, int count){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(n + " is Prime");
        }else{
            System.out.println(n + "is Not Prime");
        }
    }

    public static void optimalPrime(int n , int count){
        for (int i = 1; i*i < n; i++) {
            if(n % i == 0){
                count++;

                if(n/i != i){
                    count++;
                }
                
            }
        }
        if(count == 2){
        System.out.println(n + " is Prime");
        }else{
            System.out.println(n + " is not Prime");
        }
    }
    public static void main(String[] args) {
        int n = 2;
        int count = 0;

        brutePrime(n, count);
        optimalPrime(n, count);
        
    }
}
