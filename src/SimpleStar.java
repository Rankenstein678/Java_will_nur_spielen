import java.awt.*;

public class SimpleStar extends GeometricObject{
    public int radInner, radOuter, zacken;

    public SimpleStar(Vertex pos, Color color, int radInner, int radOuter, int zacken) {
        super(pos, -1, -1, color);
        this.radInner = radInner;
        this.radOuter = radOuter;
        this.zacken = zacken;
    }

    public SimpleStar(Vertex pos, int radInner, int radOuter, int zacken) {
        this(pos,Color.black,radInner,radOuter,zacken);
    }


    public SimpleStar(double x, double y,Color color, int radInner, int radOuter, int zacken) {
        this(new Vertex(x,y),color,radInner,radOuter,zacken);
    }

    public SimpleStar(double x, double y, int radInner, int radOuter, int zacken) {
        this(x,y,Color.black,radInner,radOuter,zacken);
    }


}
