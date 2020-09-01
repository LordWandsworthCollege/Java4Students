package x11Ternary;

public class TernaryOperators {
    public static void main(String[] args) {
        String nationality = "British";
String x = nationality == "British" ? "God Save the Queen" : "Unlucky";
        System.out.println(x);
        extension();
    }
    /*
    Task
    Write an Ternary Operator to ask is count bigger than 7,
    if it is, display 'true blue'
    if it isn't, display 'Vogue'
     */









    private static void extension(){
        int count = 7;
        String x = count>7? "True Blue" : "Vogue";
        System.out.println(x);
    }
}

