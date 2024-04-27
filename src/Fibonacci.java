public class Fibonacci {
    double a = 0;
    double b = 1;

    public static void main(String[] args) throws Exception {
        long tempo_inicio = System.nanoTime();

        Fibonacci fibonacci = new Fibonacci();
        double x = fibonacci.calcular_fib(12);

        System.out.println("Fibonacci: " + x);
        System.out.println("Tempo de execução(secs): " + fibonacci.conversaoSegundos(System.nanoTime() - tempo_inicio));
        System.out.println("Tempo de execução(nanosecs): " + (System.nanoTime() - tempo_inicio));
    }

    public double calcular_fib(int n) {
        for (int i = 0; i < n; i++) {
            double aux = a;
            a = b;
            b = aux + b;
        }
        return a;
    }

    public double conversaoSegundos(long nanosegundos) {
        return nanosegundos / 1_000_000_000.0;
    }
}