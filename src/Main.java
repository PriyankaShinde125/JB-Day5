import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to flip coin");
        int num = sc.nextInt();
        int head = 0;
        int tails = 0;

        for (int flip = 0; flip < num; flip++) {
            int toss = (int) (Math.random() * 2);
            if (toss == 1)
                head++;
            else
                tails++;
        }

        double headPercentage = head * 100 / num;
        double tailsPercentage = tails * 100 / num;
        System.out.println("Heads = " + head);
        System.out.println("Tails = " + tails);
        System.out.println("Percentage of head = " + headPercentage);
        System.out.println("Percentage of tails = " + tailsPercentage);
    }
}