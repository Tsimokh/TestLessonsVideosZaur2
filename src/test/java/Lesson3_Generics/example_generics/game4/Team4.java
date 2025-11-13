package Lesson3_Generics.example_generics.game4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team4<T extends Participant4> {
    private String name;
    private List<T> listParticipant = new ArrayList<>();

    public Team4(String name) {
        this.name = name;
    }

    public void addParticipant(T participant) {
        listParticipant.add(participant);
        System.out.println("In the team " + name + " added a new participant: " + participant.getName());
    }

    public void playWith(Team4<T> team) {
        String teamWinner;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            teamWinner = this.name;
        } else {
            teamWinner = team.name;
        }
        System.out.println("Won a team: " + teamWinner);
    }
}
