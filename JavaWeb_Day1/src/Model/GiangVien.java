package Model;

import java.util.Date;

public class GiangVien {
    private String maSo;
    private Date ngayNhanVaoTruong;
    private SoYeu soYeu;

    public GiangVien() {
    }

    public GiangVien(String maSo, Date ngayNhanVaoTruong, SoYeu soYeu) {
        this.maSo = maSo;
        this.ngayNhanVaoTruong = ngayNhanVaoTruong;
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

    public SoYeu getSoYeu() {
        return soYeu;
    }

    public void setSoYeu(SoYeu soYeu) {
        this.soYeu = soYeu;
    }
}
