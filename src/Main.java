import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("Bir sayı giriniz : ");
            int number = input.nextInt();

            if (number % 2 == 0 || number % 4 == 0) {
                total += number;
            }

            if (number % 2 == 1) {
                break;
            }
        }

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı : " + total);
    }
}