// Main.java
package main;

import entity.Author;
import entity.Book;
import utils.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        // Get the EntityManagerFactory
        EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
        
        // Get EntityManager (similar to a database connection)
        EntityManager em = JPAUtil.getEntityManager();
        
        try {
            // Begin transaction
            em.getTransaction().begin();
            
            // Create Author object
            Author author = new Author("John Doe", "john.doe@example.com");
            
            // Create Book objects
            Book book1 = new Book("Java Programming", "ISBN-12345", 29.99);
            Book book2 = new Book("Hibernate in Action", "ISBN-67890", 34.99);
            
            // Establish the relationship
            author.addBook(book1);
            author.addBook(book2);
            
            // Persist the author (cascade will persist books too)
            em.persist(author);
            
            // Commit the transaction
            em.getTransaction().commit();
            
            System.out.println("Author and books have been persisted successfully.");
            
            // Begin a new transaction for fetching data
            em.getTransaction().begin();
            
            // Fetch author by ID
            Author fetchedAuthor = em.find(Author.class, 1L);
            
            if (fetchedAuthor != null) {
                System.out.println("Author: " + fetchedAuthor.getName());
                System.out.println("Books:");
                
                for (Book book : fetchedAuthor.getBooks()) {
                    System.out.println(" - " + book.getTitle() + " ($" + book.getPrice() + ")");
                }
            }
            
            // Commit the transaction
            em.getTransaction().commit();
            
        } catch (Exception e) {
            // If anything goes wrong, rollback
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // Close resources
            em.close();
            JPAUtil.shutdown();
        }
    }
}