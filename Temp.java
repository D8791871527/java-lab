import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temprature in celcius");
        float c = sc.nextInt();

        float f = (c * 9) / 5 + 32;
        System.out.println("fh temp" + f);

    }
}
