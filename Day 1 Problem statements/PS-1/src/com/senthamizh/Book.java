package com.senthamizh;


public class Book {
	    private String bookTitle;
	    private double bookPrice;

	   
	    public String getbookTitle() {
	        return bookTitle;
	    }

	    public void setBookTitle(String bookTitle) {
	        this.bookTitle = bookTitle;
	    }

	  
	    public double getbookPrice() {
	        return bookPrice;
	    }

	    public void setBookPrice(double bookPrice) {
	        this.bookPrice = bookPrice;
	    }
	}

     class Main {

	    public static Book createBook(String title, double price) {
	        Book book = new Book();
	        book.setBookTitle(title);
	        book.setBookPrice(price);
	        return book;
	    }

	   
	    public static void showBook(Book book) {
	        System.out.println("Book Title: " + book.getbookTitle() + " and Price: " + book.getbookPrice());
	    }

	    public static void main(String[] args) {
	      
	        String title = "Java Programming";
	        double price = 350.00d;

	      
	        Book book = createBook(title, price);
	        showBook(book);
	    }
	}