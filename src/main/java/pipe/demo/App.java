package pipe.demo;

public class App {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        App app = new App();
        System.out.println("=== Simple Calculator ===");
        System.out.println("10 + 5 = " + app.add(10, 5));
        System.out.println("20 + 30 = " + app.add(20, 30));
    }
}