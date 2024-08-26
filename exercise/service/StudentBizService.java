package exercise.service;

import exercise.entities.StudentBiz;

import java.util.Scanner;

public class StudentBizService  {
    public StudentBiz inputStudentBiz(Scanner sc) {
            System.out.println(" \t\tBạn Chọn StudentBIZ ");
            System.out.println("\n--- Nhập Thông Tin Sinh viên Biz ---");
            System.out.print("Nhập họ tên: " );
            String name = sc.nextLine();
            System.out.print("Nhập chuyên ngành: ");
            String branch = sc.nextLine();
            System.out.print("Nhập điểm Marketing: ");
            double marketingPoint = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập điểm Sales: ");
            double salesPoint = Double.parseDouble(sc.nextLine());
            return new StudentBiz(name, branch, marketingPoint, salesPoint);
        }
}
