package Controller;

import Model.GiangVien;
import Model.GiangVienThinhThoang;

public class Input_GVThinhThoang extends Input_GiangVien {
    public static void nhapGiaoVienThinhThoang(GiangVien giangVienThinhThoang) {
        Input_GiangVien.nhapGiangVien(giangVienThinhThoang);
        System.out.print("Hoc ky day        : ");
        int hocKyDay = input.nextInt();
        ((GiangVienThinhThoang) giangVienThinhThoang).setHocKyDay(hocKyDay);
        System.out.print("So tiet thuc day  : ");
        int soTietThucDay = input.nextInt();
        ((GiangVienThinhThoang) giangVienThinhThoang).setSoTietThucDay(soTietThucDay);
    }

    public static void nhapDanhSachGiaoVienThinhThoang() {
        System.out.println("---> Nhap danh sach giang vien thinh thoang <---");
        System.out.print("So giao vien thinh thoang can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++) {
            System.out.println("- Giao vien thinh thoang thu " + (i+1));
            GiangVien giangVienThinhThoang = new GiangVienThinhThoang();
            nhapGiaoVienThinhThoang(giangVienThinhThoang);
            listGiangVien.add(giangVienThinhThoang);
        }
    }
}
