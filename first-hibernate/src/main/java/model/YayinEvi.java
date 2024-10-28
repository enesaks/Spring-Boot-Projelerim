package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="yayin_evi")
public class YayinEvi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="ad")
    private String name;
    private String adres;
    @ManyToMany
    @JoinTable(
            name="yayinevi_kitap",
            joinColumns = @JoinColumn(name="yayinevi_id"),
            inverseJoinColumns = @JoinColumn(name="kitap_id")
    )
    private List<Kitap> kitap;
}
