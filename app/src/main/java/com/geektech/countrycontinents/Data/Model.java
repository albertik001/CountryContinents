package com.geektech.countrycontinents.Data;

import android.provider.ContactsContract;

public class Model {
    private String name;
    private Integer image;
    private Integer keyID;

    public Model(String name, Integer image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getKeyID() {
        return keyID;
    }

    public void setKeyID(Integer keyID) {
        this.keyID = keyID;
    }

    public Model(String name, Integer image, Integer keyID) {
        this.name = name;
        this.image = image;
        this.keyID = keyID;
    }
}
