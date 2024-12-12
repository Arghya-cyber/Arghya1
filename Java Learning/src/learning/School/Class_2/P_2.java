package learning.School.Class_2;
import java.util.Scanner;

public class P_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i<10; i++){
            int num = sc.nextInt();
            boolean b1 = ((num%2)==0);
            if (b1) evenCount += 1;
            else oddCount += 1;
        }
        System.out.printf("Even number count: %d\n",evenCount);
        System.out.printf("Odd number count: %d\n",oddCount);
    }
}
