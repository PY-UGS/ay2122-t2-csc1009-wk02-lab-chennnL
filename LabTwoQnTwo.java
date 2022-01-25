import java.util.Scanner;

public class LabTwoQnTwo {
    public static void main(String [] args) {
        System.out.print("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        float[] numArr = new float[size];
        for (int i = 0; i < size; i++) {
            numArr[i] = scanner.nextFloat();
        }
        scanner.close();
        double sum = 0;
        String s = "";
        for (int i = 0; i < size; i++) {
            sum += numArr[i];
            s = s + " " + String.valueOf(numArr[i]);
        }

        System.out.print("The average of" + s + " is " + sum / numArr.length);

        scanner.close();
    }
}
