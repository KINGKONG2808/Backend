package Model;

public class GiangVienCoHuu extends GiangVien {
    private float soGioNghiaVu;
    private float soGioNghienCuuKhoaHoc;
    private float luongCoBan;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(String maSo, String ten, String ngaySinh, String hocVi, String ngayNhanVaoTruong, SoYeu soYeu, float soGioNghiaVu, float soGioNghienCuuKhoaHoc, float luongCoBan) {
        super(maSo, ten, ngaySinh, hocVi, ngayNhanVaoTruong, soYeu);
        this.soGioNghiaVu = soGioNghiaVu;
        this.soGioNghienCuuKhoaHoc = soGioNghienCuuKhoaHoc;
        this.luongCoBan = luongCoBan;
    }

    public float getSoGioNghiaVu() {
        return soGioNghiaVu;
    }

    public void setSoGioNghiaVu(float soGioNghiaVu) {
        this.soGioNghiaVu = soGioNghiaVu;
    }

    public float getSoGioNghienCuuKhoaHoc() {
        return soGioNghienCuuKhoaHoc;
    }

    public void setSoGioNghienCuuKhoaHoc(float soGioNghienCuuKhoaHoc) {
        this.soGioNghienCuuKhoaHoc = soGioNghienCuuKhoaHoc;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
}
