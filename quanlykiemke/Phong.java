package quanlykiemke;

public class Phong {
    private String tenPhong;
    private String maPhong;
    private String truongPhong;
    
    public Phong(String tenPhong, String maPhong, String truongPhong) {
        this.tenPhong = tenPhong;
        this.maPhong = maPhong;
        this.truongPhong = truongPhong;
    }
    
    public String getTen() {
        return tenPhong;
    }
    
    public void setTen(String tenPhong) {
        this.tenPhong = tenPhong;
    }
    
    public String getChucViu() {
        return truongPhong;
    }
    
    public void setChucViu(String truongPhong) {
        this.truongPhong = truongPhong;
    }
    
    // Thêm getter/setter khác
    public String getMaPhong() {
        return maPhong;
    }
    
    public String getTruongPhong() {
        return truongPhong;
    }
}