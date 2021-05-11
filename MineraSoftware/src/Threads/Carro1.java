/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author R2
 */
public class Carro1 extends Thread {

    JButton jButton;
    JPanel jPanel;

    public Carro1(JButton jButton, JPanel jPanel) {
        this.jButton = jButton;
        this.jPanel = jPanel;
    }

    public void run() {
        int x, y, xInit, yInit;
        xInit = jButton.getLocation().x;
        yInit = jButton.getLocation().y;

        x = xInit;
        y = yInit;

        while (true) {
            final int YMAX;
            YMAX = jPanel.getHeight() - jButton.getHeight();;
            while (y < YMAX) {

                try {
                    Thread.sleep(1 * 20);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                jButton.setLocation(x, y);
                y++;

            }

            try {
                Thread.sleep(4 * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Carro1.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (y > yInit) {
                try {
                    Thread.sleep(1 * 20);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                jButton.setLocation(x, y);
                y--;
            }

            try {
                Thread.sleep(7 * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Carro1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
