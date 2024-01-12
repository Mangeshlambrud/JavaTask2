import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalmarks = 0;
        int totalSubjects;
        double averagePercentage;

        //Input the total number if subjects
        System.out.print("Enter the total number of subjects: ");
        totalSubjects = sc.nextInt();

        for (int i = 1; i<=totalSubjects; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            totalmarks += marks;
        }

        //Calculate average percentage
        averagePercentage = (double) totalmarks / totalSubjects;

        //Assign Grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A'; 
        }
        else if (averagePercentage >= 80) {
            grade = 'B';
        }
        else if (averagePercentage >= 70) {
            grade = 'C';
        }
        else if (averagePercentage >= 60) {
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        //Display Result
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade " + grade);

        sc.close();
    }
    
}
