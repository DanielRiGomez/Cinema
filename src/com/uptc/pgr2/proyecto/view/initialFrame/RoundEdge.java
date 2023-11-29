package com.uptc.pgr2.proyecto.view.initialFrame;

import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.geom.*;

public class RoundEdge extends AbstractBorder {

    private final Color color;
    private final BasicStroke stroke;
    private final RenderingHints hints;

    public RoundEdge() {
        color = Color.BLACK;
        stroke = new BasicStroke(1);
        hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle2D = new Ellipse2D.Double();//java2d
            circle2D.setFrameFromCenter(
                    new Point(x + width / 2, y + height / 2),
                    new Point(width, height)
            );

        Polygon pointer = new Polygon();
        Area area = new Area(circle2D);
        area.add(new Area(pointer));
        g2.setRenderingHints(hints);

        Component parent = c.getParent();
        if (parent != null) {
            Color bg = parent.getBackground();
            Rectangle rect = new Rectangle(0, 0, width, height);
            Area borderRegion = new Area(rect);
            borderRegion.subtract(area);
            g2.setClip(borderRegion);
            g2.setColor(bg);
            g2.fillRect(0, 0, width, height);
            g2.setClip(null);
        }

        if (stroke.getLineWidth() > 0) {
            g2.setColor(color);
            g2.setStroke(stroke);
        }
        g2.draw(area);
    }
}
