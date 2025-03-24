package entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="authors")
public class Author {
	
	@Id
	@GeneratedValue
	
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@OneToMany(mappedBy = "author")
	private List<Book> books = new ArrayList<>();

	
	
	public Author() {}
	
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void addBook(Book book) {
		books.add(book);
		book.setAuthor(this);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
		book.setAuthor(null);
	}
	
	public Long getId() {
		return id;
		
	}
	
	public void setId(Long id) {
		this.id = id;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName() {
		this.name = name;
		
	}
	
	public String getEmail() {
		return email;
		
	}
	
	public void setEmail() {
		this.email = email;
	}

	public List<Book> getBooks(){
		return books;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
