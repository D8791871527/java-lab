import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci series: ");
        int n = input.nextInt();
        
        int f1 = 0, f2 = 1;
        System.out.print("Fibonacci Series: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(f1 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        
        input.close();
    }
}
