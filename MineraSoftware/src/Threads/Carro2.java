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
 * @author Comunidad del anillo
 */
public class Carro2 extends Thread {

    JButton jButton;
    JPanel jPanel;

    public Carro2(JButton jButton, JPanel jPanel) {
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

            final int YMAX, XMAX;
            XMAX = 425;
            YMAX = jPanel.getHeight() - jButton.getHeight();
            while (x < XMAX) {

                try {
                    Thread.sleep(1 * 24);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                if (x == 25) {
                    try {
                        Thread.sleep(2250);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                jButton.setLocation(x, y);
                x++;

            }

            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            while (x > xInit) {
                try {
                    Thread.sleep(1 * 24);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                jButton.setLocation(x, y);
                x--;
            }

            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
