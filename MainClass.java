import javax.swing.*;

public class MainClass{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		frame.setSize(400,500);

		MyComponent component = new MyComponent();

		frame.add(component);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}