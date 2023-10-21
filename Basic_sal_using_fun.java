import java.util.Scanner;

public class Basic_sal_using_fun {
    static float Emplsal(float bs) {
        return (bs * 30) / 100;
    }

    static float da(float bs) {
        return (bs * 20) / 100;
    }

    static float ta() {
        return 2000;
    }

    static float hra(float bs) {
        return (bs * 30) / 100;
    }

    static float tax(float income) {
        float tax = 0.0f;
        if (income < 10000) {
            System.out.println("NO tax below  income 10k:-");
        } else if (income >= 10000 && income < 20000) {
            tax = income * 0.10f;
            System.out.println("10% tax income is between 10k-20k:-");
        } else if (income >= 20000 && income < 30000) {
            tax = income * 0.15f;
            System.out.println("15% tax income is between 20k-30:-k");
        } else {
            tax = income * 0.25f;
        }
        return tax;
    }

    static float grossSal(float bs) {
        float grossSal = bs + hra(bs) + da(bs) + ta();
        return grossSal;
    }

    static float netsal(float bs) {
        float net = grossSal(bs) - tax(bs);
        return net;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employ name:-");
        String name = sc.nextLine();
        System.out.println("enter basic salary");
        float bs = sc.nextFloat();
        System.out.println("employs details:-");

        System.out.println("Employee name: " + name);
        System.out.println("Basic Salary: " + bs);
        System.out.println("HRA: " + hra(bs));
        System.out.println("DA: " + da(bs));
        System.out.println("TA: " + ta());
        System.out.println("Gross Salary: " + grossSal(bs));
        System.out.println("Income Tax: " + tax(grossSal(bs)));
        System.out.println("Net Salary: " + netsal(bs));
    }
}
