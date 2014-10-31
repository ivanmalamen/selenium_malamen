import Lesson2.PrimeNumber;
import java.util.Scanner;

/**
 * Created by admin on 20.10.2014.
 */
public class Impl {
    public static void main(String[] args) {
        PrimeNumber Prime = new PrimeNumber();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (Prime.detPrime(num)) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }
}
