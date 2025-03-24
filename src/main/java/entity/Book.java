package entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="price")
	private Double price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id")
	private Author author;
	
	public Book(String title, String isbn, Double price) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
		
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }
	public void setAuthor(Author author) {
		// TODO Auto-generated method stub
		this.author = author;
		
	}

}
