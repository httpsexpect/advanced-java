import javax.swing.*;

public class GraphicsMain{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400,500);

		GraphicsComponent component = new GraphicsComponent();
		
		frame.add(component);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}