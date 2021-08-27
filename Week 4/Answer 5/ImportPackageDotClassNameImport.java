import OnlineProfiles.GitHub;
import OnlineProfiles.LinkedIn;

public class ImportPackageDotClassNameImport {
    public static void main(String[] args) {
        GitHub myGH = new GitHub("John Doe");
        myGH.addRepo("Java Assignments", true);
        myGH.addRepo("Secret Project", false);
        myGH.addRepo("Group Project", true);
        myGH.display();
        LinkedIn myLI = new LinkedIn("John Doe");
        myLI.addAchievement("Won XYZ Hackathon");
        myLI.addAchievement("Won ABC Coding Contest");
        myLI.addExperience("Interned at PQR Company");
        myLI.display();
    }
}

// Output

// John Doe's GitHub Profile:
// Repositories:
// Java Assignments
// Group Project
// John Doe's LinkedIn Profile:
// Achievements:
// Won XYZ Hackathon
// Won ABC Coding Contest
// Experiences:
// Interned at PQR Company   
