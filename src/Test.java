public class Test {
    public static void main(String[] args) {
        GeometricObject g1 = new GeometricObject(new Vertex(1, 2), 3, 4);
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
    }
}