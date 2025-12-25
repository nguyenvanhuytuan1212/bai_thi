package quanlykiemke;

public class NhanVien {
    private String ten;
    private String chucVu;
    
    public NhanVien(String ten, String chucVu) {
        this.ten = ten;
        this.chucVu = chucVu;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String getChucVu() {
        return chucVu;
    }
    
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}