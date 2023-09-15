package interfaces;


import classes.Project;

import java.util.List;

public interface Iproject {

  void add(Project project);
  boolean update(Project project);

  boolean delete(String code);

    List<Project> show();
    List<Project>SearchProject(String code);

}
