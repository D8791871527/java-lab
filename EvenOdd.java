import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting no:-");
        int n=sc.nextInt();
        System.out.println("enter ending no:-");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(i%2==0){
                System.out.println("even:-"+i);
            }
            else {
                System.out.println("odd:-"+i);
            }
        }

    }
}
