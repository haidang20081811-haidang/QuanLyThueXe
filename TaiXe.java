package QuanLyThueXe;

import java.util.Scanner;

public class TaiXe {
    private String hoTen;
    private String soDT;
    private String cccd;
    private Xe xe; 

    private Scanner sc = new Scanner(System.in);

    public TaiXe() {
    }

    public void Nhap() {
        System.out.print("Nhap ho ten tai xe: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap so dien thoai: ");
        soDT = sc.nextLine();

        System.out.print("Nhap CCCD: ");
        cccd = sc.nextLine();

        System.out.println("=== Nhap thong tin xe cua tai xe ===");
        System.out.println("1. Xe cho hang");
        System.out.println("2. Xe du lich");
        System.out.print("Chọn loại xe: ");
        int chon = Integer.parseInt(sc.nextLine());

        if (chon == 1) {
            xe = new XeChoHang();
        } else {
            xe = new XeChoHang(); 
        }

        xe.Nhap();
    }

    public void Xuat() {
        System.out.println("\n=== Thong Tin Tai Xe ===");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("So dien thoai: " + soDT);
        System.out.println("CCCD: " + cccd);

        System.out.println("\n--- Thong tin xe cua tai xe ---");
        if (xe != null) {
            xe.Xuat();
        } else {
            System.out.println("Tai xe chua dang ki xe.");
        }
    }
}
