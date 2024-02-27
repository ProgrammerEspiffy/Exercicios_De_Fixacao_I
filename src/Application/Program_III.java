package Application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program_III {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println(student.name);
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f%n", student.finalGrade());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();


    }
}
