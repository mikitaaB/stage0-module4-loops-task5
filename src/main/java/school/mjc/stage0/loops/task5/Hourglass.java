package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i + j < height - 1 && i > j || i + j > height - 1 && i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
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