import java.util.Scanner;

public class DayOfWE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        
        // Check if the input is within the valid range
        // if (dayNumber >= 1 && dayNumber <= 7) {
            // Use a switch statement to print the corresponding day//
            switch (dayNumber) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:System.out.println("Invalid input from user:");    
            }
        
        }
        
    }
// }
