
import java.util.Scanner;

public class BitManupation {
    public static void main(String[] args) {
        System.out.println("Welcome To The Bit Manupation.");
        Scanner input = new Scanner(System.in);
        

        int i = 0;
        while(i<5){
            System.out.print("Please Choose And Enter The Number What Do You Want: \n1. Get The Bit Zero Or One. \n2. Set The Bit. \n3. Clear The Bit.\n4. Update The Bit.\nEnter The Here: ");
            int num = input.nextInt();
            switch (num) 
            {
                case 1:
                    System.out.println("Welcome To The Get Bit.");
                    System.out.print("Enter Your Number: ");
                    int n = input.nextInt();
                    System.out.print("Enter Your Position No.: ");
                    int pos = input.nextInt();
                    int Bit_Mark = 1 << pos;
                    if((Bit_Mark & n)==0){
                        System.out.println("Bit Is Zero");
                    }else{
                        System.out.println("Bit Is One");
                    }
                    break;
                case 2:
                    System.out.println("Welcome To The Set Bit.");
                    System.out.print("Enter Your Number: ");
                    n = input.nextInt();
                    System.out.print("Enter Your Position No.: ");
                    pos = input.nextInt();
                    Bit_Mark = 1 << pos;
                    int setNot = Bit_Mark | n;
                    System.out.println(setNot);
                    break;
                case 3:
                    System.out.println("Welcome To The Clear Bit.");
                    System.out.print("Enter Your Number: ");
                    n = input.nextInt();
                    System.out.print("Enter Your Position No.: ");
                    pos = input.nextInt();
                    Bit_Mark = 1 << pos;
                    int invert = ~(Bit_Mark);
                    int finilValue = invert & n;
                    System.out.println(finilValue);
                    break;
                case 4:
                    System.out.println("if You Set The Bit Use Number 1.");
                    System.out.println("if You Clear The Bit Use Number 2.");
                    break;
                default:
                    System.out.println("Enter The Valid Number.");
            }

            i++;
        }
    }
}
