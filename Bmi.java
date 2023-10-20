import java.util.Scanner;
public class Bmi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the weight");
        float weight=sc.nextFloat();
        
        System.out.println("enter the height");
        float  height=sc.nextFloat();
        
        float bmi=weight/(height*height);
        System.out.println("bmi is"+bmi);
        
    }
}
