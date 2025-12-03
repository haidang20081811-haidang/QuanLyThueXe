package QuanLyThueXe;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Xe {
    private String bienSoXe;
    private String tenXe;
    private String tienDatCoc;
    private Date ngayThue;
    protected Scanner sc = new Scanner(System.in);
    
    public Xe(){
    }

    public Xe(String bienSoXe, String tenXe, String tienDatCoc, Date ngayThue) {
        this.bienSoXe = bienSoXe;
        this.tenXe = tenXe;
        this.tienDatCoc = tienDatCoc;
        this.ngayThue = ngayThue;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(String tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public void Nhap() {
    try {
        System.out.print("Nhap bien so xe: ");
        bienSoXe = sc.nextLine();

        System.out.print("Nhap ten xe: ");
        tenXe = sc.nextLine();

        System.out.print("Nhap tien dat coc xe: ");
        tienDatCoc = sc.nextLine();

        System.out.print("Nhap ngay thue (dd/MM/yyyy): ");
        String ngay = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ngayThue = sdf.parse(ngay);

    } catch (Exception e) {
        System.out.println("Loi nhap du lieu!");
    }
}

    public void Xuat() {
        System.out.println("Bien so xe: " + bienSoXe);
        System.out.println("Ten xe: " + tenXe);
        System.out.println("Tien dat coc: " + tienDatCoc);
        System.out.println("Ngay thue: " + ngayThue);
    }
    public abstract double TinhThanhTien();
}
