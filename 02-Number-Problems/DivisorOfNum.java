
import java.util.Scanner;

class DivisorOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        System.out.print("Divisors are: ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
