package Phones;

class Main {
    public static void main(String[] args)
    {
        Phone[] phones = {
                new Phone("25 456 345 44", "iPhone", 16.4),
                new Phone("18 234 435 33", "Nokia", 12.1),
                new Phone("89 676 344 11", "Samsung", 11)
        };

        for (Phone x : phones){
            System.out.println(x);
    }

        System.out.println();
        phones[0].receiveCall("Alex");
        System.out.println();
        phones[1].receiveCall("Olga", "34 567 876 44");
        System.out.println();
        phones[2].receiveCall("Vlad", "34 555 222 44");
        System.out.println();
        phones[2].sendMessage("34 566 567 55", "22 345 567 55");
        System.out.println();
    }
}