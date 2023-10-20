import java.util.Scanner;
public class REC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int l=sc.nextInt();
        
        System.out.println("enter the breath");
        int b=sc.nextInt();
        int r=l*b;
        System.out.println("area of rec:"+r);
        

    }
}
