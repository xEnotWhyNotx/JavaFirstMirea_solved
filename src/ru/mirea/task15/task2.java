package ru.mirea.task15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class task2 {
    public static void main(String[] args) {
        new Menu();
    }
}

class Menu extends JFrame implements ItemListener {
    JLabel label = new JLabel("Hi");
    JComboBox comboBox;
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    Menu() {
        super("Menu");
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(label);

        String[] countries = { "Australia", "China", "England", "Russia"};
        comboBox = new JComboBox(countries);
        comboBox.addItemListener(this);
        add(comboBox);

        if (comboBox.getSelectedItem() == "Australia") {
            label.setText("Aus");
        } else {
            label.setText("other");
        }

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboBox) {
            label.setText("Hi " + comboBox.getSelectedItem());
        }
    }
}
