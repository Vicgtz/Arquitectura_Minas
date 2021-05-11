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
public class Carro5 extends Thread {
    JButton jButton;
    JPanel jPanel;

    public Carro5(JButton jButton, JPanel jPanel) {
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
            XMAX = xInit + 88;
            YMAX = (jPanel.getHeight() / 2) - 15;
            while (y > YMAX) {

                try {
                    Thread.sleep(1 * 20);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                jButton.setLocation(x, y);
                y--;

            }

            while (x < XMAX) {
                try {
                    Thread.sleep(1 * 20);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                jButton.setLocation(x, y);
                x++;
            }

            while (y < yInit) {

                try {
                    Thread.sleep(1 * 20);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                jButton.setLocation(x, y);
                y++;

            }
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            while (y > YMAX) {

                try {
                    Thread.sleep(1 * 15);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                if (y == YMAX + 35) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                jButton.setLocation(x, y);
                y--;

            }

            while (x > xInit) {
                try {
                    Thread.sleep(1 * 15);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                jButton.setLocation(x, y);
                x--;
            }

            while (y < yInit) {

                try {
                    Thread.sleep(1 * 16);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                jButton.setLocation(x, y);
                y++;

            }
            try {
                Thread.sleep(2050);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
