package Controller;

import Model.BangCap;

import java.util.ArrayList;
import java.util.Scanner;

public class Input_BangCap {
    static Scanner input = new Scanner(System.in);
    public static BangCap nhapBangCap() {
        BangCap bangCap = new BangCap();
        System.out.print("Ten truong cap    : ");
        String tenTruongCap = input.nextLine();
        bangCap.setTentruongCap(tenTruongCap);

        String hocVi = Choose.luaChonHocVi();
        bangCap.setHocVi(hocVi);

        System.out.print("Nam cap           : ");
        int namCap = input.nextInt();
        bangCap.setNamCap(namCap);
        input.nextLine();

        return bangCap;
    }

    public static ArrayList<BangCap> nhapDanhSachBangCap() {
        System.out.print("So luong bang cap ban co: ");
        int n = input.nextInt();
        input.nextLine();
        ArrayList<BangCap> listBangCap = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.println("- Truong cap thu " + (i+1));
            listBangCap.add(nhapBangCap());
        }
        return listBangCap;
    }
}
