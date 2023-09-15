package classes;
import java.util.List;
public class Liverable {
    private String code;
    private String title;
    private String link;
    private Phase phase;

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }


    private List<Document> documentList;

    public Liverable(String code, String title, String link) {
        this.code = code;
        this.title = title;
        this.link = link;
    }


    public List<Document> getDocumentList() {
        return documentList;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
