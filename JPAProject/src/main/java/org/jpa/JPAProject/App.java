package org.jpa.JPAProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        System.out.println(em);
        System.out.println(em.find(Book.class, 1005));
//        em.getTransaction().begin();
        System.out.println(em.find(Book.class, 1001));
//        Book book = new Book();
//        book.setBookId(1005);
//        book.setBookName("Test1");
//        book.setAuthorName("Test1");
//        em.persist(book);
//        em.getTransaction().commit();
//        System.out.println(book);
    }
}
