import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the leap year:-");

        int y=sc.nextInt();
        int a=y%4;
        int b=y%100;
        int c=y%400;
        if(a==0 && b!=0 ||c==0 ){
            System.out.println("this year is leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
        
        



    }



}
