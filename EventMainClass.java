import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonEventListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }
}

public class EventMainClass {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(200, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton();
        button.setBounds(60, 70, 100, 50);

        button.setText("Click Me");
        frame.add(button);
        button.addActionListener(new ButtonEventListener());
    }
}