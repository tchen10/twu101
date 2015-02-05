// Create a class that counts how many times you call the method increment() and prints out that number
// when you call total(). Create a main method that calls increment 5 times and then calls total.

class Ch2Counter {

    int count = 0;

    void increment() {
        count += 1;
    }

    void total() {
        System.out.println(count);
    }

}

class Ch2 {
    public static void main (String[] args) {

        Ch2Counter counter = new Ch2Counter();
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }

        counter.total();
    }
}