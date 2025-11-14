import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MultipleFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		JLabel label = new JLabel("Press the button");
		label.setBounds(60,30,150,30);
		frame.add(label);
	
		JButton button =  new JButton("Click me");
		button.setBounds(60,70,100,50);
		frame.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame f = new JFrame("Naya Frame");
				f.setSize(200,300);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setLayout(null);
				f.setVisible(true);

				JLabel msg = new JLabel("Button CLicked");
				msg.setBounds(50,30,100,30);
				f.add(msg);
			}
		});
		frame.setVisible(true);
	}
}