package Model;

import java.util.Date;

public class GiangVienCoHuu extends GiangVien {
    private int soGioNghiaVu;
    private int soGioNghienCuuKhoaHoc;
    private double luongCoBan;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(String maSo, Date ngayNhanVaoTruong, SoYeu soYeu, int soGioNghiaVu, int soGioNghienCuuKhoaHoc, double luongCoBan) {
        super(maSo, ngayNhanVaoTruong, soYeu);
        this.soGioNghiaVu = soGioNghiaVu;
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
}
