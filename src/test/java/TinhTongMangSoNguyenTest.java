
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongMangSoNguyenTest {

    @Test
    void tongMangBT(){
        int[] arr = {1,2,3};
        assertEquals(6, TinhTongMangSoNguyen.tinhTong(arr));
    }
}