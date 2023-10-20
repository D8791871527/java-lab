import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("enter no:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=1;
        for(int i=2;i<=9; i++)
        {
            if(n%i==0){
                flag=0;
                break;
            }
        
        }
        if(flag==1)
        {
            System.out.println("prime no:");
        }
        else{
            System.out.println("not prime");
        }
        sc.close();
    }
}
