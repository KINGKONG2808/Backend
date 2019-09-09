package Controller;

import Model.GiangVienThinhThoang;

public class Output_GiangVienThinhThoang extends Input_GiangVien {
    public static void output(int i) {
        Output_GiangVien.xuatGiangVien(i);
        System.out.println("\tHoc ky day        : " + ((GiangVienThinhThoang) listGiangVien.get(i)).getHocKyDay());
        System.out.println("\tSo tiet thuc day  : " + ((GiangVienThinhThoang) listGiangVien.get(i)).getSoTietThucDay());
        System.out.println("\tLuong/so tiet day : " + ((GiangVienThinhThoang) listGiangVien.get(i)).getLuong());
    }

    public static void xuatGiangVienThinhThoang() {
        for (int i=0; i<listGiangVien.size(); i++) { if (listGiangVien.get(i) instanceof GiangVienThinhThoang) output(i); }
    }

    public static void xuatGiangVienThingGiangCongTac1Nam() {
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienThinhThoang) {
                if ((listGiangVien.get(i).getHocVi().compareTo("Tien Si")==0 ||
                        listGiangVien.get(i).getHocVi().compareTo("Pho Giao Su")==0 ||
                        listGiangVien.get(i).getHocVi().compareTo("Giao Su")==0) &&
                        (Choose.getYear()-listGiangVien.get(i).getNgayNhanVaoTruong().getYear()>=1)) {
                    output(i);
                }
            }
        }
    }
}
