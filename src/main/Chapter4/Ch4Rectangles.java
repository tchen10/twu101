public class Ch4Rectangles {
    private int height;
    private int width;

    public Ch4Rectangles(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int area() {
        return height * width;
    }

    public int perimeter() {
        return (height * 2) + (width * 2);
    }
}