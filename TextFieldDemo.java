import java.awt.*;
import javax.swing.*;

public class TextFieldDemo{
	public static void main(String[] args){
		JFrame f = new JFrame("TextField Demo");
		f.setSize(300,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setLayout(new FlowLayout());

		f.add(new JLabel("Name: "));
		f.add(new JTextField(10));

		f.add(new JLabel("Password: "));
		JPasswordField pf = new JPasswordField(10);
		f.add(pf);

		JTextArea textArea = new JTextArea(5,20);
		f.add(textArea);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		f.add(scrollPane);
		

		JCheckBox cb1 = new JCheckBox("Engineering");
		JCheckBox cb2 = new JCheckBox("BCA");
		JCheckBox cb3 = new JCheckBox("CSIT");
		
		f.add(cb1);
        	f.add(cb2);
        	f.add(cb3);

		JButton b1 = new JButton("Show Selected");
		JLabel lb1 = new JLabel("Selected: None");
		
		f.add(b1);
        	f.add(lb1);
		
		b1.addActionListener(e->{
			StringBuilder selectedOptions = new StringBuilder("Selected: ");
			if(cb1.isSelected()) selectedOptions.append("Engineering");
			if(cb2.isSelected()) selectedOptions.append("BCA");
			if(cb3.isSelected()) selectedOptions.append("CSIT");

			lb1.setText(selectedOptions.toString().trim());
		});

		f.setVisible(true);
	}
}