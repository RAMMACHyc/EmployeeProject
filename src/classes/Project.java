package classes;

import java.util.Date;
import java.util.List;

public class Project {
    private String code;
    private String name;
    private String decription;
    private Date dateStart;
    private Date dateEnd;
    private float amount;

    private List<Contact> contacts;
    private List<Phase> phases;
    private ProjetStatus status;
    public enum ProjetStatus {
        DONE, PENDING
    }


    public Project(String code, String name, String decription, Date dateStart, Date dateEnd, float amount, ProjetStatus status) {
        this.code = code;
        this.name = name;
        this.decription = decription;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.amount = amount;
        this.status = status;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }

    public List<Contact> getContacts() {
        return contacts;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
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

    public ProjetStatus getStatus() {
        return status;
    }

    public void setStatus(ProjetStatus status) {
        this.status = status;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }



}
