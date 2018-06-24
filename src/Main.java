public class Main {
    public static void main(String[] args) {

    }
    
    boolean isValidPlayerName(String name){
        return name.matches("[A-Z][A-Z0-9]{7}");
    }
}