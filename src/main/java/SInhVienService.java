import java.util.ArrayList;
import java.util.List;

public class SInhVienService {
    private List<SinhVien> sinhViens = new ArrayList<>();

    public List<SinhVien> getAllSV(){
        return sinhViens;
    }

    public void themSinhVien(SinhVien sinhVien){
        if (isEmpty(sinhVien.getMaSV()) || isEmpty(sinhVien.getTen()) || isEmpty(sinhVien.getChuyenNganh())){
            return;
        }
        sinhViens.add(sinhVien);
    }

    public boolean suaSinhVien(String maSVCu,SinhVien sinhVienMoi){
        if (isEmpty(sinhVienMoi.getMaSV()) || isEmpty(sinhVienMoi.getTen()) || isEmpty(sinhVienMoi.getChuyenNganh())) return false;

        for (SinhVien sv : sinhViens){
            if (!sv.getMaSV().equals(maSVCu)&&sv.getMaSV().equals(sinhVienMoi.getMaSV())){
                return false;
            }
        }
        for (int i = 0; i <sinhViens.size();i++){
            if (sinhViens.get(i).getMaSV().equals(maSVCu)){
                sinhViens.set(i,sinhVienMoi);
                return true;
            }
        }
        return false;
    }
    private boolean isEmpty(String s){
        return s == null||s.trim().isEmpty();
    }
}
