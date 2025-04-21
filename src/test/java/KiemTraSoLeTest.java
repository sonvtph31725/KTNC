import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraSoLeTest {

    @Test
    void TestKTSL(){
        assertTrue(KiemTraSoLe.ktsl(3));
    }

    @Test
    void TestKTSL1(){
        assertFalse(KiemTraSoLe.ktsl(4));
    }
}