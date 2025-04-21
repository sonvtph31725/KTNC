public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int NXB;
    private float gia;

    public Sach(String maSach, String tenSach, String tacGia, int NXB, float gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.NXB = NXB;
        this.gia = gia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNXB() {
        return NXB;
    }

    public void setNXB(int NXB) {
        this.NXB = NXB;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
}
