public class Vertex {

    public double x, y;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public Vertex skalarMult(double s) {
        return new Vertex(x * s, y * s);
    }

    public void skalarMultMod(double s) {
        x *= s;
        y *= s;
    }

    public Vertex add(Vertex v2) {
        return new Vertex(x + v2.x, y + v2.y);
    }

    public void addMod(Vertex v2) {
        x += v2.x;
        y += v2.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
