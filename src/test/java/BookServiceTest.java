import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

   BookService bookService;

   @BeforeEach
    private void setUp(){
       bookService = new BookService();
       bookService.addBook(new Book("S1","abccba", 9));
       bookService.addBook(new Book("S2","abcxyz", 10));
   }

   @Test
    void Testaddtc(){
       boolean kq = bookService.udBook("S1",new Book("S4","ccdcm",17));
       assertTrue(kq);
   }
}