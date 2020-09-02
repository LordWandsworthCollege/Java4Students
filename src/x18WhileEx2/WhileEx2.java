package x18WhileEx2;

public class WhileEx2 {
    public static void main(String[] args) {
        extension();
    }


    /*
    Task
    Print a counting sequence with every 3rd
    number squared. Continue while the output is under 100

     */









    private static void extension(){
        int y = 0;
        while(y<100){
            y+=3;
            System.out.println(y+ " = "+y*y);
        }
    }
}
