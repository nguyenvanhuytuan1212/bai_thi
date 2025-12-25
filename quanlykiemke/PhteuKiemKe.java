package quanlykiemke;

import java.util.ArrayList;

public class PhteuKiemKe {
    private String maPhteu;
    private String ngayKiemKe;
    private NhanVien nhanVien;
    private Phong phong;
    private ArrayList<TaISan> danhSachTaISan;
    
    public PhteuKiemKe(String maPhteu, String ngayKiemKe, NhanVien nhanVien, Phong phong) {
        this.maPhteu = maPhteu;
        this.ngayKiemKe = ngayKiemKe;
        this.nhanVien = nhanVien;
        this.phong = phong;
        this.danhSachTaISan = new ArrayList<>();
    }
    
    public void themTaiSan(TaISan taiSan) {
        danhSachTaISan.add(taiSan);
    }
    
    public int tinhTongSoLuong() {
        int tong = 0;
        for (int i = 0; i < danhSachTaISan.size(); i++) {
            tong = tong + danhSachTaISan.get(i).getSoLuong();
        }
        return tong;
    }
    
    public void xuatBaoCao() {
        System.out.println("Mã phiếu: " + maPhteu);
        System.out.println("Ngày kiểm kê: " + ngayKiemKe);
        System.out.println("Nhân viên: " + nhanVien.getTen());
        System.out.println("Chức vụ: " + nhanVien.getChucVu());
        System.out.println("Phòng: " + phong.getTen());
        System.out.println("Mã phòng: " + phong.getMaPhong());
        System.out.println("Trưởng phòng: " + phong.getTruongPhong());
        
        System.out.println("\n| Tên tài sản         | Số lượng | Tình trạng           |");
        System.out.println("|---------------------|----------|----------------------|");
        
        for (int i = 0; i < danhSachTaISan.size(); i++) {
            TaISan ts = danhSachTaISan.get(i);
            System.out.printf("| %-19s | %-8d | %-20s |\n", 
                ts.getTen(), ts.getSoLuong(), ts.getTinhTrang());
        }
        
        System.out.println("|---------------------|----------|----------------------|");
        System.out.println("Số tài sản: " + danhSachTaISan.size());
        System.out.println("Tổng số lượng: " + tinhTongSoLuong());
    }
    
    public String getMaPhteu() {
        return maPhteu;
    }
}