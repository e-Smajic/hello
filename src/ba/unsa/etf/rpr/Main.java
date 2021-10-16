package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    static int sumaCifara (int num) {
        int suma = 0;
        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int number = input.nextInt();

        if (number < 1)
            System.out.println("Neispravan unos!");
        else {
            System.out.println("Brojevi:");
            for (int i = 1; i <= number; i++) {
                if (i % sumaCifara(i) == 0)
                    System.out.print(i + " ");

                if (i == number) break;					//Escape za mogucu beskonacnu petlju
            }
        }
    }
}
