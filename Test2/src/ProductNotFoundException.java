public class ProductNotFoundException extends Exception{
    ProductNotFoundException(){
    }
    ProductNotFoundException(String msg){
        super(msg);
    }
}
