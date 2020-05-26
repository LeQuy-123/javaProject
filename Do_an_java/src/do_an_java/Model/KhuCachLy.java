package do_an_java.Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quy
 */
public class KhuCachLy {
    int id;
    String tenKhu;

   
    int sucChua;
    String quanLy;
    String sdt;
    String trangThai;

    public KhuCachLy() {
    }

    public KhuCachLy(String tenKhu, int sucChua, String quanLy, String sdt, String trangThai) {
        this.tenKhu = tenKhu;
        this.sucChua = sucChua;
        this.quanLy = quanLy;
        this.sdt = sdt;
        this.trangThai = trangThai;
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTenKhu() {
        return tenKhu;
    }

    public void setTenKhu(String tenKhu) {
        this.tenKhu = tenKhu;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public String getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(String quanLy) {
        this.quanLy = quanLy;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public boolean checkEmpty (){
        return this.getTenKhu().equals("")||this.getQuanLy().equals("")||this.getSdt().equals("");
    }
      
}
