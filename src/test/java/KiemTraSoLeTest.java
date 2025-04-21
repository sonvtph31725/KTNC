import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraSoLeTest {

    @Test
    void Test(){
        assertTrue(KiemTraSoLe.sole(3));
    }
    @Test
    void Test1(){
        assertTrue(KiemTraSoLe.sole(5));
    }
    @Test
    void Test2(){
        assertFalse(KiemTraSoLe.sole(4));
    }
    @Test
    void Test3(){
        assertFalse(KiemTraSoLe.sole(6));
    }
    @Test
    void Test4(){
        assertTrue(KiemTraSoLe.sole(-3));
    }
}