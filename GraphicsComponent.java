import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class GraphicsComponent extends JComponent{
		public void paintComponent(Graphics g){
			Graphics2D graphics2D = (Graphics2D) g;
			double leftX = 100;
			double topY = 100;
			double width = 200;
			double height = 150;

			Rectangle2D rect = new Rectangle2D.Double(leftX,topY,width,height);
 			graphics2D.setColor(Color.RED);
			graphics2D.draw(rect);
	}
}