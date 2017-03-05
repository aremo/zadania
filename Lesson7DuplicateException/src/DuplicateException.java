
public class DuplicateException extends Exception {
    public DuplicateException(){
        super("Zduplikowana Wartość");
    }

    public DuplicateException(String name){
        super(name);
    }
}
