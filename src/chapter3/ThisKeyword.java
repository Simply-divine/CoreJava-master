package chapter3;

public class ThisKeyword {
	private int id;
	private String bookName;
	private String author;
	private float price;
	
	private ThisKeyword (int id) {
        this.id = id;
    }
	
	private ThisKeyword (int id, String bookName, String author) {
        this(id);
        this.bookName = bookName;
        this.author = author;
    }
	
	private ThisKeyword (int id, String bookName, String author, float price) {
        this(id, bookName, author);
        this.price = price;
    }
    
    public static void main (String[] args) {
        ThisKeyword t1 = new ThisKeyword(1);
        ThisKeyword t2 = new ThisKeyword(1, "Java", "oracle");
        ThisKeyword t3 = new ThisKeyword(2, "Core Java", "oracle", 100);
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("\t\t this as a constructor");
        t1.display();
        t2.display();
        t3.display();
        System.out.println("----------------------------------------------------------------");
        
    }
	
	private void display () {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("\tId\tmapcollections.Book Name\tAuthor\tPrice\t");
        System.out.println("\t" + this.id + "\t" + this.bookName + "\t  " + this.author + "\t   " + this.price + "\t");
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
        
    }
}
