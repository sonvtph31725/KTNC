import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

   StudentService studentService;
   @BeforeEach
    private void setUp(){
       studentService = new StudentService();
       studentService.addSV(new Student("S1","son",9));
       studentService.addSV(new Student("S2","hehe",10));
   }

   @Test
    void TestSuaTC(){
       boolean kq = studentService.updateStudent("S1", new Student("S3","SonOK",9));
       assertFalse(kq);
   }

   @Test
    void TestTrong(){
       boolean kq = studentService.updateStudent("S1",new Student("","hihi",8));
       assertFalse(kq);
   }

   @Test
   void TestTrung(){
      boolean qk = studentService.updateStudent("S1",new Student("S1","son",9));
      assertFalse(qk);
   }
}