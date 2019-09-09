package Model;

import Service.TinhLuong;

import java.util.Date;

public class GiangVienCoHuu extends GiangVien implements TinhLuong {
    private int soGioNghiaVu;
    private int soGioGiangThucTe;
    private int soGioNghienCuuKhoaHoc;
    private double luongCoBan;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(String maSo, Date ngayNhanVaoTruong, String ten, String hocVi, SoYeu soYeu, int soGioNghiaVu, int soGioGiangThucTe, int soGioNghienCuuKhoaHoc, double luongCoBan) {
        super(maSo, ngayNhanVaoTruong, ten, hocVi, soYeu);
        this.soGioNghiaVu = soGioNghiaVu;
        this.soGioGiangThucTe = soGioGiangThucTe;
        this.soGioNghienCuuKhoaHoc = soGioNghienCuuKhoaHoc;
        this.luongCoBan = luongCoBan;
    }

    public int getSoGioNghiaVu() {
        return soGioNghiaVu;
    }

    public void setSoGioNghiaVu(int soGioNghiaVu) {
        this.soGioNghiaVu = soGioNghiaVu;
    }

    public int getSoGioNghienCuuKhoaHoc() {
        return soGioNghienCuuKhoaHoc;
    }

    public void setSoGioNghienCuuKhoaHoc(int soGioNghienCuuKhoaHoc) {
        this.soGioNghienCuuKhoaHoc = soGioNghienCuuKhoaHoc;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getSoGioGiangThucTe() {
        return soGioGiangThucTe;
    }

    public void setSoGioGiangThucTe(int soGioGiangThucTe) {
        this.soGioGiangThucTe = soGioGiangThucTe;
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
