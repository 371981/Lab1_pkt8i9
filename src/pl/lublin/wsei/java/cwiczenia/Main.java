package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;
// pomyślalem że wygodniej będzie robić pkt 8 na bazie funkcji zgodnie z https://1024kb.pl/nauka-java/funkcje-w-jezyku-java/

public class Main {

/*    public static void pkt8(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.print("Podaj piwerwszą liczbę: ");
            num1 = input.nextInt();
            if (num1!=0)
            {
                System.out.print("Podaj drugą liczbę: ");
                num2 = input.nextInt();
            }
            System.out.printf("SUMA: %d + %d = %d%n", num1, num2, num1 + num2);
        }
        while ((num1!=0) && (num2!=0));
//(„num2 might not be initialized” - num2 mogło niebyć zainicjowane

    }
 */

    public static void pkt8_a() {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        do {
            System.out.print("Podaj piwerwszą liczbę: ");
            num1 = input.nextInt();
            if (num1 != 0) {
                System.out.print("Podaj drugą liczbę: ");
                num2 = input.nextInt();
            }
            System.out.printf("SUMA: %d + %d = %d%n", num1, num2, num1 + num2);
        }
        while ((num1 != 0) && (num2 != 0));
    }

    public static void pkt8_d() {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        do {
            System.out.print("Podaj piwerwszą liczbę: ");
            num1 = input.nextInt();
            if (num1 == 0) break;

            System.out.print("Podaj drugą liczbę: ");
            num2 = input.nextInt();
            if (num2 == 0) break;

            System.out.printf("SUMA: %d + %d = %d%n", num1, num2, num1 + num2);
        }
        while (true);
    }

    public static void pkt8_e() {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        do {
            System.out.print("Podaj licze do dodania (rozdzielone spacjami lub TABem): ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if ((num1 == 0) || (num2 == 0)) break;

            System.out.printf("SUMA: %d + %d = %d%n", num1, num2, num1 + num2);
        }
        while (true);
    }


    public static void main(String[] args) {
	// write your code here

        //pkt8();
        System.out.println("\n__________________________________________________________\n");
        System.out.print("Podanie '0' zakończy program\n");
        pkt8_a();
        System.out.println("\n__________________________________________________________\n");
        pkt8_d();
        System.out.println("\n__________________________________________________________\n");
        pkt8_e();

    }
}
