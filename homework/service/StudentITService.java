package homework.service;

import homework.entities.StudentBiz;
import homework.entities.StudentIT;
import homework.entities.TechMastStudent;

import java.util.Scanner;

public class StudentITService {
    public StudentIT inputStudentIT(Scanner sc) {
        System.out.print("Nhập số lượng StudentIT: ");
        int student = Integer.parseInt(sc.nextLine());
        StudentIT[] arr = new StudentIT[student];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n--- Nhập Thông Tin Sinh viên IT thứ " + (i + 1) + " ---");
            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập chuyên ngành: ");
            String branch = sc.nextLine();
            System.out.print("Nhập điểm Java: ");
            double javaPoint = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập điểm HTML: ");
            double htmlPoint = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập điểm CSS: ");
            double cssPoint = Double.parseDouble(sc.nextLine());
            StudentIT studentIT = new StudentIT(name, branch, javaPoint, htmlPoint, cssPoint);
            arr[i] = studentIT;
        }
        System.out.println("\n");
        for (StudentIT studentIT : arr) {
            studentIT.disPlay();
        }
        return null; // return arr
    }
}
