package Model;

import java.util.ArrayList;
import java.util.Date;

public class SoYeu {
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private String email;
    private String soDienThoai;
    private ArrayList<BangCap> bangCap;

    public SoYeu() {
    }

    public SoYeu(String hoTen, Date ngaySinh, String gioiTinh, String email, String soDienThoai, ArrayList<BangCap> bangCap) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
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

    public ArrayList<BangCap> getBangCap() {
        return bangCap;
    }

    public void setBangCap(ArrayList<BangCap> bangCap) {
        this.bangCap = bangCap;
    }
}
