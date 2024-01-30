import java.util.Scanner;

public class StudentMarksCalculator {
    public static void calculateGrade(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student Grade Calculator.");
        System.out.print("Enter Mathematics marks : ");
        int Mathematics = input.nextInt();
        System.out.print("Enter Physics marks : ");
        int Physics = input.nextInt();
        System.out.print("Enter Chemistry marks : ");
        int Chemistry = input.nextInt();
        int totalMarksObtained = Mathematics+Physics+Chemistry;
        System.out.println("Your total marks are : "+totalMarksObtained+".");
        double averagePercentage = totalMarksObtained/3;
        System.out.println("Your averagePercentage is : "+averagePercentage+"%");
        if(averagePercentage <= 100 && averagePercentage > 90){
            System.out.println("Your grade is : A+");
        }
        else if(averagePercentage <= 90 && averagePercentage > 80){
            System.out.println("Your grade is : A");
        }
        else if(averagePercentage <= 80 && averagePercentage > 70){
            System.out.println("Your grade is : B+");
        }
        else if(averagePercentage <= 70 && averagePercentage > 60){
            System.out.println("Your grade is : B");
        }
        else if(averagePercentage <= 60 && averagePercentage > 50){
            System.out.println("Your grade is : C+");
        }
        else if(averagePercentage <= 50 && averagePercentage > 33){
            System.out.println("Your grade is : C");
        }
        else{
            System.out.println("Your grade is D and You are Fail.");
        }
    }
    public static void main(String[] args) {
        calculateGrade();
        System.out.println("Thank You for using Student Grade Calculator.");
    }
}
