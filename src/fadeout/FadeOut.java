/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadeout;

import javax.swing.JFrame;

/**
 *
 * @author pau
 */
public class FadeOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ventana v = new Ventana();
       
       v.setSize(1000, 1000);
       v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       v.setVisible(true);
       v.doFadeOut();
    }
    
}
