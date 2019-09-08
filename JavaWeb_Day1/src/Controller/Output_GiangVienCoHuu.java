package Controller;

import Model.GiangVienCoHuu;

public class Output_GiangVienCoHuu extends Input_GiangVien {
    public static void xuatGiangVienCoHuu() {
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienCoHuu) {
                Output_GiangVien.xuatGiangVien(i);
                System.out.println("\tSo gio nghia vu            : " + ((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghiaVu());
                System.out.println("\tSo gio nghien cuu khoa hoc : " + ((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghienCuuKhoaHoc());
                System.out.println("\tLuong co ban               : " + ((GiangVienCoHuu) listGiangVien.get(i)).getLuongCoBan());
            }
        }
    }
}
