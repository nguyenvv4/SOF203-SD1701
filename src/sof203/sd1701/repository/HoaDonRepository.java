/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.repository;

import java.util.ArrayList;
import sof203.sd1701.entity.HoaDon;

// bat buoc phai import java.sql.*;
import java.sql.*;

/**
 *
 * @author nguyenvv
 */
public class HoaDonRepository {

    DbConnection dbConnection;

    public ArrayList<HoaDon> getList() {
        // Tao cau sql
        String sql = "select * from HoaDon";
        ArrayList<HoaDon> list = new ArrayList<>();
        // ket noi co so du lieu va thuc thi truy van
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            // thuc thi truy van
            ResultSet rs = ps.executeQuery();
            // doc tung ban ghi vaf convert sang doi tuong hoa don
            while (rs.next()) {
                Integer id = rs.getInt("Id");
                String ten = rs.getString("Ten");
                Integer soLuong = rs.getInt("SoLuong");
                String loaiVe = rs.getString("LoaiVe");
                HoaDon hoaDon = new HoaDon(id, ten, soLuong, loaiVe);
                list.add(hoaDon);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<HoaDon> searchByName(String name) {
        // Tao cau sql
        String sql = "SELECT  * FROM HoaDon where Ten like '%" + name + "%'";
        System.out.println(sql);
        ArrayList<HoaDon> list = new ArrayList<>();
        // ket noi co so du lieu va thuc thi truy van
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
// name =Y
            String x = "Nguyen Thi" + name;

            // thuc thi truy van
            ResultSet rs = ps.executeQuery();
            // doc tung ban ghi vaf convert sang doi tuong hoa don
            while (rs.next()) {
                Integer id = rs.getInt("Id");
                String ten = rs.getString("Ten");
                Integer soLuong = rs.getInt("SoLuong");
                String loaiVe = rs.getString("LoaiVe");
                HoaDon hoaDon = new HoaDon(id, ten, soLuong, loaiVe);
                list.add(hoaDon);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<HoaDon> list = new HoaDonRepository().getList();
        for (HoaDon hoaDon : list) {
            System.out.println(hoaDon.toString());
        }
    }
}
