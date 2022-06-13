public class CalcException extends Exception {
    public CalcException() {
        System.out.println("Неправильно задано выражение");
    }
    public CalcException(String message){
        this();
        System.out.println(message);
    }
}
