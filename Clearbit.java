
import java.util.Scanner;

public class Clearbit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = input.nextInt();
        System.out.print("Enter The Position: ");
        int pos = input.nextInt();

        int Bit_Mark = 1 << pos;

        int not = ~(Bit_Mark);

        int finil = not & n;

        System.out.println(finil);
    }
}
