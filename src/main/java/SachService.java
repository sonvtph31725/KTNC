import java.util.ArrayList;
import java.util.List;

public class SachService {

    private List<Sach> list = new ArrayList<>();

    public List<Sach> getAllSach(){
        return list;
    }

    public void addSach(Sach s){
        list.add(s);
    }

    public boolean suaSach(String maCu, Sach moi){
        for(Sach s: list){
            if (!s.getMaSach().equals(maCu) && s.getMaSach().equals(moi.getMaSach())){
                System.out.println("Trùng mã Sách.");
                return false;
            }
        }
        for (int i = 0; i < list.size(); i ++){
            if (list.get(i).getMaSach().equals(maCu)){
                list.set(i,moi);
                return true;
            }
        }
        return false;
    }
}
