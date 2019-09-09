package Model;

import Service.TinhLuong;

import java.util.Date;

public class GiangVienBanCoHuu extends GiangVien implements TinhLuong {
    private int soGioNghiaVu;
    private double luongCoBan;

    public GiangVienBanCoHuu() {
    }

    public GiangVienBanCoHuu(String maSo, Date ngayNhanVaoTruong, String ten, String hocVi, SoYeu soYeu, int soGioNghiaVu, double luongCoBan) {
        super(maSo, ngayNhanVaoTruong, ten, hocVi, soYeu);
        this.soGioNghiaVu = soGioNghiaVu;
        this.luongCoBan = luongCoBan;
    }

    public int getSoGioNghiaVu() {
        return soGioNghiaVu;
    }

    public void setSoGioNghiaVu(int soGioNghiaVu) {
        this.soGioNghiaVu = soGioNghiaVu;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    @Override
    public double getLuong() {
        double tongLuong = getLuongCoBan();
        switch (getHocVi()) {
            case "Cu Nhan": tongLuong+=0.15*tongLuong; break;
            case "Thac Si": tongLuong+=0.3*tongLuong; break;
            case "Tien Si": tongLuong+=0.5*tongLuong; break;
            case "Pho Giao Su":
            case "Giao Su": tongLuong+=0.7*tongLuong; break;
        }
        return tongLuong;
    }
}
