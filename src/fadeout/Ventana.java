/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadeout;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pau
 */
public class Ventana extends JFrame {

    private JPanel mainPanel;
    private Lienzo l;

    public Ventana() {
        this.l = new Lienzo(this);

        this.mostrarVentana();

    }
    
    public Ventana getVentana() {
        return this;
    }

    public void doFadeOut() {
        this.l.setImg("img/fondo5.jpeg");
        this.l.doFadeOut("img/fondo4.jpeg");
    }

    public void mostrarVentana() {

        this.mainPanel = new JPanel();
        this.addLienzo();

        Container cp = this.getContentPane();
        cp.add(this.mainPanel);
    }

    public void addLienzo() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 0;

        this.l.setSize(700, 700);
        //this.l.setImg("img/fondo5.jpeg");

        this.mainPanel.add(l, c);
    }

    

}
