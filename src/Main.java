import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        getSeasonUsingSwitch(7);
        getSeasonUsingIfElse(1);
        isOddOrEven(11);
        currentTemperature(-40);
        whatIsRainbow(15);
        oddNumbers();
        returnNumbers();
        numbersDivideBySeven();
        squareNumbers();
        returnFirstTenNumbers(0);
        getSumOfNumbers();
    }

    public static void getSeasonUsingSwitch(int numSeason){
        switch (numSeason){
            case 1:
            case 2:
            case 12:
                System.out.println("This is Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is Autumn");
                break;
            default:
                System.out.println("You have entered invalid value, no such season founded");
        }
        System.out.println('\n');
    }

    public static void getSeasonUsingIfElse(int numSeason){
        if(numSeason == 12 || numSeason == 1 || numSeason == 2){
            System.out.println("This is Winter");
        }
        else if(numSeason == 3 || numSeason == 4 || numSeason ==5){
            System.out.println("This is Spring");
        }
        else if(numSeason == 6 || numSeason == 7 || numSeason == 8){
            System.out.println("This is Summer");
        }
        else if(numSeason == 9 || numSeason == 10 || numSeason == 11){
            System.out.println("This is Autumn");
        }else{
            System.out.println("The season is not found");
        }
        System.out.println('\n');
    }

    public static void isOddOrEven(int number){
        if(number%2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        System.out.println('\n');
    }

    public static void currentTemperature(int temp){
        if(temp > -5){
            System.out.println("It's warm outside");
        }
        else if(temp <= -5 && temp > -20){
            System.out.println("It's normal outside");
        }
        else if (temp <= -20){
            System.out.println("It's cold outside");
        }else{
            System.out.println("Please, enter another value");
        }
        System.out.println('\n');
    }

    public static void whatIsRainbow(int color){
        if (color == 1){
            System.out.println("Rainbow is red");
        }else if (color == 2){
            System.out.println("Rainbow is orange");
        }else if (color == 3){
            System.out.println("Rainbow if yellow");
        }else if (color == 4){
            System.out.println("Rainbow is green");
        }else if (color == 5){
            System.out.println("Rainbow is light blue");
        }else if (color == 6){
            System.out.println("Rainbow is blue");
        }else if (color == 7){
            System.out.println("Rainbow is purple");
        }else{
            System.out.println("There is not a such Rainbow");
        }
        System.out.println('\n');
    }

    public static  void oddNumbers(){
        for (int number = 1; number <= 99; number++) {
            if (number%2!= 0) {
                System.out.println(number);
            }
        }
        System.out.println('\n');
    }

    public static void returnNumbers(){
        for (int num = 5; num >=1; num--){
            System.out.println(num);
        }
        System.out.println('\n');
    }

    public static void getSumOfNumbers(){
        Scanner enter = new Scanner(System.in);

        System.out.print("Enter positive integer number: ");
        int intNum = enter.nextInt();
        int sum = 0;

        for(int num = 1; num <= intNum; num++){
            sum+=num;
        }
            System.out.println(sum);
            System.out.println('\n');
    }


    public static void numbersDivideBySeven(){
        int number =7;
        do {
            System.out.print(number + " ");
            number += 7;
        }while (number <= 98);

        System.out.println('\n');
    }

    public static void returnFirstTenNumbers(int num){
        while (num >= -45){
            System.out.print(num + " ");
            num -= 5;
        }
        System.out.println('\n');
    }

    public static void squareNumbers(){
        for (int num = 10; num <=20; num++){
            System.out.print(num*num + " ");
        }
        System.out.println('\n');
    }
}