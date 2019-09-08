package Controller;

import Model.GiangVien;
import Model.SoYeu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Input_GiangVien {
    static Scanner input = new Scanner(System.in);
    static ArrayList<GiangVien> listGiangVien = new ArrayList<>();
    public static void nhapGiangVien(GiangVien giangVien) {
        System.out.print("Ma giang vien         : ");
        String maGiangVien = input.nextLine();
        giangVien.setMaSo(maGiangVien);

        System.out.println("---> Thoi gian nhan vao truong <---");
        Date ngayNhanVaoTruong = new Date();
        System.out.print("Ngay nhan vao truong  : ");
        int day = input.nextInt();
        ngayNhanVaoTruong.setDate(day);
        System.out.print("Thang nhan vao truong : ");
        int month = input.nextInt();
        ngayNhanVaoTruong.setMonth(month);
        System.out.print("Nam nhan vao truong   : ");
        int year = input.nextInt();
        ngayNhanVaoTruong.setYear(year);
        giangVien.setNgayNhanVaoTruong(ngayNhanVaoTruong);

        System.out.println("- Nhap so yeu giang vien");
        SoYeu soYeu = Input_SoYeu.nhapSoYeu();
        giangVien.setSoYeu(soYeu);
    }
}
