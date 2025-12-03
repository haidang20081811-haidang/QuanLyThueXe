package QuanLyThueXe;

public class Test {
    public static void main(String[] args) {
        QuanLyThueXe ql = new QuanLyThueXe();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int chon;

        do {
            System.out.println("1\n===== MENU QUAN LY THUE XE =====");
            System.out.println("1. Nhap danh sach xe");
            System.out.println("2. Xuat danh sach xe");
            System.out.println("3. Tim kiem xe theo bien so");
            System.out.println("4. Xoa xe theo bien so");
            System.out.println("5. Tinh tong tien tat ca xe");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {

                case 1:
                    ql.Nhap();
                    break;

                case 2:
                    ql.Xuat();
                    break;

                case 3:
                    System.out.print("Nhap bien so xe can tim: ");
                    String bsTim = sc.nextLine();
                    System.out.println(ql.TimKiem(bsTim));
                    break;

                case 4:
                    System.out.print("Nhap bien so xe can xoa: ");
                    String bsXoa = sc.nextLine();
                    ql.xoa(bsXoa);
                    break;

                case 5:
                    System.out.println("Tong tien tat ca xe: " + ql.TinhTongTien());
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Chon sai, vui long chon lai!");
                    break;
            }

        } while (chon != 0);
    }
}
