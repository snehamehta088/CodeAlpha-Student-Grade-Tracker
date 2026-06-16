import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();

            tracker.addStudent(
                new Student(roll, name, marks)
            );
        }

        tracker.displayStudents();

        System.out.println("\nAverage Marks: "
                + tracker.calculateAverage());

        System.out.println("Highest Marks: "
                + tracker.highestMarks());

        System.out.println("Lowest Marks: "
                + tracker.lowestMarks());
        System.out.println("total Students:"
                + tracker.totalStudents());


        sc.close();
    }
}