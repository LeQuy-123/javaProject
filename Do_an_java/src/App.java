/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quy
 */
import do_an_java.ViewandController.DangNhapGUI;
public class App {
     public static void main(String[] args) {
             java.awt.EventQueue.invokeLater(() -> {
                 new DangNhapGUI().setVisible(true);
             });
    }
}
