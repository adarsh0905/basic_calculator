package com.adarsh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calculator implements ActionListener {
    double x = 0, y = 0, result = 0;
    int cal;
    JFrame f = new JFrame("CALCULATOR");
    JTextField jf = new JTextField();
    JLabel l = new JLabel();
    JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton equal = new JButton("=");
    JButton clear = new JButton("Clear");
    JButton dot = new JButton(".");
    JButton a = new JButton("+");
    JButton s = new JButton("-");
    JButton m = new JButton("*");
    JButton d = new JButton("/");
    calculator(){
        gui();
        addComp();
        addActionEvent();
    }
    public void gui(){
        f.setSize(350,350);
        f.setVisible(true);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    public void addComp(){

        l.setBounds(30,60,210,40);
        l.setBackground(Color.LIGHT_GRAY);
        l.setOpaque(true);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        f.add(l);

        jf.setBounds(30,30,210,30);
        jf.setBackground(Color.LIGHT_GRAY);
        jf.setHorizontalAlignment(SwingConstants.RIGHT);
        f.add(jf);

        b7.setBounds(30,100,70,40);
        b8.setBounds(100,100,70,40);
        b9.setBounds(170,100,70,40);
        b4.setBounds(30,140,70,40);
        b5.setBounds(100,140,70,40);
        b6.setBounds(170,140,70,40);
        b3.setBounds(30,180,70,40);
        b2.setBounds(100,180,70,40);
        b1.setBounds(170,180,70,40);
        b0.setBounds(100,220,70,40);
        clear.setBounds(240,30,70,70);
        equal.setBounds(170,220,70,40);
        dot.setBounds(30,220,70,40);
        a.setBounds(240,100,70,40);
        s.setBounds(240,140,70,40);
        m.setBounds(240,180,70,40);
        d.setBounds(240,220,70,40);

        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(clear);
        f.add(equal);
        f.add(a);
        f.add(s);
        f.add(m);
        f.add(d);
        f.add(dot);

        b0.setBackground(Color.YELLOW);
        b1.setBackground(Color.YELLOW);
        b2.setBackground(Color.YELLOW);
        b3.setBackground(Color.YELLOW);
        b4.setBackground(Color.YELLOW);
        b5.setBackground(Color.YELLOW);
        b6.setBackground(Color.YELLOW);
        b7.setBackground(Color.YELLOW);
        b8.setBackground(Color.YELLOW);
        b9.setBackground(Color.YELLOW);
        equal.setBackground(Color.YELLOW);
        clear.setBackground(Color.YELLOW);
        dot.setBackground(Color.YELLOW);
        a.setBackground(Color.YELLOW);
        s.setBackground(Color.YELLOW);
        m.setBackground(Color.YELLOW);
        d.setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
       calculator c = new calculator();
    }
    public void addActionEvent(){
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        a.addActionListener(this);
        s.addActionListener(this);
        d.addActionListener(this);
        m.addActionListener(this);
        dot.addActionListener(this);
        clear.addActionListener(this);
        equal.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == clear){
            l.setText("");
            jf.setText("");
        } else if (obj == b0) {
            if(jf.getText().equals("0")){
                return;
            }else {
                jf.setText(jf.getText()+"0");
            }
        } else if (obj == b1) {
            jf.setText(jf.getText()+"1");
        }else if (obj == b2) {
            jf.setText(jf.getText()+"2");
        }else if (obj == b3) {
            jf.setText(jf.getText()+"3");
        }else if (obj == b4) {
            jf.setText(jf.getText()+"4");
        }else if (obj == b5) {
            jf.setText(jf.getText()+"5");
        }else if (obj == b6) {
            jf.setText(jf.getText()+"6");
        }else if (obj == b7) {
            jf.setText(jf.getText()+"7");
        }else if (obj == b8) {
            jf.setText(jf.getText()+"8");
        }else if (obj == b9) {
            jf.setText(jf.getText()+"9");
        }else if (obj == dot) {
            if(jf.getText().contains(".")){
                return;
            }else {
                jf.setText(jf.getText()+".");
            }
        } else if (obj == a) {
            String string = jf.getText();
            x = Double.parseDouble(jf.getText());
            cal = 1;
            jf.setText("");
            l.setText(string + "+");
        }else if (obj == s) {
            String string = jf.getText();
            x = Double.parseDouble(jf.getText());
            cal = 2;
            jf.setText("");
            l.setText(string + "-");
        }else if (obj == m) {
            String string = jf.getText();
            x = Double.parseDouble(jf.getText());
            cal = 3;
            jf.setText("");
            l.setText(string + "*");
        }else if (obj == d) {
            String string = jf.getText();
            x = Double.parseDouble(jf.getText());
            cal = 4;
            jf.setText("");
            l.setText(string + "/");
        } else if (obj == equal) {
            y = Double.parseDouble(jf.getText());
            switch (cal) {
                case 1 -> result = x + y;
                case 2 -> result = x - y;
                case 3 -> result = x * y;
                case 4 -> result = x / y;
            }
            if(Double.toString(result).endsWith(".0")){
                jf.setText(Double.toString(result).replace(".0",""));
            }else {
                jf.setText(Double.toString(result));
            }
            l.setText("");
            x = result;
        }
    }
}
