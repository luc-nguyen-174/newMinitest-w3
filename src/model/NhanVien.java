package model;

public abstract class NhanVien implements TinhLuong {
    private int maNv;
    private String tenNv;
    private int tuoi;
    private String sdt;
    private String email;

    public NhanVien() {
    }

    public NhanVien(int maNv, String tenNv, int tuoi, String sdt, String email) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + maNv +
                ", tên: " + tenNv +
                ", tuổi: " + tuoi +
                ", số điện thoại: " + sdt +
                ", email: " + email;
    }

}
