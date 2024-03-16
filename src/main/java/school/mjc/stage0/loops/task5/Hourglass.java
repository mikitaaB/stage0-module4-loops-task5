package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int n) {
        int half = n / 2;
        for (int i = half; i >= 0; i--) {
            int base = n % 2 == 0 ? (2 * i) : (2 * i + 1);
            for (int j = half; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < base; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        for (int i = 1; i <= half; i++) {
            int base = n % 2 == 0 ? (2 * i) : (2 * i + 1);
            for (int j = half; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < base; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hourglassPrinter = new Hourglass();
        hourglassPrinter.printHourglassOfGivenSize(6);
        hourglassPrinter.printHourglassOfGivenSize(3);
        hourglassPrinter.printHourglassOfGivenSize(5);
    }
}