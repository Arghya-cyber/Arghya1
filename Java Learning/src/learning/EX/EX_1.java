package learning.EX;
import java.util.Scanner;

public class EX_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        System.out.println("Subject 1:");
        float sub1 = sc.nextFloat();

        System.out.println("Subject 2:");
        float sub2 = sc.nextFloat();

        System.out.println("Subject 3:");
        float sub3 = sc.nextFloat();

        System.out.println("Subject 4:");
        float sub4 = sc.nextFloat();

        System.out.println("Subject 5:");
        float sub5 = sc.nextFloat();

        float total = sub1+sub2+sub3+sub4+sub5;

        float per = total/5;

        System.out.println("Your percentage is: "+per+"%");

    }

}
