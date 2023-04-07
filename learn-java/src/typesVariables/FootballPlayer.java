package typesVariables;

public class FootballPlayer {
    int no;
    String name;
    int minutes;
    boolean inPlay;
    int numberOfGoals;

    void play(int minutesToPlay){
        minutes = minutes + minutesToPlay;
    }
    void score(){
        numberOfGoals++;
    }
}
