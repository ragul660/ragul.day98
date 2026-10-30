public class Main {
    private final double first;
    private final double second;

    public Main(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public void printResults() {
        System.out.println("Addition: " + (first + second));
        System.out.println("Division: " + (first / second));
        System.out.println("Multiplication: " + (first * second));
    }

    public static void main(String[] args) {
        Main calculator = new Main(10, 5);
        calculator.printResults();
    }
}

