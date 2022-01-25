import java.util.Scanner;

public class LabTwoQnOne {
    static final double PI = 3.14159;

    public static void main(String [] args){
        System.out.print("Enter radius of circle: ");
        Scanner scanner = new Scanner(System.in);
        Double radius = scanner.nextDouble();

        Double area = PI * radius * radius;
        System.out.println("Area of circle with " + radius + " is " + area);

        scanner.close();
    }
}
