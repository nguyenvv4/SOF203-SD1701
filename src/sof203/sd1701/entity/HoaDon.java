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

    private String ten;

    private Integer soLuong;

    private String loaiVe;

    public HoaDon(String ten, Integer soLuong, String loaiVe) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.loaiVe = loaiVe;
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

}
