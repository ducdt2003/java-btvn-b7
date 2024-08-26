package exercise;

import exercise.entities.StudentBiz;
import exercise.entities.StudentIT;
import exercise.entities.TechMastStudent;
import exercise.service.StudentBizService;
import exercise.service.StudentITService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" Danh Sách Sinh Viên ");
            System.out.println("1. StudentIT");
            System.out.println("2. StudentBiz");
            System.out.println(" hãy chọn Sinh Viên Bạn Muốn Nhập ");
            int inputStudent = Integer.parseInt(sc.nextLine());
            if (inputStudent == 1 || inputStudent == 2 ) {
                System.out.println("Nhập số phần tử của mảng ");
                int arrayElement = Integer.parseInt(sc.nextLine());
                TechMastStudent[] arr = new TechMastStudent[arrayElement];
                for (int i = 0; i < arr.length; i++) {
                    switch (inputStudent) {
                        case 1:
                            StudentITService service1 = new StudentITService();
                            StudentIT studentIT = service1.inputStudentIT(sc);
                            arr[i] = studentIT;
                            break;
                        case 2:
                            StudentBizService service2 = new StudentBizService();
                            StudentBiz studentBiz = service2.inputStudentBiz(sc);
                            arr[i] = studentBiz;
                            break;
                    }
                }
                for (TechMastStudent techMastStudent : arr) {
                    System.out.println(techMastStudent);
                }
            }else {
                System.out.println(" Bạn chọn chức Năng không có, Thoát Chương Trình!");
                System.exit(0);
            }
        }while (true);
    }
}
