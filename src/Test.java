import util.ShowInFrame;

public class Test {
    public static void main(String[] args) {

        //EXPERIMENTELL!!! NICHT ABGEBEN!!!
        //ShowInFrame.show("AAAAAAAAAAA", new PaintablePanel(new PaintableStar(100,100,12,50,10, Color.BLUE)));

        GeometricObject img = new GeometricImage("duck.png",0,0);
        System.out.println(img.width);
        System.out.println(img.height);
        ShowInFrame.show(new PaintablePanel((Paintable) img));
    }
}