public class CountryNotValidException extends Exception {
    public CountryNotValidException(String cstatus){
       super("CountryNotValidException: "+cstatus); ;
    }

}
