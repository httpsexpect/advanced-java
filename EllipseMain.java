import javax.swing.*;

public class EllipseMain{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		
		EclipseComponent ec = new EclipseComponent();
		frame.add(ec);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}