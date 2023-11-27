/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd1701.service;

import sof203.sd1701.repository.LoginRepository;

/**
 *
 * @author nguyenvv
 */
public class LoginService {

    LoginRepository loginRepository = new LoginRepository();

    public Boolean login(String username, String password) {
        // truyen thong tin sang repo
        return loginRepository.checklogin(username, password);

    }
}
