package Lab1;

public class Ball {
    private String color;
    private int size;

    public Ball(String c, int s) {
        color = c;
        size = s;
    }
    public Ball() {
        color = "No color";
        size = 0;
    }
    public void setColor(String c) { this.color = c; }
    public void setSize(int s) { this.size = s; }
    public String getColor() { return color; }
    public int getSize() { return size; }
    public String toString() { return "Color: " + this.color+", size: "+this.size; }
}


