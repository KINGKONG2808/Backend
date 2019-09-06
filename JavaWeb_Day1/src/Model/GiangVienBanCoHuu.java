package Model;

public class GiangVienBanCoHuu extends GiangVien {
    private float soGioNghiaVu;

    public GiangVienBanCoHuu() {
    }

    public GiangVienBanCoHuu(String maSo, String ten, String ngaySinh, String hocVi, String ngayNhanVaoTruong, SoYeu soYeu, float soGioNghiaVu) {
        super(maSo, ten, ngaySinh, hocVi, ngayNhanVaoTruong, soYeu);
        this.soGioNghiaVu = soGioNghiaVu;
    }

    public float getSoGioNghiaVu() {
        return soGioNghiaVu;
    }

    public void setSoGioNghiaVu(float soGioNghiaVu) {
        this.soGioNghiaVu = soGioNghiaVu;
    }
}
