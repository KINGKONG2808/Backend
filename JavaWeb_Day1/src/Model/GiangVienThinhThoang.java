package Model;

public class GiangVienThinhThoang extends GiangVien {
    private int hocKyDay;
    private int soTietThucDay;

    public GiangVienThinhThoang() {
    }

    public GiangVienThinhThoang(String maSo, String ten, String ngaySinh, String hocVi, String ngayNhanVaoTruong, SoYeu soYeu, int hocKyDay, int soTietThucDay) {
        super(maSo, ten, ngaySinh, hocVi, ngayNhanVaoTruong, soYeu);
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
}

