package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee
public class program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Student student = new Student();
    student.name = sc.nextLine();
    student.grade1 = sc.nextDouble();
    student.grade2 = sc.nextDouble();
    student.grade3 = sc.nextDouble();




}