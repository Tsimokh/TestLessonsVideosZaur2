package Lesson3_Generics.example_generics.game3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team3 <T extends Participant3> {
    private String name;
    private List<T> listParticipant = new ArrayList<>();

    public Team3(String name) {
        this.name = name;
    }

    public void addParticipant(T participant) {
        listParticipant.add(participant);
        System.out.println("In the team " + name + " added a new participant: " + participant.getName());
    }

    public void playWith(Team3 team) {
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
