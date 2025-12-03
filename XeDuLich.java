package QuanLyThueXe;

import java.util.Date;


public class XeDuLich extends Xe {

    protected int soChoNgoi;

    public XeDuLich() {
        super();
    }

    public XeDuLich(String BienSoXe, String TenXe, String TienDatCoc,Date NgayThue,int soChoNgoi) {
        super(BienSoXe, TenXe, TienDatCoc,NgayThue);
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 

        try {
            System.out.print("Nhap so cho ngoi: ");
            this.soChoNgoi = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Nhap sai, mac dinh so cho ngoi = 4.");
            this.soChoNgoi = 4;
        }
    }

    @Override
    public void Xuat() {
        super.Xuat(); 
        System.out.println("So cho ngoi la: " + soChoNgoi);
    }

    @Override
    public double TinhThanhTien() {
        double giaNgay;

        if (soChoNgoi <= 4) giaNgay = 500000;
        else if (soChoNgoi <= 7) giaNgay = 700000;
        else giaNgay = 900000;

        long soNgay = TinhSoNgayThue();

        return soNgay * giaNgay;
    }

    private long TinhSoNgayThue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'TinhSoNgayThue'");
    }
}
