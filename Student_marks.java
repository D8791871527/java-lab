import java.util.Scanner;

public class Student_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student name:-");
        String name= sc.nextLine();

        System.out.println("enter the class:-");
        int Class=sc.nextInt();
        
        System.out.println("enter the physics marks:-");
        int ph=sc.nextInt();

        System.out.println("enter the biology marks");
        int bio=sc.nextInt();
        
        System.out.println("enter the chemistry marks::-");
        int chem=sc.nextInt();
        
        
        System.out.println("enter the math marks:-");
        int math=sc.nextInt();
        
        System.out.println("enter the eng marks:-");
        int eng=sc.nextInt();
        
        float avg=(ph+bio+chem+math+eng)/5;
        float per=(ph+bio+chem+math+eng)*100/500;
        
        System.out.println("enter the average of marks:-"+avg);
        
        System.out.println("enter the eng marks:-"+eng);
        System.out.println("enter the math marks:-"+math);
        System.out.println("enter the biology marks:-"+bio);
        System.out.println("enter the chemistry marks:-"+chem);
        System.out.println("enter the physics marks:-"+ph);
    
        
    }
}
