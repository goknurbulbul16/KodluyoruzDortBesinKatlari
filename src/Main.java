import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();
        System.out.println("--------------------");


        for (int j = 1; j <= number; j *= 5) {
            System.out.println("5' in Katları :" + j);
        }
        System.out.println("--------------------");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println("4' ün Katları :" + i);
        }

    }
}