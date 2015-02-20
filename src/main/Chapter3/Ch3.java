// Create an array of 5 Rectangles (each with height and width instance variables and an area() method).
// Find the average area of the rectangles.

public class Ch3 {
    public static void main (String[] args) {
        Ch3Rectangles [] rectangles = new Ch3Rectangles[5];

        int x = 0;
        int totalArea = 0;

        while (x < 5) {
            int height = x + 1;
            int width = x + 2;
            rectangles[x] = new Ch3Rectangles(height, width);
            totalArea = totalArea + rectangles[x].area();
            x++;
        }

        int average = totalArea / 5;

        System.out.println("Average Area: " + average);

    }

}