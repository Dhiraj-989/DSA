import java.util.Scanner;

public class OxygenLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] batch = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                batch[i][j] = sc.nextInt();
                if(batch[i][j] < 1 || batch[i][j] > 100){
                    batch[i][j] = 0;
                    System.out.println("invalid input");
                }
            }
        }

        int avg[] = new int[3];
        int max = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                avg[i] = avg[i] + batch[j][i];
            }
            avg[i] = avg[i] / 3;
        }

        for (int i = 0; i < 3; i++) {
            if(avg[i] > max){
                max = avg[i];
            }
        }

        for (int i = 0; i < avg.length; i++) {
            if(avg[i] == max){
                System.out.println("trainee number: " + (i + 1));
            }
            if(avg[i] <= 70){
                System.out.println("trainees are unfit");
            }
        }


        

    }
}
