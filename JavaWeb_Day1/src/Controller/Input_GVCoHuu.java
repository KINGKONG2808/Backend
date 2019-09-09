package Controller;

import Model.GiangVien;
import Model.GiangVienCoHuu;

public class Input_GVCoHuu extends Input_GiangVien {
    public static void nhapGiaoVienCoHuu(GiangVien giangVienCoHuu) {
        Input_GiangVien.nhapGiangVien(giangVienCoHuu);
        System.out.print("So gio nghia vu            : ");
        int soGioNghiaVu = input.nextInt();
        ((GiangVienCoHuu) giangVienCoHuu).setSoGioNghiaVu(soGioNghiaVu);
        System.out.print("So gio giang thuc te       : ");
        int soGioGiangThucTe = input.nextInt();
        ((GiangVienCoHuu) giangVienCoHuu).setSoGioGiangThucTe(soGioGiangThucTe);
        System.out.print("So gio nghien cuu khoa hoc : ");
        int soGioNghienCuuKhoaHoc = input.nextInt();
        ((GiangVienCoHuu) giangVienCoHuu).setSoGioNghienCuuKhoaHoc(soGioNghienCuuKhoaHoc);
        System.out.print("Luong co ban               : ");
        double luongCoBan = input.nextDouble();
        input.nextLine();
        ((GiangVienCoHuu) giangVienCoHuu).setLuongCoBan(luongCoBan);
    }

    public static void nhapDanhSachGiaoVienCoHuu() {
        System.out.println("---> Nhap danh sach giang vien co huu <---");
        System.out.print("So giao vien co huu can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++) {
            System.out.println("- Giao vien co huu thu " + (i+1));
            GiangVien giangVienCoHuu = new GiangVienCoHuu();
            nhapGiaoVienCoHuu(giangVienCoHuu);
            listGiangVien.add(giangVienCoHuu);
        }
    }
}
