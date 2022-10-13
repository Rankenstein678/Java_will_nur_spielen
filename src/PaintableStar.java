import java.awt.*;

public class PaintableStar extends GeometricObject implements Paintable {
    public int radInner, radOuter, zacken;

    public PaintableStar(Vertex pos, int radInner, int radOuter, int zacken, Color color) {
        super(pos, -1, -1, color);
        this.radInner = radInner;
        this.radOuter = radOuter;
        this.zacken = zacken;
    }

    public PaintableStar(double x, double y, int radInner, int radOuter, int zacken, Color color) {
        this(new Vertex(x, y), radInner, radOuter, zacken, color);
    }

    @Override
    public void paintTo(Graphics g) {
        int[] xpoly = new int[zacken * 2];
        int[] ypoly = new int[zacken * 2];
        double degrees = 360.0 / (zacken * 2);

        for (int i = 0; i < zacken * 2; i++) {
            double deg = Math.toRadians(degrees * i); //Das hat mich viel zu viel Zeit gekostet
            if (i % 2 == 0) {
                xpoly[i] = (int) Math.round(pos.x + Math.cos(deg) * radOuter);
                ypoly[i] = (int) Math.round(pos.y - Math.sin(deg) * radOuter);
            } else {
                xpoly[i] = (int) Math.round(pos.x + Math.cos(deg) * radInner);
                ypoly[i] = (int) Math.round(pos.y - Math.sin(deg) * radInner);
            }

        }
        g.setColor(color);
        Polygon p = new Polygon(xpoly, ypoly, xpoly.length);
        g.fillPolygon(p);
    }
}
