package Controller;

import Model.GiangVien;
import Model.GiangVienBanCoHuu;

public class Input_GVBanCoHuu extends Input_GiangVien {
    public static void nhapGiaoVienBanCoHuu(GiangVien giangVienBanCoHuu) {
        Input_GiangVien.nhapGiangVien(giangVienBanCoHuu);
        System.out.print("So gio nghia vu   : ");
        int soGioNghiaVu = input.nextInt();
        ((GiangVienBanCoHuu) giangVienBanCoHuu).setSoGioNghiaVu(soGioNghiaVu);
        System.out.print("Luong co ban      : ");
        double luongCoBan = input.nextDouble();
        input.nextLine();
        ((GiangVienBanCoHuu) giangVienBanCoHuu).setLuongCoBan(luongCoBan);
    }

    public static void nhapDanhSachGiaoVienBanCoHuu() {
        System.out.println("---> Nhap danh sach giang vien ban co huu <---");
        System.out.print("So giao vien ban co huu can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++) {
            System.out.println("- Giao vien ban co huu thu " + (i+1));
            GiangVien giangVienBanCoHuu = new GiangVienBanCoHuu();
            nhapGiaoVienBanCoHuu(giangVienBanCoHuu);
            listGiangVien.add(giangVienBanCoHuu);
        }
    }
}
