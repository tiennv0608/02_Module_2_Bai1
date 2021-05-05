import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value (USD):");
        int usd = sc.nextInt();
        int vnd = usd * rate / 1000;
        System.out.println("This will be "+vnd+ "000 VND");
    }
}
