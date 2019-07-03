import java.util.Arrays;

class Student{
     int i=0;

    Person p[]= new Person[1];

    Student() {

    }

    public Student(int i, String name) {
        p[i].setId(i);
        p[i].setName(name);
    }

    void setPerson(int id,String name){
        p[i-1]=new Person();
        p[i-1].setId(id);
        p[i-1].setName(name);
        System.out.println(p[i - 1].getId());
        System.out.println(p[i - 1].getName());
        p= Arrays.copyOf(p,++i);

    }
class Person{
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
}

public class InnerExample {
    public static void main(String[] args) {
        Student s=new Student();
        s.setPerson(10,"hardik");
        s.setPerson(2,"sumit");

    }
}
