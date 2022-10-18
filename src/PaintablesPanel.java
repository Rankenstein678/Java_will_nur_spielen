import java.awt.*;
import java.util.List;

public class PaintablesPanel extends SizedPanel {
    List<Paintable> pas;

    public PaintablesPanel(List<Paintable> pas) {
        this.pas = pas;
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Paintable pa : pas) {
            pa.paintTo(g);
        }
    }
}