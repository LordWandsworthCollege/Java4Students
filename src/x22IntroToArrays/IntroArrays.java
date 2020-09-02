package x22IntroToArrays;

public class IntroArrays {
    public static void main(String[] args) {
        int[] ray = new int[5];
        ray[0] = 19;
        System.out.println(ray[0]);
        int[] arry = {24,48,96,198};
        System.out.println(arry[2]);
        arry[3] = 76;
        System.out.println(arry[2]);

        extension();
    }
    /*
    Task
        Create an Array of football teams below containing Chelsea,
        Liverpool, AFC and Man City.
        Then replace Man Utd with Man City

     */






    private static void extension(){
    String teams[] = {"Chelsea","Liverpool","AFC","Man City"};
    teams[3] = "Man Utd";
    System.out.println(teams[0]);
    System.out.println(teams[1]);
    System.out.println(teams[2]);
    System.out.println(teams[3]);
    }
}
