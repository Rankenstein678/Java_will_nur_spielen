import util.ShowInFrame;

import java.awt.*;

public class Test {
    public static void main(String[] args) {

        ShowInFrame.show(new PaintablePanel(new PaintableStar(100,100,25,100,12, Color.BLUE)));

//        GeometricObject img = new GeometricImage("duck.png",0,0);
//        System.out.println(img.width);
//        System.out.println(img.height);
//        ShowInFrame.show(new PaintablePanel((Paintable) img));
    }
}