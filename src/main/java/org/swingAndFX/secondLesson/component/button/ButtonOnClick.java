package org.swingAndFX.secondLesson.component.button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonOnClick implements ActionListener {
    private JLabel label;

    public ButtonOnClick(JLabel label) {
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("after click");
    }
}
