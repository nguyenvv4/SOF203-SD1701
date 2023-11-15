/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.entity;

/**
 *
 * @author nguyenvv
 */
public class HoaDon {

    private Integer id;

    private String ten;

    private Integer soLuong;

    private String loaiVe;

    public HoaDon(Integer id, String ten, Integer soLuong, String loaiVe) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
        this.loaiVe = loaiVe;
    }

    public HoaDon() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public Double thanhTien() {
        if (loaiVe.equals("Hoc Lai")) {
            return soLuong.doubleValue() * 80000;
        } else {
            return soLuong.doubleValue() * 100000;
        }
    }

    @Override
    public String toString() {
        return "HoaDon{" + "ten=" + ten + ", soLuong=" + soLuong + ", loaiVe=" + loaiVe + '}';
    }

}
