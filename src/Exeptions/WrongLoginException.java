package Exeptions;

public class WrongLoginException extends Exception{
    public WrongLoginException(){
        super("Login should be less than 20 symbols & doesn't contain spaces");
    }

    public WrongLoginException(String message){
        super(message);
    }
}
