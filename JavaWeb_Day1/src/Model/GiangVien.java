package Model;

public class GiangVien {
    private String maSo;
    private String ten;
    private String ngaySinh;
    private String hocVi;
    private String ngayNhanVaoTruong;
    private SoYeu soYeu;

    public GiangVien() {
    }

    public GiangVien(String maSo, String ten, String ngaySinh, String hocVi, String ngayNhanVaoTruong, SoYeu soYeu) {
        this.maSo = maSo;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.hocVi = hocVi;
        this.ngayNhanVaoTruong = ngayNhanVaoTruong;
        this.soYeu = soYeu;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getNgayNhanVaoTruong() {
        return ngayNhanVaoTruong;
    }

    public void setNgayNhanVaoTruong(String ngayNhanVaoTruong) {
        this.ngayNhanVaoTruong = ngayNhanVaoTruong;
    }

    public SoYeu getSoYeu() {
        return soYeu;
    }

    public void setSoYeu(SoYeu soYeu) {
        this.soYeu = soYeu;
    }
}
