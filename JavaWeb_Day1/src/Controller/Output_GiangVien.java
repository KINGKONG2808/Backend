package Controller;

import Model.*;

import java.util.Collections;
import java.util.Comparator;

public class Output_GiangVien extends Input_GiangVien {
    public static void xuatGiangVien(int i) {
        System.out.println("\n\t- Giang vien thu " + (i+1));
        System.out.println("\tMa so           : " + listGiangVien.get(i).getMaSo());
        System.out.println("\tNgay vao truong : " +
                listGiangVien.get(i).getNgayNhanVaoTruong().getDate() + "/" +
                listGiangVien.get(i).getNgayNhanVaoTruong().getMonth() + "/" +
                listGiangVien.get(i).getNgayNhanVaoTruong().getYear());
        System.out.println("\tHo ten          : " + listGiangVien.get(i).getSoYeu().getHoTen());
        System.out.println("\tGioi tinh       : " + listGiangVien.get(i).getSoYeu().getGioiTinh());
        System.out.println("\tNgay sinh       : " +
                listGiangVien.get(i).getSoYeu().getNgaySinh().getDate() + "/" +
                listGiangVien.get(i).getSoYeu().getNgaySinh().getMonth() + "/" +
                listGiangVien.get(i).getSoYeu().getNgaySinh().getYear());
        System.out.println("\tEmail           : " + listGiangVien.get(i).getSoYeu().getEmail());
        System.out.println("\tSo dien thoai   : " + listGiangVien.get(i).getSoYeu().getSoDienThoai());
        System.out.println("\t---------- Danh sach bang cap giang vien ---------");
        System.out.printf("%20s%20s%20s%n", "Ten truong cap", "Hoc vi", "Nam cap");
        for (int j=0; j<listGiangVien.get(i).getSoYeu().getBangCap().size(); j++) {
            System.out.printf("%20s%20s%20s%n",
                    listGiangVien.get(i).getSoYeu().getBangCap().get(j).getTentruongCap(),
                    listGiangVien.get(i).getSoYeu().getBangCap().get(j).getHocVi(),
                    listGiangVien.get(i).getSoYeu().getBangCap().get(j).getNamCap());
        }
    }

    public static void xuatDanhSachGiangVien() {
        System.out.printf("%20s%20s%20s%20s%20s%20s%n", "Ma Giang Vien", "Ho Va Ten", "Hoc Vi", "Email", "So Dien Thoai", "Chuc Vu GV");
        for (int i=0; i<listGiangVien.size(); i++) {
            System.out.printf("%20s%20s%20s%20s%20s",
                    listGiangVien.get(i).getMaSo(),
                    listGiangVien.get(i).getSoYeu().getHoTen(),
                    listGiangVien.get(i).getHocVi(),
                    listGiangVien.get(i).getSoYeu().getEmail(),
                    listGiangVien.get(i).getSoYeu().getSoDienThoai());
            if (listGiangVien.get(i) instanceof GiangVienCoHuu) System.out.printf("%20s%n", "GV Co Huu");
            else if (listGiangVien.get(i) instanceof GiangVienBanCoHuu) System.out.printf("%20s%n", "GV Ban Co Huu");
            else System.out.printf("%20s%n", "GV Thing Thoang");
        }
    }

    public static void xuatDanhSachGiangVienThacSiTroLen() {
        System.out.printf("%20s%20s%20s%20s%20s%20s%n", "Ma Giang Vien", "Ho Va Ten", "Hoc Vi", "Email", "So Dien Thoai", "Luong/Thang");
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i).getHocVi().compareTo("Cu Nhan")!=0) {
                System.out.printf("%20s%20s%20s%20s%20s",
                        listGiangVien.get(i).getMaSo(),
                        listGiangVien.get(i).getSoYeu().getHoTen(),
                        listGiangVien.get(i).getHocVi(),
                        listGiangVien.get(i).getSoYeu().getEmail(),
                        listGiangVien.get(i).getSoYeu().getSoDienThoai());
                if (listGiangVien.get(i) instanceof GiangVienCoHuu) System.out.printf("%20.1f%n", ((GiangVienCoHuu) listGiangVien.get(i)).getLuong());
                else if (listGiangVien.get(i) instanceof GiangVienBanCoHuu) System.out.printf("%20.1f%n", ((GiangVienBanCoHuu) listGiangVien.get(i)).getLuong());
                else System.out.printf("%20.1f%n", ((GiangVienThinhThoang)listGiangVien.get(i)).getLuong());
            }
        }
    }

    public static int getThuTu(String hocVi) {
        int thuTu = 0;
        switch (hocVi) {
            case "Cu Nhan": thuTu = 0; break;
            case "Thac Si": thuTu = 1; break;
            case "Tien Si": thuTu = 2; break;
            case "Pho Giao Su": thuTu = 3; break;
            case "Giao Su": thuTu = 4; break;
        }
        return thuTu;
    }

    public static void sapXepTheoHocVi() {
        Collections.sort(listGiangVien, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien gv1, GiangVien gv2) {
                if (getThuTu(gv1.getHocVi())>getThuTu(gv2.getHocVi()))  return 1;
                else return -1;
            }
        });
    }
}
