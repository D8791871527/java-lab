import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the palindrone no:-");
        int n=sc.nextInt();
        int rev=0;
        int orignum=n;
        while(n>0)
        {
            
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(orignum==rev)
        {
            System.out.println(orignum+" is a palindrome no");
        }
        else{
            System.out.println(orignum+"  is not a  palimdrone no");
            sc.close();
            
        }
    }
}
