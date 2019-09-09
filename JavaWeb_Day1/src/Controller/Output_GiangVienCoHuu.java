package Controller;

import Model.GiangVien;
import Model.GiangVienCoHuu;

import java.util.Collections;
import java.util.Comparator;

public class Output_GiangVienCoHuu extends Input_GiangVien {
    //cau 6
    public static double tienVuotChuanNam(int i) {
        double tienVuotChuan = 0;
        if (((GiangVienCoHuu) listGiangVien.get(i)).getSoGioGiangThucTe()<((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghiaVu()) {
            tienVuotChuan = 0;
        } else {
            if (((GiangVienCoHuu) listGiangVien.get(i)).getSoGioGiangThucTe()<((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghienCuuKhoaHoc()) {
                tienVuotChuan = 0;
            } else {
                if (listGiangVien.get(i).getHocVi().compareTo("Cu Nhan")==0 ||
                        listGiangVien.get(i).getHocVi().compareTo("Thac Si")==0) {
                    tienVuotChuan = (((GiangVienCoHuu) listGiangVien.get(i)).getSoGioGiangThucTe()-460)*80000 - 0.1*((GiangVienCoHuu) listGiangVien.get(i)).getLuong();
                } else {
                    tienVuotChuan = (((GiangVienCoHuu) listGiangVien.get(i)).getSoGioGiangThucTe()-560)*80000 - 0.1*((GiangVienCoHuu) listGiangVien.get(i)).getLuong();
                }
            }
        }
        return tienVuotChuan;
    }

    public static void outputAllInfor(int i) {
        Output_GiangVien.xuatGiangVien(i);
        System.out.println("\t===> Thu nhap theo thang cua giang vien <===");
        System.out.println("\tSo gio nghia vu   : " + ((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghiaVu());
        System.out.println("\tSo gio thuc te    : " + ((GiangVienCoHuu) listGiangVien.get(i)).getSoGioGiangThucTe());
        System.out.println("\tSo gio nghien cuu : " + ((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghienCuuKhoaHoc());
        System.out.println("\tLuong co ban      : " + ((GiangVienCoHuu) listGiangVien.get(i)).getLuongCoBan());
        System.out.println("\tThu nhap ca nhan  : " + ((GiangVienCoHuu) listGiangVien.get(i)).getLuong());
        System.out.println("\tThu lao vuot chuan/nam : " + tienVuotChuanNam(i));
    }

    public static void xuatGiangVienCoHuu() {
        for (int i=0; i<listGiangVien.size(); i++) { if (listGiangVien.get(i) instanceof GiangVienCoHuu) outputAllInfor(i); }
    }

    //cau 9 chua co bang thc si thi chi co the la bang cu nhan.
    public static void xuatGiangVienCoHuuCuNhan() {
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienCoHuu) { if (listGiangVien.get(i).getHocVi().compareTo("Cu Nhan")==0) outputAllInfor(i); }
        }
    }

    //cau 11
    public static void xuatGiangVienCoHuuTheoTen() {
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienCoHuu) {
                if (listGiangVien.get(i).getHocVi().compareTo("Cu Nhan")!=0 &&
                    (listGiangVien.get(i).getTen().indexOf("N")==0 ||
                            listGiangVien.get(i).getTen().indexOf("n")==0))
                    outputAllInfor(i);
            }
        }
    }

    //cau 12
    public static void sapXepTheoLuong() {
        Collections.sort(listGiangVien, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien gv1, GiangVien gv2) {
                if (((GiangVienCoHuu) gv1).getLuong() > ((GiangVienCoHuu) gv2).getLuong()) return 1;
                else return -1;
            }
        });
    }

    public static void outputHighlightInfor(int i) {
        System.out.printf("%20s%20s%20d%20s%20.1f%n",
                listGiangVien.get(i).getMaSo(),
                listGiangVien.get(i).getSoYeu().getHoTen(),
                listGiangVien.get(i).getNgayNhanVaoTruong().getYear(),
                listGiangVien.get(i).getHocVi(),
                ((GiangVienCoHuu) listGiangVien.get(i)).getLuong());
    }

    //cau 14
    public static void xuatDanhSachGV10Nam() {
        System.out.printf("%20s%20s%20s%20s%20s%n", "Ma Giang Vien", "Ho va Ten", "Nam vao truong", "Hoc Vi", "Luong/Thang");
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienCoHuu) { if (Choose.getYear()-listGiangVien.get(i).getNgayNhanVaoTruong().getYear()>10) outputHighlightInfor(i); }
        }
    }

    //cau 15
    public static boolean kiemTraGVDatChuanSoGioNghienCuuKhoaHoc() {
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienCoHuu) {
                if (((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghienCuuKhoaHoc() >= 0.3*((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghiaVu()) return true;
            }
        }
        return false;
    }

    public static boolean kiemTraHocVi(String hocVi, int soGioNghiaVu, int soGioNghienCuu) {
        switch (hocVi) {
            case "Cu Nhan":
            case "Thac Si":
                if (soGioNghiaVu>=460 && soGioNghienCuu>=0.3*460) return true;
            case "Tien Si":
            case "Pho Giao Su":
            case "Giao Su":
                if (soGioNghiaVu>=560 && soGioNghienCuu>=0.3*560) return true;
        }
        return false;
    }

    //cau 16
    public static boolean kiemTraGVHoanThanhNhiemVu() {
        for (int i=0; i<listGiangVien.size(); i++) {
            if (listGiangVien.get(i) instanceof GiangVienCoHuu) {
                if (kiemTraHocVi(listGiangVien.get(i).getHocVi(),
                        ((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghiaVu(),
                        ((GiangVienCoHuu) listGiangVien.get(i)).getSoGioNghienCuuKhoaHoc())) return true;
            }
        }
        return false;
    }

    //cau 17
    public static void xuatGVKhongHoanThanhNhiemVuNam() {
        System.out.printf("%20s%20s%20s%20s%20s%n", "Ma Giang Vien", "Ho va Ten", "Nam vao truong", "Hoc Vi", "Luong/Thang");
        for (int i=0; i<listGiangVien.size(); i++) { if (!kiemTraGVDatChuanSoGioNghienCuuKhoaHoc() && !kiemTraGVHoanThanhNhiemVu()) outputHighlightInfor(i); }
    }
}
