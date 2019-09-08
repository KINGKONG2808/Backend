package Controller;

import Model.*;

public class Add_GiangVien extends Input_GiangVien {
    public static boolean themGiangVienCoHuu() {
        GiangVienCoHuu giangVienCoHuu = new GiangVienCoHuu();
        Input_GVCoHuu.nhapGiaoVienCoHuu(giangVienCoHuu);
        for (int i=0; i<listGiangVien.size(); i++) { if (giangVienCoHuu.getMaSo().compareTo(listGiangVien.get(i).getMaSo())==0) return false; }
        listGiangVien.add(giangVienCoHuu);
        return true;
    }

    public static boolean themGiangVienBanCoHuu() {
        GiangVienBanCoHuu giangVienBanCoHuu = new GiangVienBanCoHuu();
        Input_GVBanCoHuu.nhapGiaoVienBanCoHuu(giangVienBanCoHuu);
        for (int i=0; i<listGiangVien.size(); i++) { if (giangVienBanCoHuu.getMaSo().compareTo(listGiangVien.get(i).getMaSo())==0) return false; }
        listGiangVien.add(giangVienBanCoHuu);
        return true;
    }

    public static boolean themGiangVienThingThoang() {
        GiangVienThinhThoang giangVienThinhThoang = new GiangVienThinhThoang();
        Input_GVThinhThoang.nhapGiaoVienThinhThoang(giangVienThinhThoang);
        for (int i=0; i<listGiangVien.size(); i++) { if (giangVienThinhThoang.getMaSo().compareTo(listGiangVien.get(i).getMaSo())==0) return false; }
        listGiangVien.add(giangVienThinhThoang);
        return true;
    }
}
