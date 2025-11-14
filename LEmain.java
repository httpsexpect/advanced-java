import javax.swing.*;
class LEmain{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);

		LEComponent comp = new LEComponent();	
		frame.add(comp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}