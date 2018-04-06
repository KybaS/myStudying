package docs.constructors;

public class Square {
    private int height, wight;
    private int x, y;

    public Square() {
        this(5, 5, 1, 1);
    }

    public Square(int height, int wight) {
        this(1, 1, height, wight);
    }

    public Square(int height, int wight, int x, int y) {
        this.height = height;
        this.wight = wight;
        this.x = x;
        this.y = y;
    }

    public int getAreaOfSquare(int height, int wight) {
        return height * wight;
    }
}
