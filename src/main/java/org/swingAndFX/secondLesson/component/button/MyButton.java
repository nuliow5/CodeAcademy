package org.swingAndFX.secondLesson.component.button;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton{
    public MyButton(String text, int x, int y) {
        super(text);
        this.setBackground(Color.red);
        this.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        this.setBounds(x, y, 100, 30);


    }
}
