import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> sinhViens = new ArrayList<>();
    public List<SinhVien> getAllSV() {
        return sinhViens;
    }

    public void addSV(SinhVien sv){
        if (sv.getMaSV().isEmpty()||sv.getTen().isEmpty()||sv.getChuyenNganh().isEmpty()){
            System.out.println("Yêu cầu nhập đầy đủ thông tin!!!");
        }
        sinhViens.add(sv);
    }

    public boolean updateSV(String maSVcu, SinhVien moi) {
        for (SinhVien sv : sinhViens) {
            if (!sv.getMaSV().equals(maSVcu) && sv.getMaSV().equals(moi.getMaSV())) {

                System.out.println("Yêu cầu nhập đầy đủ thông tin!!!");
                return false;
            }
        }
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getMaSV().equals(maSVcu)) {
                sinhViens.set(i, moi);
                return true;
            }
        }
        return false;
    }
}
