package classes;

public class Categorie {
    private int ctgId;
    private int bedNbr;
    private float price;
    private Room room;

    public int getCtgId() {
        return ctgId;
    }

    public void setCtgId(int ctgId) {
        this.ctgId = ctgId;
    }

    public int getBedNbr() {
        return bedNbr;
    }

    public void setBedNbr(int bedNbr) {
        this.bedNbr = bedNbr;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
