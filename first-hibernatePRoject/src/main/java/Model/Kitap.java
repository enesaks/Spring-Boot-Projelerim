package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@
@Entity
public class Kitap {

    @Id
    private int id;
    private String kitap;
    private String kategori;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKitap() {
        return kitap;
    }

    public void setKitap(String kitap) {
        this.kitap = kitap;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
