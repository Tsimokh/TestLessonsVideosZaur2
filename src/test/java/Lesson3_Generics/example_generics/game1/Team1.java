package Lesson3_Generics.example_generics.game1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team1 {
    private String name;
    private List<Participant1> listParticipant = new ArrayList<>();

    public Team1(String name) {
        this.name = name;
    }

    public void addParticipant(Participant1 participant) {
        listParticipant.add(participant);
        System.out.println("In the team " + name + " added a new participant: " + participant.getName());
    }

    public void playWith(Team1 team) {
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
