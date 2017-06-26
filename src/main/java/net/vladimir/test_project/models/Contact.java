package net.vladimir.test_project.models;

import javax.persistence.*;


@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue
    @Column(name = "id")
    long id;

    @Column(name = "name")
    String name;

    public Contact() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (id != contact.id) return false;
        return name != null ? name.equals(contact.name) : contact.name == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
