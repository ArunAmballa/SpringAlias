package com.arun.beans;

public class Student 
{
	
	private Books book;
	private String name;
	private int age;
	
	public Student()
	{
		System.out.println("Student Object is Created");
	}
	
	@Override
	public String toString() {
		return "Student [book=" + book + ", name=" + name + ", age=" + age + "]";
	}

	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void task()
	{
		book.readingBook();
	}
	
	

}
