public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-2500);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int quociente = kiloBytes / 1024;
        int resto = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + quociente + " MB and " + resto + " KB");


    }
}
