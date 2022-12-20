package ru.mirea.task16.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class task1_2 extends JFrame {
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    public task1_2(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(WIDTH, HEIGHT);
        this.setLayout(new BorderLayout());

        JLabel northLabel = new JLabel("NORTH");
        northLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        northLabel.setForeground(Color.BLACK);
        northLabel.setBounds(0, 100, WIDTH, 40);
        northLabel.setHorizontalAlignment(SwingConstants.CENTER);
        northLabel.setVerticalAlignment(SwingConstants.CENTER);
        northLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на САО!");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(northLabel , BorderLayout.NORTH);

        JLabel southLabel = new JLabel("SOUTH");
        southLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        southLabel.setForeground(Color.BLACK);
        southLabel.setBounds(0, 100, WIDTH, 40);
        southLabel.setHorizontalAlignment(SwingConstants.CENTER);
        southLabel.setVerticalAlignment(SwingConstants.CENTER);
        southLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на ЮАО!");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(southLabel , BorderLayout.SOUTH);
        // Label 3
        JLabel eastLabel = new JLabel("EAST");
        eastLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        eastLabel.setForeground(Color.BLACK);
        eastLabel.setBounds(0, 100, WIDTH, 40);
        eastLabel.setHorizontalAlignment(SwingConstants.CENTER);
        eastLabel.setVerticalAlignment(SwingConstants.CENTER);
        eastLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на ВАО!");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(eastLabel , BorderLayout.EAST);
        // Label 4
        JLabel westLabel = new JLabel("WEST");
        westLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        westLabel.setForeground(Color.BLACK);
        westLabel.setBounds(0, 100, WIDTH, 40);
        westLabel.setHorizontalAlignment(SwingConstants.CENTER);
        westLabel.setVerticalAlignment(SwingConstants.CENTER);
        westLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на ЗАО!");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(westLabel , BorderLayout.WEST);
        // Label 5
        JLabel centerLabel = new JLabel("CENTER");
        centerLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        centerLabel.setForeground(Color.BLACK);
        centerLabel.setBounds(0, 100, WIDTH, 40);
        centerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerLabel.setVerticalAlignment(SwingConstants.CENTER);
        centerLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО!");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(centerLabel , BorderLayout.CENTER);
    }
    public void paint(Graphics g) {
        super.paint(g);
    }
}
