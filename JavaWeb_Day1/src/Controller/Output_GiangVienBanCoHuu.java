package Controller;

import Model.GiangVienBanCoHuu;

public class Output_GiangVienBanCoHuu extends Input_GiangVien {
    public static void xuatGiangVienBanCoHuu() {
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienBanCoHuu) {
                Output_GiangVien.xuatGiangVien(i);
                System.out.println("\tSo gio nghia vu : " + ((GiangVienBanCoHuu) listGiangVien.get(i)).getSoGioNghiaVu());
                System.out.println("\tLuong co ban    : " + ((GiangVienBanCoHuu) listGiangVien.get(i)).getLuongCoBan());
            }
        }
    }
}
