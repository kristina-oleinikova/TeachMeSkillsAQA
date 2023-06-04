package Phones;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    @Override
    public String toString() {
        return this.number + " " + this.model+ " " + this.weight + " ";
    }

    public void receiveCall(String name){
        System.out.println(name + " is calling...");
    }

    public void receiveCall(String name, String number){
        System.out.println("Phone number: " + number + " " + name + " is calling...");
    }

    public void getNumber(){
       System.out.println("The number is: " + this.number);
    }

    public void sendMessage(String...number){
        for(String x : number){
            System.out.println(x);
        }
    }
}
