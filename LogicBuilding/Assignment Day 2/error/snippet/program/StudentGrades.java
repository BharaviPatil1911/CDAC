//Write a program that determines whether a student passes or fails based on their grades in three 
//subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
//more subjects, print the number of subjects they failed in. 


public class StudentGrades {
    public static void main(String[] args) {
        int grade1 = 55; // Replace with actual grade
        int grade2 = 65; // Replace with actual grade
        int grade3 = 35; // Replace with actual grade

        int failedSubjects = 0;

        if (grade1 < 40) {
            failedSubjects++;
        }
        if (grade2 < 40) {
            failedSubjects++;
        }
        if (grade3 < 40) {
            failedSubjects++;
        }

        if (failedSubjects == 0) {
            System.out.println("Student passes!");
        } else {
            System.out.println("Student fails in " + failedSubjects + " subjects.");
        }
    }
}

Output = Student fails in 1 subjects.