package classes;

import java.util.List;

public class Res_Type {
    private int id;
    private String pension;
    private float tarif;
    private List<Reservation>reservations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }


}
