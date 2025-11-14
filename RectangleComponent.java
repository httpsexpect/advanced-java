import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D gd = (Graphics2D) g;
		double leftX = 100;
		double topY = 100;
		double width = 400;
		double height = 200;
			
		Rectangle2D rect = new Rectangle2D.Double(leftX,topY,width,height);

		gd.draw(rect);

	}
}