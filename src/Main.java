import java.util.Scanner;

public class Main {
    public static final int FLIP_COIN = 1;
    public static final int LEAP_YEAR = 2;
    public static final int TWO_POWERS_TABLE = 3;
    static Scanner sc;

    public static void main(String[] args) {
        Main mainobj = new Main();
        System.out.println("Enter your choice : ");
        System.out.println(" 1 : Flip a coin ");
        System.out.println(" 2 : Check leap year ");
        System.out.println(" 3 : Print table of powers of two ");
        sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case FLIP_COIN:
                mainobj.flipCoin();
                break;
            case LEAP_YEAR:
                mainobj.isLeapYear();
                break;
            case TWO_POWERS_TABLE:
                mainobj.printPowersTable();
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
    }

    private void printPowersTable() {
        System.out.println("How many terms do you wants to print :");
        int uptoNum = sc.nextInt();
        int tableOf = 2;
        for (int powValue = 1; powValue <= uptoNum; powValue++) {
            int term = (int) Math.pow(tableOf, powValue);
            System.out.println(term);
        }
    }

    private void isLeapYear() {
        int year;
        boolean isLeap = false;
        System.out.println("Enter year");
        year = sc.nextInt();
        int digitCount = (int) Math.floor(Math.log10(year) + 1);
        isLeap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        if (digitCount == 4) {
            System.out.println(isLeap ? year + " is leap year" : year + " is not leap year");
        } else
            System.out.println("Invalid year");
    }

    private void flipCoin() {
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