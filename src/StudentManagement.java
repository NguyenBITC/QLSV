import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student> studentList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    private int count = 0;
    private int max;
    public void nhapsl(){
        System.out.println("Nhap so luong sinh vien");
        max = input.nextInt();
        input.nextLine();
        
    }
    public void themsv(){
        if(count == max){
            System.out.println("Sinh vien day");
            return;
        }
        else{
             System.out.println("Nhap Id sinh vien");
            String id = input.nextLine();
            System.out.println("Nhap ten sinh vien");
            String name = input.nextLine();
             System.out.println("Nhap diem sinh vien");
            double mark = input.nextDouble();
            input.nextLine();
            Student student1 = new Student(id, name, mark);
            studentList.add(student1);
            count++;
        }
       
    }
    public void xoasv(){
        System.out.println("Nhap Id sinh vien muon xoa: ");
        String idremove = input.nextLine();
        for (Student student : studentList) {
            if (idremove == student.getStudentId()) {
                studentList.remove(student);
            }
        }
    }
    public void intatcasv(){
        for (Student student : studentList) {
            System.out.println("Id" + student.getStudentId());
            System.out.println("Name" + student.getStudentName());
            System.out.println("Mark" + student.getStudentMark());

        }
    }
    public void timkiemtheoId(String id){
        for (Student student : studentList) {
            if(student.getStudentId() === id){
                return student;
            }
        }

    }

    public void updatesv(){

    }
    //Bubble Sort
}
