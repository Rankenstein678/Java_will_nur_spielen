import util.ShowInFrame;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Paintable> pas = new ArrayList<>();
        pas.add(new PaintableOval(100,50,30,50));
        pas.add(new PaintableStar(200,200,10,50,8));

        ShowInFrame.show(new PaintablesPanel(pas));
    }
}