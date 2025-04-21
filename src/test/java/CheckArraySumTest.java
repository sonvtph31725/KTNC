import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckArraySumTest {

    @Test
    void testTong(){
        int[] arr = {1,2,3,4};
        assertEquals(10,CheckArraySum.checkArray(arr));
    }
}