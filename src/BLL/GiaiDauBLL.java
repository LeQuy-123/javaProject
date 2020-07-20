/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.DataBase;
import static DAL.DataBase.conectionJDBC;
import DTO.DoiBong;
import DAL.GiaiDauDAL;
import DTO.GiaiDau;
import DTO.TranDau;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Quy
 */
public class GiaiDauBLL {
     GiaiDauDAL gdDAL = new GiaiDauDAL();
     public boolean ThemGiai (GiaiDau db){
         return gdDAL.ThemGiai(db);
     };
     public boolean ThemTran (TranDau td){
         return gdDAL.ThemTran(td);
     };
      public ArrayList<GiaiDau> getAllGiaiDau(){
        ArrayList<GiaiDau> listGD = gdDAL.getAllGiaiDau();
        return listGD;
    }
      public void CT_GD (String maGD,ArrayList<String> maDoi){
         for(int i = 0; i < maDoi.size(); i++){
             gdDAL.CT_GD(maGD, maDoi.get(i));
          }
     }
      public ArrayList<String>  getAllDoiTrongGiai(String MaG){
        ArrayList<String> listDB = gdDAL.getAllDoiTrongGiai(MaG);
        return  listDB;
    }
}
