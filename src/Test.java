public class Test {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(1, 2);
        Vertex v2 = new Vertex(42, 37);
        Vertex v3 = new Vertex(1, 2);

        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));

        System.out.println(v1 + " " + v2 + " " + v3);
        System.out.println("length() " + v1.length());
        System.out.println("skalarMult() " + v1.skalarMult(5));
        v1.skalarMultMod(5);
        System.out.println("skalarMultMod() " + v1);
        System.out.println("add() " + v1.add(v2));
        v1.addMod(v2);
        System.out.println("addMod() " + v1);

        Vertex v4 = v3.normalized();
        System.out.println(v4);
        System.out.println(Math.sqrt(v4.x * v4.x + v4.y*v4.y));
    }
}