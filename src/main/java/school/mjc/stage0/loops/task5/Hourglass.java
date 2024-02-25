package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        for (int i = 0; i < height; i++) {
            System.out.print(" ");
        }
        System.out.println("8");

        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}