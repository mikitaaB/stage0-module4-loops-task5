package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int length) {
        int height = (length + 1) / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (j == 0 || j == length - 1 || i == height - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                if (j == 0 || j == length - 1 || i == 0) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}