package fr.maif.handsonlabs.javaspringbootgraphql.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "continents")
public class Continent {

    @Id
    @Column(name = "id", length = 2, nullable = false)
    private String id;

    @Column(name = "label", length = 64, nullable = false)
    private String label;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(id, continent.id) &&
            Objects.equals(label, continent.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label);
    }

    @Override
    public String toString() {
        return "Continent{" +
            "code='" + id + '\'' +
            ", label='" + label + '\'' +
            '}';
    }
}
