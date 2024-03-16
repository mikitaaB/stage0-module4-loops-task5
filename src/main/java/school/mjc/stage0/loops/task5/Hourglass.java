package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int length) {
        for (int i = length; i > 0; i--) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        for (int i = 2; i <= length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}