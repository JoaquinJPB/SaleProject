package model;

import java.time.LocalDateTime;

public class Sale {
    private final String saleName;
    private final String description;
    private int bid;
    private final LocalDateTime duration;
    //private final List<> photos;

    public Sale(String saleName, String description, LocalDateTime duration) {
        this.saleName = saleName;
        this.description = description;
        this.duration = duration;
        bid = 0;
    }

    public String getSaleName() {
        return saleName;
    }

    public String getDescription() {
        return description;
    }

    public int getBid() { return bid; }

    public void setBid(int bid){
        this.bid = bid;
    }

    public LocalDateTime getDuration() {
        return duration;
    }

    @Override
    public String toString(){
        return " Nombre de la subasta " + saleName + " " + description + " Numero de usuarios que estan activos en la subasta " + bid + " Tiempo total "+ duration;
    }

//    public List getPhotos() {
//        return photos;
//    }
}
