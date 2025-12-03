package QuanLyThueXe;

import java.util.Date;

public class XeChoHang extends Xe {
    private int soHang;

    public XeChoHang(){
        super();
    }
    public XeChoHang(String bienSoXe, String tenXe, String tienDatCoc, Date ngayThue){
        super(bienSoXe, tenXe, tienDatCoc, ngayThue);
        this.soHang = soHang;
    }
    @Override
public void Nhap() {
    super.Nhap();

    System.out.print("Nhap so hang: ");
    soHang = Integer.parseInt(sc.nextLine());
}

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("So hang la: " + soHang);
    }
    @Override
    public double TinhThanhTien() {
        return soHang * 50000;
    }
}
