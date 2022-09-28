public class Test {
    public static void main(String[] args) {
        GeometricObject g1 = new GeometricObject(new Vertex(1,2),3,4);
        GeometricObject g2 = new GeometricObject(1,2,3,4);
        GeometricObject g3 = new GeometricObject(1);
        GeometricObject g4 = new GeometricObject();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
    }
}