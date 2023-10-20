import java.util.Scanner;

public class Reverseno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int reverse = 0;
        int no = input.nextInt();

        while (no != 0) {
            int remainder = no % 10;
            reverse = reverse * 10 + remainder;
            no /= 10;
        }

        System.out.println("Reversed number: " + reverse);

        input.close();

    }
}
