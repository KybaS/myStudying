package docs.constructors;

public class Square {
    private int height, width;
    private int x, y;

    public Square() {
        this(5, 5, 1, 1);
    }

    public Square(int height, int width) {
        this(1, 1, height, width);
    }

    public Square(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public int getAreaOfSquare(int height, int width) {
        return height * width;
    }
}
