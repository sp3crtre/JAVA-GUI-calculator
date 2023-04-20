import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    public static JTextField textField;
    public static JButton buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
    public static JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonEqual, buttonClear;
    public static JPanel panel;
    public static JLabel label;

    public static double num1, num2, result;
    public static String operator;

    public static void main(String[] args) {
        new Calculator();

    }

    public Calculator() {
        //Frame properties
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(300, 390);

        //Panel properties
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5));

        //textField properties
        textField = new JTextField();
        textField.setForeground(Color.WHITE);
        textField.setBorder(null);
        textField.setBackground(new Color(32, 32, 32));
        textField.setPreferredSize(new Dimension(300, 100));
        textField.setFont(new Font("Arial", Font.PLAIN, 32));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        
        buttonZero = new JButton("0");
        buttonZero.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonZero.setForeground(Color.WHITE);
        buttonZero.setBackground(new Color(59, 59, 59));
        buttonZero.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonZero.addActionListener(this);
        
        buttonOne = new JButton("1");
        buttonOne.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonOne.setForeground(Color.WHITE);
        buttonOne.setBackground(new Color(59, 59, 59));
        buttonOne.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonOne.addActionListener(this);

        buttonTwo = new JButton("2");
        buttonTwo.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonTwo.setForeground(Color.WHITE);
        buttonTwo.setBackground(new Color(59, 59, 59));
        buttonTwo.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonTwo.addActionListener(this);

        buttonThree = new JButton("3");
        buttonThree.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonThree.setForeground(Color.WHITE);
        buttonThree.setBackground(new Color(59, 59, 59));
        buttonThree.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonThree.addActionListener(this);

        buttonFour = new JButton("4");
        buttonFour.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonFour.setForeground(Color.WHITE);
        buttonFour.setBackground(new Color(59, 59, 59));
        buttonFour.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonFour.addActionListener(this);

        buttonFive = new JButton("5");
        buttonFive.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonFive.setForeground(Color.WHITE);
        buttonFive.setBackground(new Color(59, 59, 59));
        buttonFive.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonFive.addActionListener(this);
        
        buttonSix = new JButton("6");
        buttonSix.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonSix.setForeground(Color.WHITE);
        buttonSix.setBackground(new Color(59, 59, 59));
        buttonSix.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonSix.addActionListener(this);

        buttonSeven = new JButton("7");
        buttonSeven.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonSeven.setForeground(Color.WHITE);
        buttonSeven.setBackground(new Color(59, 59, 59));
        buttonSeven.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonSeven.addActionListener(this);

        buttonEight = new JButton("8");
        buttonEight.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonEight.setForeground(Color.WHITE);
        buttonEight.setBackground(new Color(59, 59, 59));
        buttonEight.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonEight.addActionListener(this);

        buttonNine = new JButton("9");
        buttonNine.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonNine.setForeground(Color.WHITE);
        buttonNine.setBackground(new Color(59, 59, 59));
        buttonNine.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonNine.addActionListener(this);
        
        buttonPlus = new JButton("+");
        buttonPlus.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonPlus.setForeground(Color.WHITE);
        buttonPlus.setBackground(new Color(59, 59, 59));
        buttonPlus.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonPlus.addActionListener(this);

        buttonMinus = new JButton("-");
        buttonMinus.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonMinus.setForeground(Color.WHITE);
        buttonMinus.setBackground(new Color(59, 59, 59));
        buttonMinus.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonMinus.addActionListener(this);

        buttonMultiply = new JButton("*");
        buttonMultiply.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonMultiply.setForeground(Color.WHITE);
        buttonMultiply.setBackground(new Color(59, 59, 59));
        buttonMultiply.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonMultiply.addActionListener(this);

        buttonDivide = new JButton("/");
        buttonDivide.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonDivide.setForeground(Color.WHITE);
        buttonDivide.setBackground(new Color(59, 59, 59));
        buttonDivide.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonDivide.addActionListener(this);

        buttonEqual = new JButton("=");
        buttonEqual.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonEqual.setForeground(Color.WHITE);
        buttonEqual.setBackground(new Color(116, 186, 235));
        buttonEqual.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonEqual.addActionListener(this);

        buttonClear = new JButton("C");
        buttonClear.setBorder(new LineBorder(new Color(32, 32, 32), 2));
        buttonClear.setForeground(Color.WHITE);
        buttonClear.setBackground(new Color(59, 59, 59));
        buttonClear.setFont(new Font("Arial", Font.PLAIN, 15));
        buttonClear.addActionListener(this);

        panel.add(buttonSeven);
        panel.add(buttonEight);
        panel.add(buttonNine);
        panel.add(buttonPlus);
        panel.add(buttonFour);
        panel.add(buttonFive);
        panel.add(buttonSix);
        panel.add(buttonMinus);
        panel.add(buttonOne);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        panel.add(buttonMultiply);
        panel.add(buttonClear);
        panel.add(buttonZero);
        panel.add(buttonEqual);
        panel.add(buttonDivide);

        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
        setLayout(null);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonZero) {
            textField.setText(textField.getText() + "0");

        } else if (e.getSource() == buttonOne) {
            textField.setText(textField.getText() + "1");

        } else if (e.getSource() == buttonTwo) {
            textField.setText(textField.getText() + "2");

        } else if (e.getSource() == buttonThree) {
            textField.setText(textField.getText() + "3");

        } else if (e.getSource() == buttonFour) {
            textField.setText(textField.getText() + "4");

        } else if (e.getSource() == buttonFive) {
            textField.setText(textField.getText() + "5");

        } else if (e.getSource() == buttonSix) {
            textField.setText(textField.getText() + "6");

        } else if (e.getSource() == buttonSeven) {
            textField.setText(textField.getText() + "7");

        } else if (e.getSource() == buttonEight) {
            textField.setText(textField.getText() + "8");

        } else if (e.getSource() == buttonNine) {
            textField.setText(textField.getText() + "9");

        } else if (e.getSource() == buttonPlus) {
            num1 = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");

        } else if (e.getSource() == buttonMinus) {
            num1 = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");

        } else if (e.getSource() == buttonMultiply) {
            num1 = Double.parseDouble(textField.getText());
            operator = "";
            textField.setText("");

        } else if (e.getSource() == buttonDivide) {
            num1 = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");

        } else if (e.getSource() == buttonEqual) {
            num2 = Double.parseDouble(textField.getText());

            if (operator.equals("+")) {
                result = num1 + num2;

            } else if (operator.equals("-")) {
                result = num1 - num2;

            } else if (operator.equals("")) {
                result = num1 * num2;

            } else if (operator.equals("/")) {
                result = num1 / num2;

            }

        textField.setText(Double.toString(result));

        } else if (e.getSource() == buttonClear) {
             textField.setText("");

        }
    }
    
}