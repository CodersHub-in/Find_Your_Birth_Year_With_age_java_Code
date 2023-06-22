import java.util.Scanner;

public class AnY {
    public static void main(String[] args) {
        Scanner snr = new Scanner(System.in);
        int age = snr.nextInt();
        int year = 2023 - age;
        System.out.println("Your birth year is  " + year);
    }
}
