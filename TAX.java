import java.util.Scanner;

public class TAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income:-");
        int income = sc.nextInt();

        double tax = 0.0;
        if (income < 10000) {
            System.out.println("NO tax below  income 10k:-");
        } else if (income >= 10000 && income < 20000) {
            tax = income * 0.10;
            System.out.println("10% tax income is between 10k-20k:-");
        } else if (income >= 20000 && income < 30000) {
            tax = income * 0.15;
            System.out.println("15% tax income is between 20k-30:-k");
        } else {
            tax = income * 0.25;
        }

        System.out.println("Your income tax is: " + tax);

    }
}
