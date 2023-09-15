package classes;

import java.util.List;

public class Contact {
    private List<Project> projects;
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Project> getProjects() {
        return projects;
    }
}
