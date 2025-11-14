import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class EclipseMain extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D gd = (Graphics2D) g;
		double leftX = 100;
		double topY = 100;
		double width = 400;
		double height = 200;

		Line2D line = new Line2D.Double(leftX,topY, leftX + width , topY + height);
		gd.draw(line);

		Ellipse2D ellipse = new Ellipse2D.Double(leftX,topY,width,height);
		
		gd.draw(ellipse);

	}
}
