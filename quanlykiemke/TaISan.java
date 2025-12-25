package quanlykiemke;

public class TaISan {
    private String ten;
    private int soLuong;
    private String tinhTrang;
    
    public TaISan(String ten, int soLuong, String tinhTrang) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public int getSoLuong() {
        return soLuong;
    }
    
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public String getTinhTrang() {
        return tinhTrang;
    }
    
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}