package org.swingAndFX.firstLesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressMain {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setBounds(100, 20, 200, 50);
        f.add(textField);


        JProgressBar progressBar = new JProgressBar();
        progressBar.setBounds(100, 100, 200, 50);
        progressBar.setForeground(Color.decode("#1DB00C"));
        f.add(progressBar);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                if (value <= 100 && value >= 0) {
                    progressBar.setValue(value);
                }

            }
        });


        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

    }
}
