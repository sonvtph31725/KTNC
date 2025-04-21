import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SInhVienServiceTest {

    private SInhVienService sInhVienService;

    @BeforeEach
    public void setup(){
        sInhVienService = new SInhVienService();
        sInhVienService.themSinhVien(new SinhVien("PH6789","Vu Son",23,9f,5,"PTPM"));
        sInhVienService.themSinhVien(new SinhVien("PH68888","Vu Son",25,8f,5,"PTPM"));
    }

    @Test
    public void testSuaTC(){
        SinhVien sinhVien = new SinhVien("PH6666","Vu Son 2",24,9f,5,"PTPM");
        boolean kq = sInhVienService.suaSinhVien("PH6789",sinhVien);
        assertTrue(kq);
        assertEquals("PH6666",sInhVienService.getAllSV().get(0).getMaSV());
    }

}