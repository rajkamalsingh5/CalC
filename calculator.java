import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[6]; // +, -, *, /, =, C
    String[] functionNames = {"+", "-", "*", "/", "=", "C"};
    double num1, num2, result;
    char operator;

    public calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        textField = new JTextField();
        textField.setBounds(50, 40, 300, 50);
        textField.setEditable(false);
        frame.add(textField);

        // Creating number buttons (0-9)
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Creating function buttons (+, -, *, /, =, C)
        for (int i = 0; i < 6; i++) {
            functionButtons[i] = new JButton(functionNames[i]);
            functionButtons[i].addActionListener(this);
        }

        // Creating panel for buttons
        JPanel panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(functionButtons[3]); // "/"

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(functionButtons[2]); // "*"

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(functionButtons[1]); // "-"

        panel.add(functionButtons[5]); // "C"
        panel.add(numberButtons[0]);
        panel.add(functionButtons[4]); // "="
        panel.add(functionButtons[0]); // "+"

        frame.add(panel);
        frame.setVisible(true);
    }

    // can be done using evaluate function also but for simplicity using switch case 
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        for (int i = 0; i < 4; i++) {
            if (e.getSource() == functionButtons[i]) {
                num1 = Double.parseDouble(textField.getText());
                operator = functionNames[i].charAt(0);
                textField.setText("");
            }
        }

        if (e.getSource() == functionButtons[4]) { // "="

                try
                {
                    num2 = Double.parseDouble(textField.getText());
                } catch (NumberFormatException ex) {
                    textField.setText("Please write any number :) ");
                    return;
                }
                if (operator == '/' && num2 == 0) {
                    textField.setText("Error: Division by zero");
                    return;
                }
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == functionButtons[5]) { // "C"
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new calculator();
    }
}
