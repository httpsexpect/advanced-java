import javax.swing.*;

public class MainRectangle{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		
		RectangleComponent rc = new RectangleComponent();
		frame.add(rc);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}