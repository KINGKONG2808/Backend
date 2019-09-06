package Model;

public class SoYeu {
    private String hoTen;
    private String gioiTinh;
    private String email;
    private String soDienThoai;
    private BangCap bangCap;

    public SoYeu() {
    }

    public SoYeu(String hoTen, String gioiTinh, String email, String soDienThoai, BangCap bangCap) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.bangCap = bangCap;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public BangCap getBangCap() {
        return bangCap;
    }

    public void setBangCap(BangCap bangCap) {
        this.bangCap = bangCap;
    }
}
