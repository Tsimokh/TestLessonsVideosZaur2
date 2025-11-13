package Lesson3_Generics.example_generics.game2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team2<T> {
    private String name;
    private List<T> listParticipant = new ArrayList<>();

    public Team2(String name) {
        this.name = name;
    }

    public void addParticipant(T participant) {
        listParticipant.add(participant);
        System.out.println("In the team " + name + " added a new participant: " + ((Participant2)(participant)).getName());
    }

    public void playWith(Team2 team) {
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
