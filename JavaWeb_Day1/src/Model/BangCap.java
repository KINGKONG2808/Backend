package Model;

public class BangCap {
    private String tentruongCap;
    private String hocVi;
    private int namCap;

    public BangCap() {
    }

    public BangCap(String tentruongCap, String hocVi, int namCap) {
        this.tentruongCap = tentruongCap;
        this.hocVi = hocVi;
        this.namCap = namCap;
    }

    public String getTentruongCap() {
        return tentruongCap;
    }

    public void setTentruongCap(String tentruongCap) {
        this.tentruongCap = tentruongCap;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public int getNamCap() {
        return namCap;
    }

    public void setNamCap(int namCap) {
        this.namCap = namCap;
    }
}
