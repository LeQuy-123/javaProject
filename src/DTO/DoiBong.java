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
public class DoiBong {
    String maDoi;
    String tenDoi;
    String QuocGia;

    public DoiBong() {
    }

    public DoiBong(String maDoi, String tenDoi, String QuocGia) {
        this.maDoi = maDoi;
        this.tenDoi = tenDoi;
        this.QuocGia = QuocGia;
    }

    public String getMaDoi() {
        return maDoi;
    }

    public void setMaDoi(String maDoi) {
        this.maDoi = maDoi;
    }

    public String getTenDoi() {
        return tenDoi;
    }

    public void setTenDoi(String tenDoi) {
        this.tenDoi = tenDoi;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }
    
}
