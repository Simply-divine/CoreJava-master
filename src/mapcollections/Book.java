package mapcollections;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package model;

/**
 *
 * @author Hardik
 */
class BookNotFoundException extends Exception{
	BookNotFoundException(String s){
		super(s);
	}
}
public class Book {
	private Integer id;
	private String title;
	private String author;
	private Float price;
	private EnumTest bookMessages = new EnumTest();
	public Book() {
		bookMessages.addMessage("error","book not found");
	}

	public Book(int id) {
		this();
		this.id = id;
	}

	public Book(int id, String title, String author, float price) {
		this(title, author, price);
		this.id = id;
	}
	
	public Book(String title, String author, float price) {
		this();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getId() throws BookNotFoundException {
		if(id == null){
			throw new BookNotFoundException(bookMessages.getMessage("error"));
		}
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

    @Override
    public String toString() {
        return "mapcollections.Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + '}';
    }

	public static void main(String[] args) {
		Book book = new Book();
		try {
			System.out.println(book.getId());
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
	}
}
