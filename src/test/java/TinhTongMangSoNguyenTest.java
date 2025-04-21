import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongMangSoNguyenTest {

    @Test
    public void ttmsn(){
        int[] arr = {};
        assertEquals(0,TinhTongMangSoNguyen.ttmsn(arr));
    }

    @Test
    public void ttmsn1(){
        int[] arr = {1,2,3};
        assertEquals(6,TinhTongMangSoNguyen.ttmsn(arr));
    }
}