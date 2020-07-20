/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.DoiBong;
import DAL.DoiBongDAL;
import DTO.GiaiDau;
import java.util.ArrayList;
/**
 *
 * @author Quy
 */
public class DoiBongBLL {
     DoiBongDAL dbDAL = new DoiBongDAL();
     public boolean ThemDOi(DoiBong db){
         if(dbDAL.ThemDOi(db))
             return true;
         return false;
     };
      public ArrayList<DoiBong> getAllDoi(){
        ArrayList<DoiBong> listDB = dbDAL.getAllDoiBong();
        return listDB;
    }
}
