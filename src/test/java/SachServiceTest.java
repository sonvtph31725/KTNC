import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {

    private SachService sachService;

    @BeforeEach
    public void setup(){
        sachService = new SachService();
        sachService.themSach(new Sach("S1","ABCXYZ","Nam",2020,90));
        sachService.themSach(new Sach("S2","cailoz","Nam",2021,80));
    }

    @Test
    public void testSuaThanhCong(){
        Sach sach = new Sach("S4","VCLDCMM","BO SON MAY DAY",2000,100);
        boolean ketQua = sachService.suaSach("S1",sach);
        assertTrue(ketQua);
        assertEquals("S4",sachService.getAll().get(0).getMaSach());
    }

    @Test
    public void testSuaKoTimThay(){
        Sach sach = new Sach("S9","VCLDCMMlannua","BO SON MAY DAY ok",2000,9900);
        boolean ketQua = sachService.suaSach("S3",sach);
        assertFalse(ketQua);
    }

    @Test
    public void testSuaFailViTrungMa(){
        Sach sach = new Sach("S2","VCLDCMMlannua","BO SON MAY DAY ok",2000,9900);
        boolean ketQua = sachService.suaSach("S1",sach);
        assertFalse(ketQua);
    }

    @Test
    public void testSuaFailViGia0D(){
        Sach sach = new Sach("S2","VCLDCMMlannua","BO SON MAY DAY ok",2000,90f);
        boolean ketQua = sachService.suaSach("S1",sach);
        assertFalse(ketQua);
        assertEquals(90f,sachService.getAll().get(0).getGia());
    }

    @Test
    public void testSuaNXBbienDuoi(){
        Sach sach = new Sach("S13","Biên","Nam Cao",1900,20);
        boolean ketQua = sachService.suaSach("S23",sach);
        assertFalse(ketQua);
        assertEquals(2021,sachService.getAll().get(1).getNamXuatBan());
    }
}