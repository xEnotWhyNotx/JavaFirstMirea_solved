package ru.mirea.task16.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class task2_1 extends JFrame {
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private final Font tFont = new Font("Times New Roman", Font.PLAIN, 12);
    private final Font sFont = new Font("“MS Sans Serif", Font.PLAIN, 12);
    private final Font cFont = new Font("Courier New", Font.PLAIN, 12);
    private String font;
    private String color;
    public task2_1(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(WIDTH, HEIGHT);
        this.setLayout(null);
        // Text
        JTextArea textArea = new JTextArea();
        textArea.setBounds(0, 200, WIDTH, 50);
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.GRAY);
        add(textArea);
        // MenuBar
        JMenuBar menuBar = new JMenuBar();
        // Menu 1
        JMenu fontMenu = new JMenu("Fonts");
        JMenuItem romanBtn = new JMenuItem("Times New Roman");
        romanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {textArea.setFont(tFont);}
        });
        JMenuItem sansBtn = new JMenuItem("“MS Sans Serif");
        sansBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(sFont);
            }
        });
        JMenuItem courierBtn = new JMenuItem("Courier New");
        courierBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(cFont);
            }
        });
        fontMenu.add(romanBtn);
        fontMenu.add(sansBtn);
        fontMenu.add(courierBtn);
        menuBar.add(fontMenu);
        // Menu 2
        JMenu colorMenu = new JMenu("Colours");
        JMenuItem blueBtn = new JMenuItem("Blue");
        blueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea.setForeground(Color.BLUE);
            }
        });
        JMenuItem blackBtn = new JMenuItem("Black");
        blackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });
        JMenuItem redBtn = new JMenuItem("Red");
        redBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        colorMenu.add(blueBtn);
        colorMenu.add(blackBtn);
        colorMenu.add(redBtn);
        menuBar.add(colorMenu);

        setJMenuBar(menuBar);
    }
    public void paint(Graphics g) {
        super.paint(g); // paint background
    }
}
