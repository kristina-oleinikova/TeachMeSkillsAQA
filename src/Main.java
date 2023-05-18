import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        printRandomTrippleArray();
    }

    public static int getNumberFromConsole(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter digit number to increase each element in array: ");
        return input.nextInt();
    }

    public static int[][][] createTripleArray(){
        int [][][] array = new int [3][3][3];

        for(int l1 = 0; l1 < array.length; l1++){
            for(int l2 = 0; l2 < array[l1].length; l2++){
                for(int l3 = 0; l3 < array[l1][l2].length; l3++){
                    array[l1][l2][l3] = (int) (Math.random()*10) +1;
                }
            }
        }

        return array;
    }

    public static void printRandomTrippleArray(){
        int number = getNumberFromConsole();
        int [][][] array = createTripleArray();
        int [][][] finalTrippleArray = increaseEachNumberInArray(array, number);

        printTripleArrayInConsole(finalTrippleArray);
    }

    public static int[][][] increaseEachNumberInArray(int [][][] array, int number){

        for(int l1 = 0; l1 < array.length; l1++){
            for(int l2 = 0; l2 < array[l1].length; l2++){
                for(int l3 = 0; l3 < array[l1][l2].length; l3++){
                    array[l1][l2][l3] = array[l1][l2][l3] + number;
                }
            }
        }

        return array;
    }

    public static void printTripleArrayInConsole(int[][][] trippleArray){

        for(int i = 0; i < trippleArray.length; i++){
            for(int k = 0; k < trippleArray[i].length; k++){
                for(int j = 0; j < trippleArray[i][k].length; j++){
                    System.out.print(trippleArray[i][k][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}