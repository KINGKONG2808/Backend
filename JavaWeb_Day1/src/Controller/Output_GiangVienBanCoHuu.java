package Controller;

import Model.GiangVienBanCoHuu;
import Service.TinhLuong;

public class Output_GiangVienBanCoHuu extends Input_GiangVien {
    public static void output(int i) {
        Output_GiangVien.xuatGiangVien(i);
        System.out.println("\tSo gio nghia vu  : " + ((GiangVienBanCoHuu) listGiangVien.get(i)).getSoGioNghiaVu());
        System.out.println("\tLuong co ban     : " + ((GiangVienBanCoHuu) listGiangVien.get(i)).getLuongCoBan());
        System.out.println("\tTong luong/thang : " + ((GiangVienBanCoHuu) listGiangVien.get(i)).getLuong());
    }

    public static void xuatGiangVienBanCoHuu() {
        for (int i=0; i<listGiangVien.size(); i++) { if (listGiangVien.get(i) instanceof GiangVienBanCoHuu) output(i); }
    }

    public static void xuatGiangVienBanCoHuuCongTac3Nam() {
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienBanCoHuu) {
                if (listGiangVien.get(i).getHocVi().compareTo("Cu Nhan")!=0 &&
                        Choose.getYear()-listGiangVien.get(i).getNgayNhanVaoTruong().getYear()>=3) {
                    output(i);
                }
            }
        }
    }
}
