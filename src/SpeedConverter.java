public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long numLong = -1L;
        if (kilometersPerHour >= 0) {
            double milesPerHour = kilometersPerHour/1.609;
            numLong = Math.round(milesPerHour);
            System.out.println(milesPerHour);
            System.out.println(numLong);
        }
        return numLong;
    }
    public static void printConversion(double kilometersPerHour) {
        long numero = toMilesPerHour(kilometersPerHour);
        if (numero == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + numero + " mi/h");
        }

    }
}
