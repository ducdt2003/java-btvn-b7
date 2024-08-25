package homework;

import homework.entities.StudentBiz;
import homework.entities.StudentIT;
import homework.entities.TechMastStudent;
import homework.service.StudentBizService;
import homework.service.StudentITService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentITService service = new StudentITService();
        StudentIT studentIT = service.inputStudentIT(sc);
        System.out.println("\n-----------");
        StudentBizService service1 = new StudentBizService();
        StudentBiz studentBiz = service1.inputStudentBiz(sc);
    }

}
