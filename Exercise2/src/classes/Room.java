package classes;

import java.util.List;

public class Room {
    private int roomNbr;
    private String phoneNbr;
    private List<Categorie>categories;

    public List<Categorie> getCategories() {
        return categories;
    }

    public int getRoomNbr() {
        return roomNbr;
    }

    public void setRoomNbr(int roomNbr) {
        this.roomNbr = roomNbr;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }
}
