package Controller;

import Model.GiangVienThinhThoang;

public class Output_GiangVienThinhThoang extends Input_GiangVien {
    public static void xuatGiangVienThinhThoang() {
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienThinhThoang) {
                Output_GiangVien.xuatGiangVien(i);
                System.out.println("\tHoc ky day       : " + ((GiangVienThinhThoang) listGiangVien.get(i)).getHocKyDay());
                System.out.println("\tSo tiet thuc day : " + ((GiangVienThinhThoang) listGiangVien.get(i)).getSoTietThucDay());
            }
        }
    }
}
