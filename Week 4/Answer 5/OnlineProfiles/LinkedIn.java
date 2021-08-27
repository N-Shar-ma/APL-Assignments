package OnlineProfiles;

import java.util.ArrayList;

public class LinkedIn {
    String username;
    ArrayList<String> achievements;
    ArrayList<String> experiences;

    public LinkedIn(String username) {
        this.username = username;
        achievements = new ArrayList<String>();
        experiences = new ArrayList<String>();
    }

    public void addAchievement(String achievement) {
        achievements.add(achievement);
    }

    public void addExperience(String experience) {
        experiences.add(experience);
    }

    public void display() {
        System.out.println(username + "\'s LinkedIn Profile:");
        System.out.println("Achievements:");
        for (String achievement : achievements) {
            System.out.println(achievement);
        }
        System.out.println("Experiences:");
        for (String experience : experiences) {
            System.out.println(experience);
        }
    }
}
