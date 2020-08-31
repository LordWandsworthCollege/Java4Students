package x08Else;

public class Else {
    public static void main(String[] args) {
        int dog = 5;

        if(dog>6) System.out.println("Its big enough");
        else if(dog==6){
            System.out.println("It's just right");
        }else{
            System.out.println("Could be my slippers");
        }

        extension();
    }
    /*
    Task
    If the breed is anything else, say "I'm sure its cool too"


     */









    private static void extension(){
        String breed="Pondenco";
        if(breed=="Labrador"){
            System.out.println("Sweet :-)");
        }else if(breed=="Pondenco"){
            System.out.println("Lovely and quick");
        }else{
            System.out.println("Am sure it is cool too");
        }
    }
}
