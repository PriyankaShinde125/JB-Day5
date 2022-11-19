import java.util.Scanner;

public class Main {
    public static final int FLIP_COIN = 1;
    public static final int LEAP_YEAR = 2;
    public static final int TWO_POWERS_TABLE = 3;
    public static final int HARMONIC_NUMBER = 4;
    public static final int PRIME_FACTORS = 5;
    static Scanner sc;

    public static void main(String[] args) {
        Main mainObj = new Main();
        System.out.println("Enter your choice : ");
        System.out.println(" 1 : Flip a coin ");
        System.out.println(" 2 : Check leap year ");
        System.out.println(" 3 : Print table of powers of two ");
        System.out.println(" 4 : Find nth harmonic number ");
        System.out.println(" 5 : Print all prime factors of given number ");
        sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case FLIP_COIN:
                mainObj.flipCoin();
                break;
            case LEAP_YEAR:
                mainObj.isLeapYear();
                break;
            case TWO_POWERS_TABLE:
                mainObj.printPowersTable();
                break;
            case HARMONIC_NUMBER:
                mainObj.getHarmonicNum();
                break;
            case PRIME_FACTORS:
                mainObj.printPrimeFactors();
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
    }

    private void printPrimeFactors() {
        System.out.println("Enter a number");
        int num = sc.nextInt();

        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num = num / 2;
        }

        for (int i = 3; (i * i) <= num; i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }

        if (num > 2)
            System.out.print(num);
    }

    private void getHarmonicNum() {
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num != 0) {
            double harmonicNumber = 0;
            for (int term = 1; term <= num; term++) {
                harmonicNumber += (double) 1 / term;
            }
            System.out.println("Harmonic number = " + harmonicNumber);
        } else {
            System.out.println("Enter positive number ");
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