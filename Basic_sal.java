import java.util.Scanner;

public class Basic_sal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("basic salery of user:");
        float bs = sc.nextInt();
        float hr = (bs * 30) / 100;
        float ta = (bs * 20) / 100;
        float da = (bs * 10) / 100;
        int pf = 1500;
        float net_salery = bs + hr + ta + da - pf;
        System.out.println("net salery is:" + net_salery);

    }

}
