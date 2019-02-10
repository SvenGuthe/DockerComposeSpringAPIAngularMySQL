package sven.guthe.spring;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String vorname;

    @NotNull
    private String nachname;

    public Person() {
    }

    public Person(@NotNull String vorname, @NotNull String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

}
