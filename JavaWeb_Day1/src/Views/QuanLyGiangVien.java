package Views;

import Controller.*;

public class QuanLyGiangVien {
    public static void main(String[] args) {
        Input_GVCoHuu.nhapDanhSachGiaoVienCoHuu();
        Input_GVBanCoHuu.nhapDanhSachGiaoVienBanCoHuu();
        Input_GVThinhThoang.nhapDanhSachGiaoVienThinhThoang();
        //Output_GiangVienCoHuu.xuatGiangVienCoHuu();
        //Output_GiangVienBanCoHuu.xuatGiangVienBanCoHuu();
        //Output_GiangVienThinhThoang.xuatGiangVienThinhThoang();
        //Output_GiangVien.xuatDanhSachGiangVien();
        //Output_GiangVienCoHuu.xuatGiangVienCoHuuTheoTen();
        Output_GiangVien.sapXepTheoHocVi();
        Output_GiangVien.xuatDanhSachGiangVien();
    }
}
