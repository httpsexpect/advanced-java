import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

class ButtonEventListener2 implements ActionListener {
    private JLabel label;

    public ButtonEventListener2(JLabel label) {
        this.label = label;
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked");
    }
}

public class EventMainClass2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Press the button");
        label.setBounds(60, 30, 150, 30);
        frame.add(label);

        // JButton
        JButton button = new JButton();
        button.setBounds(60, 70, 100, 50);
        button.setText("Click me");
        frame.add(button);

        button.addActionListener(new ButtonEventListener2(label));
    }
}
