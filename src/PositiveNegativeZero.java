public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(30);
        checkNumber(-5);
        checkNumber(0);
    }
    public static void checkNumber(int numero) {
        if (numero > 0) {
            System.out.println("positive");
        } else if ( numero < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
