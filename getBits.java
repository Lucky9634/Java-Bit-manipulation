
import java.util.Scanner;

/**
 * getBits
 */
public class getBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Bit Number: ");
        int n = input.nextInt();
        System.out.print("Enter The Position To Find Bits: ");
        int pos = input.nextInt();
        
        int BM = 1<<pos; 

        if((BM & n) == 0){
            System.out.println("Bit Was Zero");
        }else{
            System.out.println("Bit Was One");
        }
    }
}