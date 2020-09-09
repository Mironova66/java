package Lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("blue", 6);
        Ball b2 = new Ball("red", 4);
        b2.setColor("pink");
        System.out.println(b1);
        System.out.println(b2);
    }
}
