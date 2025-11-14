import javax.swing.*;


public class FrameExtend extends JFrame{
	FrameExtend(){
		setTitle("My Frame");

		setSize(500,600);
		
		setVisible(true);
		
		setLocation(100,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				
	}

	public static void main(String[] main){
		new FrameExtend();
	}
}

