import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

class LEComponent extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 300;			

		Line2D line  = new Line2D.Double(leftX,topY , leftX + width , topY + height);
		g2.setColor(Color.RED);
		g2.drawString("Warning!",100,100);
		g2.draw(line);
		
		Ellipse2D ellipse = new Ellipse2D.Double(leftX , topY , width, height);
 		g2.setColor(Color.BLUE);
		g2.fill(ellipse);
		g2.draw(ellipse);
	}
}