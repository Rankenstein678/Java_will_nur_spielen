import javax.swing.*;
import java.awt.*;

public class GeometricImage extends GeometricObject implements Paintable {
    ImageIcon img;

    public GeometricImage(String fileName, double x, double y) {
        super(new Vertex(x, y));
        img = new ImageIcon(getClass().getClassLoader().getResource(fileName));
        init();
    }
    public GeometricImage(ImageIcon icon, double x, double y) {
        super(new Vertex(x,y));
        img = icon;
        init();
    }

    void init() {
        width = img.getImage().getWidth(img.getImageObserver());
        height = img.getImage().getHeight(img.getImageObserver());
    }

    @Override
    public void paintTo(Graphics g) {
        img.paintIcon(null,g,(int) pos.x,(int) pos.y);
    }
}
