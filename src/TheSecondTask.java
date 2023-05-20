
class TheSecondTask {
    public static void main(String[] args) {
        printChessBoarder();
    }

    public static void printChessBoarder() {
        String[][] array = new String[8][8];
        String whileColor = "W";
        String blackColor = "B";

        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if((i + y) %2 == 0){
                    array[i][y] = whileColor;
                } else{
                    array[i][y] = blackColor;
                }
                System.out.print(array[i][y] + " ");
            }
            System.out.println();
        }
    }
}
