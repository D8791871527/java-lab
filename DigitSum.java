import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:-");
        int n=sc.nextInt();
        int r,s=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s+=r;
        }
        System.out.println("enter no:-"+s);
        
    }
}
