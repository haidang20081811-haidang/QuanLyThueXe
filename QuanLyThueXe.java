package QuanLyThueXe;

import java.util.Scanner;

public class QuanLyThueXe {
    private Xe[] QuanLy;
    private Scanner sc = new Scanner(System.in);

    public QuanLyThueXe() {
    }

    public void Nhap() {
        System.out.print("Nhap so luong xe thue: ");
        int n = Integer.parseInt(sc.nextLine());

        QuanLy = new Xe[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Nhap xe thu " + (i + 1) + " ===");
            System.out.println("1. Xe cho hang");
            System.out.println("2. Xe du lich");
            System.out.print("Chon loai xe: ");
            int loai = Integer.parseInt(sc.nextLine());

            if (loai == 1) {
                QuanLy[i] = new XeChoHang();
            } else {
                QuanLy[i] = new XeDuLich(); 
            }

            QuanLy[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("\n=== Danh sach xe da thue ===");
        if (QuanLy == null || QuanLy.length == 0) {
            System.out.println("Danh sach trong.");
            return;
        }

        for (Xe x : QuanLy) {
            x.Xuat();
            System.out.println("------------------------");
        }
    }

    public String TimKiem(String bienSoXe) {
        if (QuanLy == null) return "Danh sach rong";

        for (Xe x : QuanLy) {
            if (x.getBienSoXe().equalsIgnoreCase(bienSoXe)) {
                return "DA TIM THAY: " + x.getTenXe();
            }
        }
        return "Khong tim thay xe co bien so: " + bienSoXe;
    }

    public void xoa(String bienSoXe) {
        if (QuanLy == null) return;

        int index = -1;

        for (int i = 0; i < QuanLy.length; i++) {
            if (QuanLy[i].getBienSoXe().equalsIgnoreCase(bienSoXe)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Khong ton tai xe co bien so: " + bienSoXe);
            return;
        }

        Xe[] newList = new Xe[QuanLy.length - 1];
        int j = 0;
        for (int i = 0; i < QuanLy.length; i++) {
            if (i != index) {
                newList[j++] = QuanLy[i];
            }
        }

        QuanLy = newList;
        System.out.println("Da xoa xe co bien so: " + bienSoXe);
    }

    public double TinhTongTien() {
        if (QuanLy == null) return 0;

        double tong = 0;

        for (Xe x : QuanLy) {
            tong += x.TinhThanhTien();
        }

        return tong;
    }
}
