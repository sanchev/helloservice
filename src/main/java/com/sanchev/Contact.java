package com.sanchev;

import com.google.gson.annotations.SerializedName;

public class Contact {
    static final String ID_TAG = "contact_id";
    static final String NAME_TAG = "contact_name";

    @SerializedName(ID_TAG)
    private long id;
    @SerializedName(NAME_TAG)
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
}