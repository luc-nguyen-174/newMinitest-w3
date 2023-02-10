package model;

public class NhanVienFulltime extends NhanVien {
    private int luong;
    private int tienThuong;
    private int tienPhat;

    public double getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }


    public NhanVienFulltime() {
    }

    public NhanVienFulltime(int maNv, String tenNv, int tuoi, String sdt, String email, int luong, int tienThuong, int tienPhat) {
        super(maNv, tenNv, tuoi, sdt, email);
        this.luong = luong;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
    }

    @Override
    public double tinhLuong() {
        return luong + (tienThuong - tienPhat);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", lương: " + luong + "đ" +
                ", tiền thưởng: " + tienThuong + "đ" +
                ", tiền phạt: " + tienPhat + "đ" + ", nhân viên chính thức.";
    }
}
