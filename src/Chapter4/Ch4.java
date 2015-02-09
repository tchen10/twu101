//Create a new version of the Chapter 3 exercise where you pass the height and width into the
// Rectangle constructor and initialize the instance variables there. Add a perimeter() method
// to Rectangle. Print the total area of all rectangles. Print the total perimeter of all rectangles.

class Ch4Rectangles {
    int height;
    int width;

    public Ch4Rectangles(int height, int width) {
        this.height = height;
        this.width = width;
        }

    int area() {
        return height * width;
    }

    int perimeter() {
        return (height * 2) + (width * 2);
    }
}

public class Ch4 {
    public static void main (String[] args) {
        Ch4Rectangles [] rectangles = new Ch4Rectangles[5];

        int x = 0;
        int totalArea = 0;
        int totalPerimeter = 0;

        while (x < 5) {
            int height = x + 1;
            int width = x + 2;
            rectangles[x] = new Ch4Rectangles(height, width);
            totalArea = totalArea + rectangles[x].area();
            totalPerimeter = totalPerimeter + rectangles[x].perimeter();
            x++;
        }

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);

    }

}