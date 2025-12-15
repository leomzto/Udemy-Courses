public class Exercise18 {

    public static void main(String[] args) {

        // Integer.parseInt(args[0]) allows all grades to be tested
        // Do not change this line:
        int studentScore = Integer.parseInt(args[0]);

        char grade;

        // Write the if / else if / else statement here:
        if (studentScore >= 90 && studentScore <= 100)
            grade = 'A';
        else if (studentScore >= 80 && studentScore <= 89)
            grade = 'B';
        else if (studentScore >= 70 && studentScore <= 79)
            grade = 'C';
        else if (studentScore >= 60 && studentScore <= 69)
            grade = 'D';
        else
            grade = 'F';


        System.out.println("The grade is: " + grade);

    }

}

