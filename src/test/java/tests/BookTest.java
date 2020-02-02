package tests;

import GeneralHierarchy.Author;
import GeneralHierarchy.AuthorList;
import GeneralHierarchy.Book;
import GeneralHierarchy.PublishSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class BookTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void BookTest() {
        String bookName = "I Robot";
        String writer = "Isaac Asimov";
        Date writerBirthdate = new Date(1920);
        int ISBN = 123456789;

        String publisher= "Penguin";
        Date publishYear = new Date(1990);
        String publishPlace="London";


        PublishSpec spec = new PublishSpec(publisher,publishYear,publishPlace);

        AuthorList authors = new AuthorList();
        Author author = new Author(writer,writerBirthdate);
        authors.addAuthor(author);

        Book book = new Book(bookName,ISBN,spec,authors);

        Assert.assertEquals(bookName,book.getName());
        Assert.assertEquals(writer,book.getAuthorList().getAuthors().get(0).getName());
        Assert.assertEquals(publishYear,book.getSpecs().getPublishYear());


    }
}
