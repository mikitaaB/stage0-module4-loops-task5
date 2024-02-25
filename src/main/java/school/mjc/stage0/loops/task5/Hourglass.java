package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= height; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= height; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}