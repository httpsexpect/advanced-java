import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumDemo {
        public static void main(String[] args) {
                JFrame frame = new JFrame();

                frame.setVisible(true);
                frame.setSize(400, 500);
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel lbl1 = new JLabel("Enter the first number: ");
                lbl1.setBounds(50, 20, 150, 30);
                frame.add(lbl1);
                JTextField textfield1 = new JTextField();
                textfield1.setBounds(200, 30, 100, 30);
                frame.add(textfield1);

                JLabel lbl2 = new JLabel("Enter the second number:");
                lbl2.setBounds(50, 80, 150, 30);
                frame.add(lbl2);

                JTextField textfield2 = new JTextField();
                textfield2.setBounds(200, 80, 100, 30);
                frame.add(textfield2);

                JButton button = new JButton("Add");
                button.setBounds(150, 130, 80, 30);s
                frame.add(button);

                JLabel resultLabel = new JLabel("Sum: ");
                resultLabel.setBounds(100, 180, 200, 30);
                frame.add(resultLabel);

                button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                int num1 = Integer.parseInt(textfield1.getText());
                                int num2 = Integer.parseInt(textfield2.getText());
                                int sum = num1 + num2;

                                resultLabel.setText("Sum: " + sum);
                        }
                });
        }
}