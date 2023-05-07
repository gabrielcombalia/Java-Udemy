public class BarkingDog {
    public static void main(String[] args) {
        boolean acordar = shouldWakeUp(true, 8);
        System.out.println(acordar);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean boleano = false;
        if (hourOfDay <= 23 && hourOfDay >= 0) {
            if (barking) {
                if (hourOfDay <= 22 && hourOfDay >= 8) {
                    boleano = false;
                } else {
                    boleano = true;
                }
            }
        }
        return boleano;

    }
}
