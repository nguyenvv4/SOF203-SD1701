/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.repository;

import java.sql.*;
import sof203.sd1701.entity.Users;

/**
 *
 * @author nguyenvv
 */
public class LoginRepository {

    DbConnection dbConnection;

    public Boolean checklogin(String username, String password) {
        String sql = "select * from Users WHERE username = ? AND password  = ?";
        Users user = null;
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, username);
            ps.setObject(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String us = rs.getString("username");
                String pass = rs.getString("password");
                String role = rs.getString("roles");
                user = new Users(username, password, role);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user == null) {
            return false;
        } else {
            return true;
        }

    }
}
