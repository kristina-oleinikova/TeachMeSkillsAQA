import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        increaseEachNumberInArray();
    }

    public static void increaseEachNumberInArray(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter digit number to increase each element in array: ");
        int number = input.nextInt();

        int [][][] array = new int [][][]{
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9, 2}
                }
        };

        for(int l1 = 0; l1 < array.length; l1++){
            for(int l2 = 0; l2 < array[l1].length; l2++){
                for(int l3 = 0; l3 < array[l1][l2].length; l3++){
                    array[l3] = array[l3] + number;
                    System.out.println(array[l1][l2][l3]+ " ");
                }
            }
        }
    }
}