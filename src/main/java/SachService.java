import java.util.ArrayList;
import java.util.List;

public class SachService {
    private List<Sach> danhSach = new ArrayList<>();

    public List<Sach> getAll(){
        return danhSach;
    }

    public void themSach(Sach sach){
        danhSach.add(sach);
    }

    public boolean suaSach(String maSachCu, Sach sachMoi){
        for (Sach s : danhSach){
            if (!s.getMaSach().equals(maSachCu)&&s.getMaSach().equals(sachMoi.getMaSach())){
                return false;
            }
        }

        for (int i = 0; i <danhSach.size(); i++){
            if (danhSach.get(i).getMaSach().equals(maSachCu)){
                danhSach.set(i,sachMoi);
                return true;
            }
        }
        return false;
    }
}
