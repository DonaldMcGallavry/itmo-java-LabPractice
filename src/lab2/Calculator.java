package lab2;

public class Calculator {
    public int Sum(int a, int b) {
       return a + b;
    }
    public double Sum(double a, double b) {
        return a + b;
    }
    public long Sum(long a, long b) {
        return a + b;
    }

    public int Div(int a, int b) {
    if (b == 0) {
        System.out.println("Деление на ноль");
    }
        return a/b;
    }
    public double Div(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на ноль");
        }
        return a/b;
    }
    public long Div(long a, long b) {
        if (b == 0) {
            System.out.println("Деление на ноль");
        }
        return a/b;
    }

    public int Multi (int a, int b){
        return a * b;
    }
    public double Multi (double a, double b){
        return a * b;
    }
    public long Multi (long a, long b){
        return a * b;
    }

    public int Minus (int a, int b){
        return a - b;
    }
    public double Minus (double a, double b){
        return a - b;
    }
    public long Minus (long a, long b){
        return a - b;
    }
}
