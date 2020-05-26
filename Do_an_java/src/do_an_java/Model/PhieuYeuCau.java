/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an_java.Model;

/**
 *
 * @author Quy
 */
public class PhieuYeuCau {
    int id;
    String ten;
    String phongID;
    String yeuCau;

    public PhieuYeuCau(String ten, String phongID, String yeuCau) {
        this.ten = ten;
        this.phongID = phongID;
        this.yeuCau = yeuCau;
    }

    public PhieuYeuCau() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhongID() {
        return phongID;
    }

    public void setPhongID(String phongID) {
        this.phongID = phongID;
    }

    public String getYeuCau() {
        return yeuCau;
    }

    public void setYeuCau(String yeuCau) {
        this.yeuCau = yeuCau;
    }

    public boolean CheckEmpty(){
        return this.getTen().equals("")||this.getPhongID().equals("")||this.getYeuCau().equals("");
    }
}
