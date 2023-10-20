import java.util.*;
public class Weekend {
    public static void main(String[] args) {
        Scanner Deepak=new Scanner(System.in);
        System.out.print("Enter a day of the week (e.g., Monday, Tuesday, ...): ");
        String dayOfWeek = Deepak.nextLine().toLowerCase();

        switch (dayOfWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It's a weekday.");
                break;
            case "saturday":
            case "sunday":
                System.out.println("It's a weekend day.");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid day of the week.");
        }

        Deepak.close();
    }
}
