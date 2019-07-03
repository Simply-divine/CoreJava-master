package chapter3.abstraction;


interface Student {
    public void MarksDisplay();
}

interface Teacher extends Student {
    void MarksAdd(int marks);
}


interface School extends Teacher {
    void setFees(int x);
    void setSalary(int x);
}

class SchoolStudent implements Student{
    public int marks;
    private int fees;

    @Override
    public void MarksDisplay() {
        System.out.println("your marks are " + marks);
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}


class Schoolteacher extends SchoolStudent implements Teacher{
    private SchoolStudent schoolStudent;
    private int salary;

    public void setStudent(SchoolStudent schoolStudent){
        this.schoolStudent = schoolStudent;
    }

    @Override
    public void MarksAdd(int marks) {
        this.schoolStudent.marks= marks;
    }

    @Override
    public void MarksDisplay() {
        System.out.println("your marks are " + this.schoolStudent.marks);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


 class Principal extends Schoolteacher implements School {
    Schoolteacher schoolteacher=new Schoolteacher();
    SchoolStudent schoolStudent=new SchoolStudent();
     public void setSchoolteacher(Schoolteacher schoolteacher) {
         this.schoolteacher = schoolteacher;
     }

     @Override
     public void setFees(int x) {
         this.schoolStudent.setFees(x);
     }

     @Override
     public void setSalary(int x) {
         this.schoolteacher.setSalary(x);
     }
 }

//abstract class Student implements School {
//    @Override
//    public void id(int d) {
//        System.out.println("my id is " + d);
//    }
//
//    @Override
//    public void fees() {
//        int fees = 10000;
//        System.out.println("fees: " + fees);
//    }
//
//    @Override
//    public void score() {
//        int score = 90;
//        System.out.println("score: " + score);
//    }
//}
//
public class Abstraction {
    public static void main(String[] args) {
        SchoolStudent schoolStudent = new SchoolStudent();
        Schoolteacher schoolteacher = new Schoolteacher();
        schoolteacher.setStudent(schoolStudent);
        schoolteacher.MarksAdd(100);
        schoolteacher.MarksDisplay();
        schoolStudent.MarksDisplay();
    }

}
