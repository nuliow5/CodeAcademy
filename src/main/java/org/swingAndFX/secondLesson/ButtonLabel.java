package org.swingAndFX.secondLesson;

import org.swingAndFX.secondLesson.component.button.ButtonOnClick;
import org.swingAndFX.secondLesson.component.button.MyButton;

import javax.swing.*;

public class ButtonLabel extends JFrame {
    public static void main(String[] args) {
        //(super) -> JFrame
        //this - > ButtonLabel
        new ButtonLabel();

    }
    public ButtonLabel(){
        JPanel pnlManin = new JPanel();
        pnlManin.setLayout(null);

        MyButton myButtonShowText = new MyButton("Click me", 130, 100);
        pnlManin.add(myButtonShowText);
//        pnlManin.add(new MyButton("Click me", 130, 150));


        JLabel label = new JLabel("test");
        label.setBounds(130, 40, 100, 30);
        pnlManin.add(label);

        myButtonShowText.addActionListener(new ButtonOnClick(label));

        this.add(pnlManin);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);

    }



}
