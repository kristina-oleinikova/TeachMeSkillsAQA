import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main (String[] args) {

//        arrayContainsNumber();
//        createArray();
        createNewArray();
    }


    public static void arrayContainsNumber(){
        int[] num = new int []{1, 2, 3, 8, 15, 25, 99};

        Scanner enter = new Scanner (System.in);
        System.out.print("Enter digit number: ");
        int number = enter.nextInt();

        for(int index = 0; index < num.length; index++){
            if (number == num[index]) {
                System.out.println("Entered number is in Array");
                return;
                }
        }
        System.out.println("There is not such number in Array");
    }


    public static void createArray() {
        int[] arr = new int[]{1,2,3,4,5};
        int num = 0;

        Scanner enter = new Scanner(System.in);
        System.out.print("Please, enter any digit number: ");
        int number = enter.nextInt();

        for(int i = 0; i< arr.length; i++){
            if(number != arr[i]){
                num++;
            }
        }

        int[] copyArr = new int[num];

        int offset = 0;
        boolean isNumberInArray = false;

        for(int i = 0; i < arr.length; i++){
            if(number == arr[i]){
                offset++;
                isNumberInArray = true;
            }else{
                copyArr[i-offset] = arr[i];
            }
        }

        for(int i = 0; i< copyArr.length; i++){
            System.out.print(copyArr[i] + " ");
        }
            System.out.println();

        if (isNumberInArray == true){
            System.out.print("Congrats! The entered number is in Array!");
        } else{
            System.out.print("There is no such number in Array");
        }
    }

    public static void createNewArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter length of new Array: ");
        int lengthOfArray = input.nextInt();
        double [] newArray = new double[lengthOfArray];

        System.out.println(newArray.length);

        for(int i = 0; i < lengthOfArray; i++){
            newArray[i] = Math.random();
            System.out.print(newArray[i]+ " ");
        }

        System.out.println();


        double maxNumber = newArray[0];
        double minNumber = newArray [0];
        double sumOfNumbers = 0;
        double averageNumber = 0;

        for (int i = 0; i<newArray.length; i++){
            if(newArray[i] < minNumber){
                minNumber = newArray[i];
            }
            if(newArray[i] > maxNumber){
                maxNumber = newArray[i];
            }
            sumOfNumbers += newArray[i];
        }

        averageNumber = sumOfNumbers / lengthOfArray;

        System.out.println(maxNumber + " is the biggest number in Array");
        System.out.println(minNumber + " is the smallest number in Array");
        System.out.println(averageNumber + " is the average of numbers from Array");
    }
}