import java.util.Arrays;

class TheSecondTask {
    public static void main(String[] args) {
        printChessBoarder();
    }

    public static void printChessBoarder() {
        String[][] array = new String[8][8];
        String cellColor = "W";

        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                array[i][y] = cellColor;
                System.out.print(array[i][y] + " ");
            }
            System.out.println();
        }
    }
}
