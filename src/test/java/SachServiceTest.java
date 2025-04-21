import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {

    SachService sachService;

    @BeforeEach
    public void setUp(){
        sachService = new SachService();
        sachService.addSach(new Sach("S01", "Sach 1", "Tg1", 2020, 50f));
        sachService.addSach(new Sach("S02", "Sach 2", "Tg2", 2021, 60f));
    }

    @Test
    void testSuaTC(){
        boolean kq = sachService.suaSach("S01",new Sach("S03", "Sach 1", "Tg1", 2020, 50f));
        assertTrue(kq);
    }

}