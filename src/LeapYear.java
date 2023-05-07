public class LeapYear {
    public static void main(String[] args) {
        boolean imprimir = isLeapYear(2000);
        System.out.println(imprimir);
    }
    public static boolean isLeapYear(int year) {
        boolean isBissexto = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isBissexto = true;
                    }
                } else {
                    isBissexto = true;
                }
            }

        }
        return isBissexto;
    }
}
