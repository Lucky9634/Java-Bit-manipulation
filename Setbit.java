
import java.util.Scanner;

public class Setbit {
    public static void main(String[] args) {
        System.out.println("Welcome To The Set Bits.");
        int i = 0;
        while (i<5) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Your Number: ");
            int n = input.nextInt();
            System.out.print("Enter Your Position: ");
            int pos = input.nextInt();

            int BitMarks = 1 << pos;
            int newNumber = BitMarks | n;

            System.out.println(newNumber); 
            i++;
        }
    }
}
