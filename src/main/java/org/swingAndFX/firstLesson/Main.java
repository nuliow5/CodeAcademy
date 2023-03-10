package org.swingAndFX.firstLesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int myValue = 0;
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.blue);
        f.getContentPane().add(BorderLayout.SOUTH, bottomPanel);

        JLabel label = new JLabel("OLD");

        label.setBounds(130, 10, 100, 50);
        f.add(label);

        JButton b = new JButton("click");
        b.setBounds(130, 100, 100, 40);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setText(String.valueOf(myValue++));
            }
        });
        f.add(b);


        JButton secondB = new JButton("Change text");
        secondB.setBounds(40, 200, 300, 40);
        secondB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("New");
            }
        });
        f.add(secondB);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);


    }


}
