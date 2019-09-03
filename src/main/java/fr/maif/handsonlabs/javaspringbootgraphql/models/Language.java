package fr.maif.handsonlabs.javaspringbootgraphql.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @Column(name = "id", length = 2, nullable = false)
    private String id;

    @Column(name = "name", length = 256, nullable = false)
    private String name;

    @Column(name = "native", length = 256, nullable = false)
    private String nativeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return Objects.equals(id, language.id) &&
            Objects.equals(name, language.name) &&
            Objects.equals(nativeName, language.nativeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nativeName);
    }

    @Override
    public String toString() {
        return "Language{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", nativeName='" + nativeName + '\'' +
            '}';
    }
}
