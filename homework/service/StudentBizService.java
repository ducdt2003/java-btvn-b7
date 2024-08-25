package homework.service;

import homework.entities.StudentBiz;
import homework.entities.StudentIT;
import homework.entities.TechMastStudent;

import java.util.Scanner;

public class StudentBizService  {
    public StudentBiz inputStudentBiz(Scanner sc) {
        System.out.print("Nhập số lượng StudentBiz: ");
        int studentCount = Integer.parseInt(sc.nextLine());
        StudentBiz[] arr = new StudentBiz[studentCount];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n--- Nhập Thông Tin Sinh viên Biz thứ " + (i + 1) + " ---");
            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập chuyên ngành: ");
            String branch = sc.nextLine();
            System.out.print("Nhập điểm Marketing: ");
            double marketingPoint = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập điểm Sales: ");
            double salesPoint = Double.parseDouble(sc.nextLine());
            StudentBiz studentBiz = new StudentBiz(name, branch, marketingPoint, salesPoint);
            arr[i] = studentBiz;
        }
        System.out.println("\n");
        for (StudentBiz studentBiz : arr) {
            studentBiz.disPlay();
        }
        return null; // return arr
    }
}
