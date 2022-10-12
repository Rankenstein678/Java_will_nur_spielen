import util.ShowInFrame;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        /*GeometricObject g1 = new GeometricObject(new Vertex(1, 2), 3, 4);
        GeometricObject g2 = new GeometricObject(1, 2, 3, 4);
        GeometricObject g3 = new GeometricObject(1, 2);
        GeometricObject g4 = new GeometricObject(1);
        GeometricObject g5 = new GeometricObject();

        System.out.println(new SimpleTriangle(0, 0, 100).area());
        System.out.println(new SimpleTriangle(1, 0, 100));
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);
         */

        //ShowInFrame.show("AAAAAAAAAAA", new PaintablePanel(new PaintableOval(50,50,50,50, Color.magenta)));
        //EXPERIMENTAL!!! NICHT ABGEBEN!!!
        ShowInFrame.show("AAAAAAAAAAA", new PaintablePanel(new PaintableStar(100,100,12,50,10, Color.BLUE)));

    }
}