package x07ElseIf;

public class ElseIf {
    public static void main(String[] args) {
        int dog = 6;

        if(dog>6){
            System.out.println("Its big enough");
        }else if(dog==6){
            System.out.println("It's just right");
        }

        extension();
    }


    /*
    Task
    Modify the previous exercise. In addition to
    labrador, if the breed is a Pondenco "Lovely
    and quick"


     */









    private static void extension(){
        String breed="Pondenco";
        if(breed=="Labrador"){
            System.out.println("Sweet :-)");
        }else if(breed=="Pondenco"){
            System.out.println("Lovely and quick");
        }
    }
}
