/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Quy
 */
public class GiaiDau {
    String maG;
    String tenGiai;
    String ngayBD;
    String ngayKT;

    public GiaiDau() {
    }

    public GiaiDau(String maG, String tenGiai, String ngayBD, String ngayKT) {
        this.maG = maG;
        this.tenGiai = tenGiai;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public String getMaG() {
        return maG;
    }

    public void setMaG(String maG) {
        this.maG = maG;
    }

    public String getTenGiai() {
        return tenGiai;
    }

    public void setTenGiai(String tenGiai) {
        this.tenGiai = tenGiai;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }
    
}
