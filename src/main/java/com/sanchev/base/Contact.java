package com.sanchev;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Contact {
    static final String ID_TAG = "contact_id";
    static final String NAME_TAG = "contact_name";

    @SerializedName(ID_TAG)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @SerializedName(NAME_TAG)
    @Column(name = "name")
    private String name;

    public Contact(long id, String name) {
        this.id = id;
        this.name = name;
    }

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
    public String toString() {
        return String.format("id: %d\tname: %s", id, name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Long.valueOf(id).hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Contact contact = (Contact) obj;
        return id == contact.id && (name == contact.getName() || (name != null && name.equals(contact.getName())));
    }
}