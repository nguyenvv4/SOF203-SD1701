/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.repository;

import java.util.ArrayList;
import sof203.sd1701.entity.NhanVien;
import java.sql.*;

/**
 *
 * @author nguyenvv
 */
public class NhanVienRepository {

    DbConnection dbConnection;

    public ArrayList<NhanVien> getList() {

        String sql = "SELECT * from NhanVien ";
        ArrayList<NhanVien> list = new ArrayList<>();

        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("Id");
                String hoTen = rs.getString("HoTen");
                String diaChi = rs.getString("DiaChi");
                String gioiTinh = rs.getString("GioiTinh");
                Long luong = rs.getLong("Luong");
                String trangThai = rs.getString("TrangThai");
                String phongBan = rs.getString("PhongBan");
                NhanVien nhanVien = new NhanVien(id, hoTen, gioiTinh, diaChi, luong, trangThai, phongBan);
                list.add(nhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }
}
