package quanlykiemke;

import java.util.ArrayList;
import java.util.Scanner;

public class Xuly {
    private ArrayList<PhteuKiemKe> danhSachPhteu;
    
    public Xuly() {
        danhSachPhteu = new ArrayList<>();
    }
    
    public void them(PhteuKiemKe phieu) {
        danhSachPhteu.add(phieu);
    }
    
    public PhteuKiemKe timPhteuTheoMa(String ma) {
        for (int i = 0; i < danhSachPhteu.size(); i++) {
            if (danhSachPhteu.get(i).getMaPhteu().equals(ma)) {
                return danhSachPhteu.get(i);
            }
        }
        return null;
    }
    
    public void xuatBaoCaoTheoMa(String ma) {
        PhteuKiemKe phieu = timPhteuTheoMa(ma);
        if (phieu != null) {
            phieu.xuatBaoCao();
        }
    }
    
    public void hienThiMenu() {
        Scanner scanner = new Scanner(System.in);
        int chon;
        
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm phiếu");
            System.out.println("2. Xem phiếu theo mã");
            System.out.println("3. Hiển thị tất cả");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = scanner.nextInt();
            scanner.nextLine();
            
            if (chon == 1) {
                System.out.print("Nhập mã phiếu: ");
                String ma = scanner.nextLine();
                System.out.print("Nhập ngày (dd/mm/yyyy): ");
                String ngay = scanner.nextLine();
                
                System.out.print("Nhập tên nhân viên: ");
                String tenNV = scanner.nextLine();
                System.out.print("Nhập chức vụ: ");
                String cv = scanner.nextLine();
                NhanVien nv = new NhanVien(tenNV, cv);
                
                System.out.print("Nhập tên phòng: ");
                String tenPhong = scanner.nextLine();
                System.out.print("Nhập mã phòng: ");
                String maPhong = scanner.nextLine();
                System.out.print("Nhập trưởng phòng: ");
                String truongPhong = scanner.nextLine();
                Phong phong = new Phong(tenPhong, maPhong, truongPhong);
                
                PhteuKiemKe phieu = new PhteuKiemKe(ma, ngay, nv, phong);
                
                System.out.print("Số lượng tài sản: ");
                int n = scanner.nextInt();
                scanner.nextLine();
                
                for (int i = 0; i < n; i++) {
                    System.out.println("Tài sản " + (i+1) + ":");
                    System.out.print("Tên: ");
                    String tenTS = scanner.nextLine();
                    System.out.print("Số lượng: ");
                    int sl = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tình trạng: ");
                    String tt = scanner.nextLine();
                    
                    TaISan ts = new TaISan(tenTS, sl, tt);
                    phieu.themTaiSan(ts);
                }
                
                them(phieu);
                System.out.println("Đã thêm phiếu " + ma);
                
            } else if (chon == 2) {
                System.out.print("Nhập mã phiếu: ");
                String ma = scanner.nextLine();
                xuatBaoCaoTheoMa(ma);
                
            } else if (chon == 3) {
                System.out.println("\n=== TẤT CẢ PHIẾU KIỂM KÊ ===");
                for (int i = 0; i < danhSachPhteu.size(); i++) {
                    System.out.println("\nPHIẾU " + (i+1) + ":");
                    danhSachPhteu.get(i).xuatBaoCao();
                }
            }
            
        } while (chon != 0);
        
        scanner.close();
    }
}