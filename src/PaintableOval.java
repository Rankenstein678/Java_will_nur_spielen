import java.awt.*;

public class PaintableOval extends SimpleOval implements Paintable{


    public PaintableOval(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public void paintTo(Graphics g) {
        g.fillOval((int) pos.x, (int) pos.y, (int) width, (int) height);
    }
}
