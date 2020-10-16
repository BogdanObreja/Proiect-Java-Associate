public class NumeDejaExistentException extends RuntimeException{
    public NumeDejaExistentException(){
        super("Exista deja un animal cu acest nume");
    }
}