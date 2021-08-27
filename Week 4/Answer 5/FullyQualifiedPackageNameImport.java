public class FullyQualifiedPackageNameImport {
    public static void main(String[] args) {
        OnlineProfiles.GitHub myGH = new OnlineProfiles.GitHub("John Doe");
        myGH.addRepo("Java Assignments", true);
        myGH.addRepo("Secret Project", false);
        myGH.addRepo("Group Project", true);
        myGH.display();
        OnlineProfiles.LinkedIn myLI = new OnlineProfiles.LinkedIn("John Doe");
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