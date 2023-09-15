package implementaion;

import classes.Project;
import interfaces.Iproject;

import java.util.ArrayList;
import java.util.List;

public class projectImpl implements Iproject {


    @Override
    public void add(Project project) {

    }
    @Override
    public boolean update(Project project) {

        return false;
    }

    @Override
    public boolean delete(String code) {
        return false;
    }

    @Override
    public List<Project> SearchProject(String code) {
        return null;
    }

    @Override
    public List<Project> show() {
        List<Project> Projects = new ArrayList<>();


        return Projects;
    }


}
