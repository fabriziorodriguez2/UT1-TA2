public class FactorialCalculator {
    public static int factorial(int num) {
        if (num < 0) {
            System.out.println("No se puede");
            return -1;}
        int num2 = 1;
        if (num == 1 || num == 0) {
            return 1; }
        for (int i = num; i >= 2; --i) {
            num2 *= i;}
        return num2;}
    public static void main(String[] args) {
        int resultado = factorial(6);
        System.out.println("El factorial es igual a "+ resultado);
    }
}