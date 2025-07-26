import java.util.ArrayList;
import java.util.Scanner;

// 1. Create Student class to store name and grade
class Student {
    String name;
    int grade;

    // Constructor
    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

// 2. Main class
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Student Grade Tracker");
        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // clear newline

        // 3. Input student data
        for (int i = 0; i < count; i++) {
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter grade for " + name + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // clear newline

            students.add(new Student(name, grade));
        }

        // 4. Calculate total, average, highest, lowest
        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (Student s : students) {
            total += s.grade;
            if (s.grade > highest) highest = s.grade;
            if (s.grade < lowest) lowest = s.grade;
        }

        double average = (double) total / students.size();

        // 5. Display summary report
        System.out.println("\n---Student Summary Report ---");
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Grade: " + s.grade);
        }

        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        scanner.close();
    }
}
