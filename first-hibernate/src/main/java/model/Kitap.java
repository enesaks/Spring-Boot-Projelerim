package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "kitaplar")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String isbnNo;
    private int sayfaSayisi;
    @ManyToOne
    @JoinColumn(name = "yazar_id", unique = false)
    private Yazar yazar;
    @ManyToMany(mappedBy = "kitap")
    private List<YayinEvi> yayinEvi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    public List<YayinEvi> getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(List<YayinEvi> yayinEvi) {
        this.yayinEvi = yayinEvi;
    }
}
