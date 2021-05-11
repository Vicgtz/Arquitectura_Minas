/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author R2
 */
public class Carro3 extends Thread{
    
    JButton jButton;
    JPanel jPanel;

    public Carro3(JButton jButton, JPanel jPanel) {
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
            XMAX = 0;
            YMAX = jPanel.getHeight() - jButton.getHeight();
            while (x > XMAX) {

                try {
                    Thread.sleep(1 * 19);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                jButton.setLocation(x, y);
                x--;

            }

            try {
                Thread.sleep(4 * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            while (x < xInit) {
                try {
                    Thread.sleep(1 * 19);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                jButton.setLocation(x, y);
                x++;
            }

            try {
                Thread.sleep(7 * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
