package interfaces;
import classes.Project;

import java.util.List;

public interface Idirector {

    boolean update(Project project);
    List<Project> SearchProject();
}
