package x09LogicalOperators;

public class LogicalOperator {
    public static void main(String[] args) {
        String Team = "AFC";
        int place = 1;

        if ( Team=="AFC" && place==1){
            System.out.println("AND - Both are true");
        }else if(Team=="AFC" || place==1){
            System.out.println("OR - At least 1 is true");
        }
        extension();
    }


    /*
    Task

    Write an algorithm using the 2 variables already there.
    - If they have 2 legs and they breathe oxygen, they are human.
    - If they have 4 legs and they breath oxygen, they are a dog.
    - If they have don't breathe Oxygen or have 2/4 legs,
      they are not a mammal


     */









    private static void extension(){
        String breathes = "Oxygen";
        int legs = 2;
        if (breathes=="Oxygen" && legs==2){
            System.out.println("You are human");
        }else if (breathes=="Oxygen" && legs==4){
            System.out.println("You are a dog");
        }else{
            System.out.println("You are not a mammal");
        }
    }

}
