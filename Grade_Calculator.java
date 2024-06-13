import java.util.Scanner;

class Grade{
public String calculateGrade(double averagePercaentage){
    if(averagePercaentage >= 90){
       return "A";
    }else if (averagePercaentage >= 80){
        return "B";
    }
    else if (averagePercaentage >= 70){
        return "C";
    }
    else if (averagePercaentage >= 60){
        return "D";
    }
    else{
        return "F";
    }
}
}
public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Subjects : ");
        int Subjects = sc.nextInt();

        double[] marks = new double[Subjects];
        double t = 0; 
        int x = 0;

        for (int i = 0; i < Subjects; i++ ){
            System.out.print("Enter The Marks for Subject "+(i+1)+" => ");
            marks[i] = sc.nextDouble();
            if (marks[i] > 100){
               System.out.println("Invalid Input");
               x = 1;
               break;
            }else{
                t = t+marks[i];
            }
            
        }

        double averagePercaentage = t/Subjects;
        Grade g = new Grade();
        String grade = g.calculateGrade(averagePercaentage);
        if (x == 0){
        System.out.println("Total Marks : "+t);
        System.out.println("Average Percentage : "+averagePercaentage);
        System.out.println("Grade : "+ grade);
        }else{
            System.out.println("Retry");
        }
        sc.close();
        
    }
}
