// Create a class that counts how many times you call the method increment() and prints out that number
// when you call total(). Create a main method that calls increment 5 times and then calls total.

class Chapter2Counter {

    int count = 0;

    void increment() {
        count += 1;
    }

    void total() {
        System.out.println(count);
    }

}

class Chapter2 {
    public static void main (String[] args) {

        Chapter2Counter counter = new Chapter2Counter();
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }

        counter.total();
    }
}