package chapter7;

import java.io.Serializable;

public class User implements Serializable {
	static final long serialVersionUID = 2412775350814471908L;
	private int id;
	private String name;
	private int age;
	private int[] dd;
	
	public User (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public User (int id, String name, int age) {
		this(id, name);
		this.age = age;
	}
	
	public int getId () {
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getAge () {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
