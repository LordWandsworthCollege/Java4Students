package x23ArrayMethods;
public class ArrayMethods {
    public static void main(String[] args) {
        int[] methods = {24,48,96,188};
        System.out.println(methods.length);
        for(int y = 0;y<methods.length;y++){
            System.out.println(methods[y]);
        }
        for (int x:methods){
            System.out.println(x);
        }
        extension();
    }
    /*
    Task
        Loop through the List of teams from the last exercise.
        Have the position number next to the team
        e.g.    1.Chelsea,
                2. Liverpool
                3. .....




     */









    private static void extension(){
        String teams[] = {"Chelsea","Liverpool","AFC","Man City"};
        for(int y = 0;y<teams.length;y++){
            System.out.printf("%2d. %s %n",y+1,teams[y]);
        }
    }
}
