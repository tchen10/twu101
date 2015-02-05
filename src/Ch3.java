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

        int x = 0;
        int totalArea = 0;

        while (x < 5) {
            rectangles[x] = new Ch3Rectangles();
            rectangles[x].height = x + 1;
            rectangles[x].width = x + 2;
            totalArea = totalArea + rectangles[x].area();
            x += 1;
        }

        int average = totalArea / 5;

        System.out.println(average);

    }

}