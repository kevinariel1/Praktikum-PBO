/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

import javax.swing.*;

/**
 *
 * @author Asus
 */
public class Verifikasi extends InputVerifier{

    @Override
    public boolean verify(JComponent input) {
        String txt = ((JTextField) input).getText();
        
        try{
            Integer.parseInt(txt);
        }catch(NumberFormatException e){
            return false;
        }
      return true;
    }
    
}