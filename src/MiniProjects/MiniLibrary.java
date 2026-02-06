package com.MiniProjects;

class Library{
	 String[] book;
	 int no_of_books;
	Library(){
		this.book = new String[100];
		this.no_of_books = 0;
	}
	void addBook(String book) {
		this.book[no_of_books] = book;
		no_of_books++;
		
		System.out.println(book + " book has been added ");
	}
	
	void showAvailableBooks() {
		System.out.println("Available books are : ");
		for(String book:this.book) {
			if(book == null) {
				continue;
			}
			System.out.println(" * "+book);
		}
	}
	
	void issueBook(String book) {
		for(int i = 0 ; i < this.book.length;i++) {
			if(this.book[i].equals(book)) {
				System.out.println("The book has been issued !");
				this.book[i] = null;
				return;
			}
		}
		System.out.println("This book not available in library " );
	}
	
	void returnBook(String book) {
		addBook(book);
	}
}

public class MiniLibrary {
	public static void main(String[] args) {
		Library l = new Library();
		l.addBook("Think like monk");
		l.addBook("Monalisa");
		l.addBook("Algoritham");
		l.addBook("DSA");
		
		l.showAvailableBooks();
		
		l.issueBook("DSA");
		l.showAvailableBooks();
		
		l.returnBook("DSA");
		l.showAvailableBooks();
	}
}
