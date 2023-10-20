import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of rectangle:");
        int n=sc.nextInt();
        System.out.println("enter the breath:");
        int b=sc.nextInt();
        int area=n*b;
    
        System.out.println("area of rectangle:"+area);
    }
}
