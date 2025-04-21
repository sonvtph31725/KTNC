import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {

    private SinhVienService sinhVienService;

    @BeforeEach
    public void setUp(){
        sinhVienService = new SinhVienService();
        sinhVienService.addSV(new SinhVien("ph1234","VTS",25,8,"PTPM"));
        sinhVienService.addSV(new SinhVien("ph1233","VTS1",26,9,"PTPM1"));
    }

    @Test
    public void TestSuaTC(){
        boolean kq = sinhVienService.updateSV("ph1234",new SinhVien("ph12345","VTS5",25,8,"PTPM5"));
        assertTrue(kq);
    }

    @Test
    public void TestSuaFail(){
        boolean kq = sinhVienService.updateSV("ph12346",new SinhVien("ph12345","VTS5",25,8,"PTPM5"));
        assertFalse(kq);
    }

    @Test
    public void TestValidateRong(){
        sinhVienService.addSV(new SinhVien("","",18,5,""));
        assertEquals(3,sinhVienService.getAllSV().size());
    }


}