package com.sample.spring.helloweb.samplerestapi;

public class Book {
	long i;
	String name;
	String author;

	public Book(long i, String name, String author) {
		super();
		this.i = i;
		this.name = name;
		this.author = author;
	}

	public long getI() {
		return i;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return String.format("book [i=%s, name=%s, author=%s]", i, name, author);
	}

//	@Override
//	public String toString() {
//		return "book [i=" + i + ", name=" + name + ", author=" + author + "]";
//	}

}
