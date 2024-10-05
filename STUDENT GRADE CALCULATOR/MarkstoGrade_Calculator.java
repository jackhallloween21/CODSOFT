import java.util.*;
public class MarkstoGrade_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int num = in.nextInt();
        int[] marks = new int[num];
        int total = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = in.nextInt();
            
            // Validating if the input is between 0 and 100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid input! Please enter marks between 0 and 100: ");
                marks[i] = in.nextInt();
            }

            total += marks[i];
        }
        
        double average = (double) total / num; //as out of 100 

        char grade;
        if (average >= 90) 
        {
            grade = 'A';
        } 
        else if (average >= 80) {
            grade = 'B';
        } 
        else if (average >= 70) {
            grade = 'C';
        } 
        else if (average >= 60) {
            grade = 'D';
        }
            else if (average >= 50) {
                grade = 'E';
        } 
        else {
            grade = 'F';
        }
        System.out.println("\nResults ");
        System.out.println("Total Marks: " + total + " out of " + (num * 100));
        System.out.println("Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
        
    }
}
