/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.entity;

/**
 *
 * @author nguyenvv
 */
public class NhanVien {

    private String id;
    private String hoTen;
    private String gioiTinh; // radio button
    private String diaChi;
    private Long luong;
    private String trangThai; // radiobutton
    private String phongBan;// combobox
    // Tạo view chứa các thông tin trên
    // 1 Hiển thị danh sách 5 phần tử lên table
    // 2 Xoá thành công 1 phần tử được chọn
    // 3.Thêm thành công 1 phần tử vào table. vailidate trường hợp trùng id
    // 4. Tìm kiếm theo tên nhân viên

    public NhanVien(String id, String hoTen, String gioiTinh, String diaChi, Long luong, String trangThai, String phongBan) {
        this.id = id;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.luong = luong;
        this.trangThai = trangThai;
        this.phongBan = phongBan;
    }

    public NhanVien() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Long getLuong() {
        return luong;
    }

    public void setLuong(Long luong) {
        this.luong = luong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

}
