import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {

        System.out.println("\nStudent Records");

        for (Student s : students) {
            System.out.println(
                "Roll No: " + s.getRollNo() +
                ", Name: " + s.getName() +
                ", Marks: " + s.getMarks() +
                ", Grade: " + s.getGrade()
            );
        }
    }

    public double calculateAverage() {

        double total = 0;

        for (Student s : students) {
            total += s.getMarks();
        }

        return total / students.size();
    }

    public double highestMarks() {

        double max = students.get(0).getMarks();

        for (Student s : students) {
            if (s.getMarks() > max) {
                max = s.getMarks();
            }
        }

        return max;
    }

    public double lowestMarks() {

        double min = students.get(0).getMarks();

        for (Student s : students) {
            if (s.getMarks() < min) {
                min = s.getMarks();
            }
        }

        return min;
    }
    public int totalStudents() {
        return students.size();
    }
}