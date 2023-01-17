public class ValidationFailedException extends Exception {
    ValidationFailedException(){
    }
    ValidationFailedException(String msg){
        super(msg);
    }
}
