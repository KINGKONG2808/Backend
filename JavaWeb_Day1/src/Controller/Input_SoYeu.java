package Controller;

import Model.BangCap;
import Model.SoYeu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Input_SoYeu {
    static Scanner input = new Scanner(System.in);
    public static SoYeu nhapSoYeu() {
        SoYeu soYeu = new SoYeu();
        System.out.print("Ho va ten     : ");
        String hoTen = input.nextLine();
        soYeu.setHoTen(hoTen);

        System.out.println("---> Ngay - Thang - Nam sinh <---");
        Date ngaySinh = new Date();
        System.out.print("Ngay sinh  : ");
        int day = input.nextInt();
        ngaySinh.setDate(day);
        System.out.print("Thang sinh : ");
        int month = input.nextInt();
        ngaySinh.setMonth(month);
        System.out.print("Nam sinh   : ");
        int year = input.nextInt();
        ngaySinh.setYear(year);
        soYeu.setNgaySinh(ngaySinh);

        String gioiTinh = Choose.luaChonGioiTinh();
        soYeu.setGioiTinh(gioiTinh);
        input.nextLine();

        System.out.print("Email         : ");
        String email = input.nextLine();
        soYeu.setEmail(email);

        System.out.print("So dien thoai : ");
        String soDienThoai = input.nextLine();
        soYeu.setSoDienThoai(soDienThoai);

        System.out.println("- Nhap danh sach bang cap");
        ArrayList<BangCap> listBangCap = Input_BangCap.nhapDanhSachBangCap();
        soYeu.setBangCap(listBangCap);
        return soYeu;
    }
}
