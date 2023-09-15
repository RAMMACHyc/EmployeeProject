package classes;

import java.util.Date;
import java.util.List;
public class Phase {
    private String code;
    private String title;
    private String description;
    private Date dateStart;
    private Date dateEnd;
    private float amount;
    private boolean statut;
    private boolean billed;
    private boolean payed;
    private Project project;
    private Liverable liverable;
    private List<Employee> employees;
    private Project.ProjetStatus status;


    public Phase(String code, String title, String description, Date dateStart, Date dateEnd, Project.ProjetStatus status, float amount, boolean statut, boolean billed, boolean payed) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.status = status;
        this.amount = amount;
        this.statut = statut;
        this.billed = billed;
        this.payed = payed;
    }



    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Liverable getLiverable() {
        return liverable;
    }

    public void setLiverable(Liverable liverable) {
        this.liverable = liverable;
    }

    public List<Employee> getEmployers() {
        return employees;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Project.ProjetStatus getStatus() {
        return status;
    }

    public void setStatus(Project.ProjetStatus status) {
        this.status = status;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public boolean isBilled() {
        return billed;
    }

    public void setBilled(boolean billed) {
        this.billed = billed;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }
}
