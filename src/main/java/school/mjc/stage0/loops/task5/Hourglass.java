package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for ( int y=1; y<=height; y++) {
            for (int x = 1; x <= height; x++) {
                if ((x >= y && x <= height + 1 - y) || (x<=y && x>= height + 1 - y)) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
