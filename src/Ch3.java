// Create an array of 5 Rectangles (each with height and width instance variables and an area() method).
// Find the average area of the rectangles.

class Ch3Rectangles {
    int height;
    int width;

    int area() {
        return height * width;
    }
}

class Ch3 {
    public static void main (String[] args) {
        Ch3Rectangles [] rectangles = new Ch3Rectangles[5];
        rectangles[0] = new Ch3Rectangles();
        rectangles[0].height = 1;
        rectangles[0].width = 2;
        rectangles[1] = new Ch3Rectangles();
        rectangles[1].height = 2;
        rectangles[1].width = 3;
        rectangles[2] = new Ch3Rectangles();
        rectangles[2].height = 3;
        rectangles[2].width = 4;
        rectangles[3] = new Ch3Rectangles();
        rectangles[3].height = 4;
        rectangles[3].width = 5;
        rectangles[4] = new Ch3Rectangles();
        rectangles[4].height = 5;
        rectangles[4].width = 6;

        int x = 0;
        int totalArea = 0;

        while (x < 5) {
            totalArea = totalArea + rectangles[x].area();
            x += 1;
        }

        int average = totalArea / 5;

        System.out.println(average);

    }

}