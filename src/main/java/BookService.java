import java.util.ArrayList;
import java.util.List;

public class BookService {
   private List<Book> list = new ArrayList<>();
   public List<Book> getAll(){
       return list;
   }
   public void addBook(Book b){
       list.add(b);
   }

   public boolean udBook(String cu, Book moi){
       for (Book b : list){
           if (!b.getId().equals(cu)&&b.getId().equals(moi.getId())){
               System.out.println("Id trùng!!!");
               return false;
           }
       }
       for (int i = 0; i < list.size(); i++){
           if (list.get(i).getId().equals(cu)){
               list.set(i,moi);
               return true;
           }
       }
       return false;
   }
}
