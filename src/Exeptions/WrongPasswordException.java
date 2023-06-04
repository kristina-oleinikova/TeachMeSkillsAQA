package Exeptions;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super("Password should be less than 20 symbols, includes at least one number and doesn't contain spaces");
    }

    public WrongPasswordException(String message){
        super(message);
    }
}
