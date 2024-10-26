import java.util.Scanner;

class Student{
    private String studentId;
    private String studentName;
    private double studentMark;
    public String getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public double getStudentMark() {
        return studentMark;
    }
    public Student(String studentId,String studentName,double studentMark ){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMark = studentMark;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
   
    }
       public void setStudentName(String studentName){
           this.studentName = studentName;
   
       }
       public void setStudentMark(double studentMark){
           this.studentMark = studentMark;
   
       }
    public void ranking(){
        if(studentMark >= 0 && studentMark < 5){
            System.out.println("Fail");
        }
        else if (studentMark >= 5 && studentMark <6.5){
            System.out.println("Medium");
        }
        else if (studentMark>= 6.5 && studentMark <7.5){
            System.out.println("Good");
        }
        else if (studentMark>= 7.5 && studentMark <9){
            System.out.println("Very Good");
        }
        else if(studentMark >= 9 && studentMark<=10){
            System.out.println("Excellent");
        }
        else{
            System.out.println("Error");
        }
    }
    
    
    // Hiển thị thông tin sinh viên
   
}