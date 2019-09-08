package Model;

import java.util.Date;

public class GiangVienBanCoHuu extends GiangVien {
    private int soGioNghiaVu;
    private double luongCoBan;

    public GiangVienBanCoHuu() {
    }

    public GiangVienBanCoHuu(String maSo, Date ngayNhanVaoTruong, SoYeu soYeu, int soGioNghiaVu, double luongCoBan) {
        super(maSo, ngayNhanVaoTruong, soYeu);
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
}
