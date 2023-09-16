package classes;

import java.util.Date;

public class Reservation {
    private int id;
    private Date reservDate;
    private Date arrivDate;
    private Date dprtDate;
    private int nightsNbr;
    private int roomsNbr;
    private Res_Type resType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReservDate() {
        return reservDate;
    }

    public void setReservDate(Date reservDate) {
        this.reservDate = reservDate;
    }

    public Date getArrivDate() {
        return arrivDate;
    }

    public void setArrivDate(Date arrivDate) {
        this.arrivDate = arrivDate;
    }

    public Date getDprtDate() {
        return dprtDate;
    }

    public void setDprtDate(Date dprtDate) {
        this.dprtDate = dprtDate;
    }

    public int getNightsNbr() {
        return nightsNbr;
    }

    public void setNightsNbr(int nightsNbr) {
        this.nightsNbr = nightsNbr;
    }

    public int getRoomsNbr() {
        return roomsNbr;
    }

    public void setRoomsNbr(int roomsNbr) {
        this.roomsNbr = roomsNbr;
    }

    public Res_Type getResType() {
        return resType;
    }

    public void setResType(Res_Type resType) {
        this.resType = resType;
    }
}
