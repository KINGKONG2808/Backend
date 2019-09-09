package Controller;

import java.util.Date;
import java.util.Scanner;

public class Choose {
    public static final String cuNhan = "Cu Nhan";
    public static final String thacSi = "Thac Si";
    public static final String tienSi = "Tien Si";
    public static final String phoGiaSu = "Pho Giao Su";
    public static final String giaoSu = "Giao Su";
    public static final String nam = "Nam";
    public static final String nu = "Nu";
    static Scanner input = new Scanner(System.in);

    public static String luaChonHocVi() {
        System.out.println("--- Hoc Vi ---");
        System.out.println("1. Cu Nhan");
        System.out.println("2. Thac Si");
        System.out.println("3. Tien Si");
        System.out.println("4. Pho Giao Su");
        System.out.println("5. Giao Su");
        System.out.print("Chon hoc vi cua giang vien : ");
        int n = input.nextInt();
        while (n<1 || n>5) {
            System.out.print("Lua chon vua nhap khong ton tai, moi nhap lai: ");
            n = input.nextInt();
        }
        String hocVi = null;
        switch (n) {
            case 1: hocVi = cuNhan; break;
            case 2: hocVi = thacSi; break;
            case 3: hocVi = tienSi; break;
            case 4: hocVi = phoGiaSu; break;
            case 5: hocVi = giaoSu; break;
        }
        return hocVi;
    }

    public static String luaChonGioiTinh() {
        System.out.println("--- Gioi Tinh ---");
        System.out.println("1. Nam");
        System.out.println("2. Nu");
        System.out.print("Nhap gioi tinh cua ban : ");
        int n = input.nextInt();
        while (n<1 || n>2) {
            System.out.print("Lua chon khong ton tai, moi nhap lai: ");
            n = input.nextInt();
        }
        input.nextLine();
        String gioiTinh = null;
        switch (n) {
            case 1: gioiTinh = nam; break;
            case 2: gioiTinh = nu; break;
        }
        return gioiTinh;
    }

    public static int getYear() {
        Date date = new Date();
        return date.getYear()+1900;
    }
}
