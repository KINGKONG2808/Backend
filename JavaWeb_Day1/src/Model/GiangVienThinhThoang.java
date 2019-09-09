package Model;

import Service.TinhLuong;

import java.util.Date;

public class GiangVienThinhThoang extends GiangVien implements TinhLuong {
    private int hocKyDay;
    private int soTietThucDay;

    public GiangVienThinhThoang() {
    }

    public GiangVienThinhThoang(String maSo, Date ngayNhanVaoTruong, String ten, String hocVi, SoYeu soYeu, int hocKyDay, int soTietThucDay) {
        super(maSo, ngayNhanVaoTruong, ten, hocVi, soYeu);
        this.hocKyDay = hocKyDay;
        this.soTietThucDay = soTietThucDay;
    }

    public int getHocKyDay() {
        return hocKyDay;
    }

    public void setHocKyDay(int hocKyDay) {
        this.hocKyDay = hocKyDay;
    }

    public int getSoTietThucDay() {
        return soTietThucDay;
    }

    public void setSoTietThucDay(int soTietThucDay) {
        this.soTietThucDay = soTietThucDay;
    }

    //cau 5
    @Override
    public double getLuong() { return 100000*getSoTietThucDay(); }
}

