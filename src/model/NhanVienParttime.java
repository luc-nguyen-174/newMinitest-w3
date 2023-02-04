package model;public class NhanVienParttime extends NhanVien implements TinhLuong {    private double gioLamViec;    public double getGioLamViec() {        return gioLamViec;    }    public void setGioLamViec(double gioLamViec) {        this.gioLamViec = gioLamViec;    }    public NhanVienParttime(int maNv, String tenNv, int tuoi, String sdt, String email, double gioLamViec) {        super(maNv, tenNv, tuoi, sdt, email);        this.gioLamViec = gioLamViec;    }    @Override    public double tinhLuong() {        return gioLamViec * 100000;    }    @Override    public String toString() {        return super.toString() + ", giờ làm việc: " + gioLamViec + ", nhân viên part-time.";    }}