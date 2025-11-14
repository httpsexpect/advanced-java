import javax.swing.*;

public class SimpleFrame{
	SimpleFrame(){
		JFrame frame = new JFrame(); //creating frame object

		frame.setVisible(true); //make frame visible

		frame.setSize(250,250); //set size of frame (width,height)

		frame.setTitle("Sujal Awale"); //Setting frame title

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of application
	}


	public static void main(String[] args){
		new SimpleFrame();
	}
}