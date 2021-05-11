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
public class Carro6 extends Thread{

    JButton jButton;
    JPanel jPanel;

    public Carro6(JButton jButton, JPanel jPanel) {
        this.jButton = jButton;
        this.jPanel = jPanel;
    }

    public void run() {
        int x, y, xInit, yInit;
        xInit = jButton.getLocation().x;
        yInit = jButton.getLocation().y;

        x = xInit;
        y = yInit;

        final int YMAX, XMAX;
        XMAX = xInit + 56;
        YMAX = yInit - 105;

        while (true) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            while (x < XMAX) {

                try {
                    Thread.sleep(1 * 20);
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

            while (y > YMAX) {
                try {
                    Thread.sleep(1 * 24);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                jButton.setLocation(x, y);
                y--;
            }
            
            while (x > xInit) {

                try {
                    Thread.sleep(1 * 20);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                jButton.setLocation(x, y);
                x--;

            }

            try {
                Thread.sleep(7 * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            while (x < XMAX) {

                try {
                    Thread.sleep(1 * 20);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                
                if (x == 25) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                jButton.setLocation(x, y);
                x++;

            }
            
            while (y < yInit) {
                try {
                    Thread.sleep(1 * 24);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                jButton.setLocation(x, y);
                y++;
            }
            
            while (x > xInit) {

                try {
                    Thread.sleep(1 * 20);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                jButton.setLocation(x, y);
                x--;

            }
            
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
