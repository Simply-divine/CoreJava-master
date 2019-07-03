import java.util.LinkedList;

class Book{
private int id;
private String name;
private String author,publisher;

    @Override
    public String toString() {
        return "mapcollections.Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public Book(int id, String name, String author, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
}
public class ObjectArrayList {
    public static void main(String[] args) {
        LinkedList<mapcollections.Book> a=new LinkedList<>();
        a.add(new mapcollections.Book(1,"letusc","yashwant",12));
        a.add(new mapcollections.Book(2,"sada","asdas",12));
        a.forEach(str-> System.out.println(str));
    }
}
