package ru.mirea.task16.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class task1_1 extends JFrame {
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private final String btnText = "Play";
    private int tries = 0;
    private int myNumber = new Random().nextInt(21);
    public task1_1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(WIDTH, HEIGHT);
        this.setLayout(null);

        JTextField textInput = new JTextField();
        textInput.setBounds(WIDTH / 2 - 50, HEIGHT / 2 - 35, 100, 25);
        textInput.setForeground(Color.BLACK);
        textInput.setBackground(Color.GRAY);
        add(textInput);

        JLabel title = new JLabel("GUESS THE NUMBER FROM 0 TO 20:");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setForeground(Color.BLACK);
        title.setBounds(0, 100, WIDTH, 40);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);
        add(title);

        JLabel info = new JLabel("-");
        info.setFont(new Font("Arial", Font.PLAIN, 20));
        info.setForeground(Color.BLACK);
        info.setBounds(0, 200, WIDTH, 40);
        info.setHorizontalAlignment(SwingConstants.CENTER);
        info.setVerticalAlignment(SwingConstants.CENTER);
        add(info);

        JButton button = new JButton(btnText);
        button.setBounds(WIDTH / 2 - 50, HEIGHT / 2, 100, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = textInput.getText();
                int number;
                if (!txt.isEmpty()) {
                    try {
                        number = Integer.parseInt(txt);
                        if (tries >= 3) {
                            info.setText("GAME OVER!");
                        }
                        else {
                            if (number == myNumber) {
                                info.setText("YOU WIN!");
                            } else if (number > myNumber) {
                                info.setText("YOUR NUMBER MUST BE LESS!");
                            } else {
                                info.setText("YOUR NUMBER MUST BE HIGHER!");
                            }
                            tries += 1;
                        }
                    } catch (NumberFormatException ex) {
                        info.setText("Your number must be int!");
                    }
                }
            }
        });
        add(button);
    }
    public void paint(Graphics g) {
        super.paint(g);
    }
}
