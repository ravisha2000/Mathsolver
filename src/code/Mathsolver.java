/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code;


import gui.*;
import static code.DBconnect.connect;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ravisha Singhabahu
 */
public class Mathsolver {
    
    /*
      @param args main
     */
    public static void main(String[] args) {
        try {
            connect();
            System.out.println("Let's Begin");
            
            login r = new login();
            r.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mathsolver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
             
    }



    /**
     * @param args the command line arguments
     */
