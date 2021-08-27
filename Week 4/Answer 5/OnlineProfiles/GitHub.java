package OnlineProfiles;

import java.util.ArrayList;

public class GitHub {
    private class Repository {
        String name;
        boolean isPublic;

        Repository(String name, boolean isPublic) {
            this.name = name;
            this.isPublic = isPublic;
        }
    }

    String username;
    ArrayList<Repository> repos;

    public GitHub(String username) {
        this.username = username;
        repos = new ArrayList<Repository>();
    }

    public void addRepo(String name, boolean isPublic) {
        Repository repo = new Repository(name, isPublic);
        repos.add(repo);
    }

    public void display() {
        System.out.println(username + "\'s GitHub Profile:");
        System.out.println("Repositories:");
        for (Repository repository : repos) {
            if(repository.isPublic) System.out.println(repository.name);
        }
    }
}
