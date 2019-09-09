package Model;

import java.util.Date;

public class GiangVien {
    private String maSo;
    private Date ngayNhanVaoTruong;
    private String ten;
    private String hocVi;
    private SoYeu soYeu;

    public GiangVien() {
    }

    public GiangVien(String maSo, Date ngayNhanVaoTruong, String ten, String hocVi, SoYeu soYeu) {
        this.maSo = maSo;
        this.ngayNhanVaoTruong = ngayNhanVaoTruong;
        this.ten = ten;
        this.hocVi = hocVi;
        this.soYeu = soYeu;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public Date getNgayNhanVaoTruong() {
        return ngayNhanVaoTruong;
    }

    public void setNgayNhanVaoTruong(Date ngayNhanVaoTruong) {
        this.ngayNhanVaoTruong = ngayNhanVaoTruong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public SoYeu getSoYeu() {
        return soYeu;
    }

    public void setSoYeu(SoYeu soYeu) {
        this.soYeu = soYeu;
    }
}
