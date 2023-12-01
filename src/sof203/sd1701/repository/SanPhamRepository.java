/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.repository;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import sof203.sd1701.entity.SanPham;
import java.sql.*;

/**
 *
 * @author nguyenvv
 */
public class SanPhamRepository {

    DbConnection dbConnection;

    public ArrayList<SanPham> getList() {
        String sql = "select * from sanpham Order by so_luong_ton DESC";
        ArrayList<SanPham> listSp = new ArrayList<>();
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String tenSp = rs.getString("ten_san_pham");
                Integer soLuongTon = rs.getInt("so_luong_ton");
                String danhMuc = rs.getString("danh_muc");
                String trangThai = rs.getString("trang_thai");
                SanPham sp = new SanPham(id, tenSp, danhMuc, soLuongTon, trangThai);
                listSp.add(sp);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSp;

    }

    public Boolean addNew(SanPham sanPham) {
        String sql = "insert into sanpham(id,ten_san_pham,so_luong_ton,danh_muc,trang_thai)\n"
                + "values (?,?,?,?,?)";
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, sanPham.getId());
            ps.setObject(2, sanPham.getTenSanPham());
            ps.setObject(3, sanPham.getSoLuongTon());
            ps.setObject(4, sanPham.getDanhMuc());
            ps.setObject(5, sanPham.getTrangThai());
            // thuc thi truy van
            int kq = ps.executeUpdate();
            if (kq > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(Integer id) {
        String sql = "delete FROM sanpham WHERE id = " + id;
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            int kq = ps.executeUpdate();
            if (kq > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(SanPham sanPham) {
        String sql = "update sanpham set "
                + "ten_san_pham  =?, "
                + "so_luong_ton =?, "
                + "danh_muc =?, "
                + "trang_thai =? "
                + "where id = ?";
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(5, sanPham.getId());
            ps.setObject(1, sanPham.getTenSanPham());
            ps.setObject(2, sanPham.getSoLuongTon());
            ps.setObject(3, sanPham.getDanhMuc());
            ps.setObject(4, sanPham.getTrangThai());
            // thuc thi truy van
            int kq = ps.executeUpdate();
            if (kq > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
