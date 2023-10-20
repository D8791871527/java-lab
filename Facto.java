import java.util.Scanner;
public class Facto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(":enter no:-");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            if(n==0){
                f=1;
            }
            else{
                f=f*i;
            }
        }
        System.out.println(":fact no:-"+f);
        
    }
}
