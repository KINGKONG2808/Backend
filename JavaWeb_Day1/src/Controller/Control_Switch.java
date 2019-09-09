package Controller;

public class Control_Switch {
    static boolean endLoop = true;
    public static void mainSwitch(int mainChoose) {
        switch (mainChoose) {
            case 1:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.menuNhapDanhSachGVLv1();
                    int luaChonNhap = Input_Control.enterChoose(3);
                    menuNhapDanhSachGVLv1(luaChonNhap);
                } break;
            case 2:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.menuThemDanhSachGVLv1();
                    int luaChonThem = Input_Control.enterChoose(3);
                    menuThemDanhSachGVLv1(luaChonThem);
                } break;
            case 3:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.menuXuatGVTheoChucNangLv1();
                    int luaChonXuat = Input_Control.enterChoose(12);
                    menuXuatGVTheoChucNangLv1(luaChonXuat);
                } break;
            case 0:
                System.out.println("-----> Thoat chuong trinh <-----");
                System.exit(0);
        }
    }

    public static void menuNhapDanhSachGVLv1(int nhap) {
        switch (nhap) {
            case 1: Input_GVCoHuu.nhapDanhSachGiaoVienCoHuu(); break;
            case 2: Input_GVBanCoHuu.nhapDanhSachGiaoVienBanCoHuu(); break;
            case 3: Input_GVThinhThoang.nhapDanhSachGiaoVienThinhThoang(); break;
            case 0: endLoop = false;
        }
    }

    public static void menuThemDanhSachGVLv1(int them) {
        switch (them) {
            case 1:
                if (Add_GiangVien.themGiangVienCoHuu()) System.out.println("Them giang vien thanh cong.");
                else System.out.println("Them giang vien khong thanh cong.");
                break;
            case 2:
                if (Add_GiangVien.themGiangVienBanCoHuu()) System.out.println("Them giang vien thanh cong.");
                else System.out.println("Them giang vien khong thanh cong.");
                break;
            case 3:
                if (Add_GiangVien.themGiangVienThingThoang()) System.out.println("Them giang vien thanh cong.");
                else System.out.println("Them giang vien khong thanh cong.");
                break;
            case 0: endLoop = false;
        }
    }

    public static void menuXuatGVTheoChucNangLv1(int xuatGV) {
        switch (xuatGV) {
            case 1:
                endLoop = true;
                while (endLoop) {
                    Control_ListMenu.menuHienThiDayDuLv2();
                    int dayDu = Input_Control.enterChoose(4);
                    menuHienThiDayDuLv2(dayDu);
                } break;
            case 2: Output_GiangVien.xuatDanhSachGiangVien();
            case 3: Output_GiangVien.thongTinGVNghiViec();
            case 4: Output_GiangVienThinhThoang.xuatGiangVienThingGiangCongTac1Nam(); break;
            case 5: Output_GiangVienBanCoHuu.xuatGiangVienBanCoHuuCongTac3Nam(); break;
            case 6: Output_GiangVienCoHuu.xuatGiangVienCoHuuCuNhan(); break;
            case 7: Output_GiangVien.xuatDanhSachGiangVienThacSiTroLen(); break;
            case 8: Output_GiangVienCoHuu.xuatGiangVienCoHuuTheoTen(); break;
            case 9:
                Output_GiangVienCoHuu.sapXepTheoLuong();
                System.out.println("Sap xep thanh cong, vui long chon chuc nang 1 hoac 2 de xem them.");
                break;
            case 10:
                Output_GiangVien.sapXepTheoHocVi();
                System.out.println("Sap xep thanh cong, vui long chon chuc nang 1 hoac 2 de xem them.");
                break;
            case 11: Output_GiangVienCoHuu.xuatDanhSachGV10Nam(); break;
            case 12: Output_GiangVienCoHuu.xuatGVKhongHoanThanhNhiemVuNam(); break;
            case 0: endLoop = false;
        }
    }

    public static void menuHienThiDayDuLv2(int hienThi) {
        switch (hienThi) {
            case 1:
                System.out.println("\n\t\tGIANG VIEN CO HUU");
                Output_GiangVienCoHuu.xuatGiangVienCoHuu();
                System.out.println("\n\t\tGIANG VIEN BAN CO HUU");
                Output_GiangVienBanCoHuu.xuatGiangVienBanCoHuu();
                System.out.println("\n\t\tGIANG VIEN THINH THOANG");
                Output_GiangVienThinhThoang.xuatGiangVienThinhThoang();
                break;
            case 2:
                System.out.println("\n\t\tGIANG VIEN CO HUU");
                Output_GiangVienCoHuu.xuatGiangVienCoHuu();
                break;
            case 3:
                System.out.println("\n\t\tGIANG VIEN BAN CO HUU");
                Output_GiangVienBanCoHuu.xuatGiangVienBanCoHuu();
                break;
            case 4:
                System.out.println("\n\t\tGIANG VIEN THINH THOANG");
                Output_GiangVienThinhThoang.xuatGiangVienThinhThoang();
            case 0: endLoop = false;
        }
    }
}
