import java.util.Scanner;

public class Appcontrol {
    StudentManagement studentManagement = new StudentManagement();
    public void control(){
        studentManagement.nhapsl();
        while (true) {
            System.out.println("Ban muon thuc hien chuc nang gi");
            System.out.println("1: Them Sinh Vien");
            System.out.println("2: Xoa Sinh Vien");
            System.out.println("3: In tat ca Sinh Vien");
            System.out.println("4: Tim kiem ID Sinh Vien");
            System.out.println("5: Dung chuong trinh");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    studentManagement.themsv();
                    break;
                case "2": 
                studentManagement.xoasv();
                break;
                case "3":
                studentManagement.intatcasv();
                break;
                case "4":
        
                studentManagement.timkiemtheoId();
                break;
                case "5":
                break;
                default:
                    break;
            }

        }
    }
}
