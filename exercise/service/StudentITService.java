package exercise.service;

import exercise.entities.StudentIT;

import java.util.Scanner;

public class StudentITService {
    public StudentIT inputStudentIT(Scanner sc) {
            System.out.println(" \t\tBạn Chọn StudentIT ");
            System.out.println("\n--- Nhập Thông Tin Sinh viên IT ---");
            System.out.print("Nhập họ tên: " );
            String name = sc.nextLine();
            System.out.print("Nhập chuyên ngành: ");
            String branch = sc.nextLine();
            System.out.print("Nhập điểm Java: ");
            double javaPoint = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập điểm HTML: ");
            double htmlPoint = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập điểm CSS: ");
            double cssPoint = Double.parseDouble(sc.nextLine());
            return new StudentIT(name, branch, javaPoint, htmlPoint, cssPoint);
    }
}
