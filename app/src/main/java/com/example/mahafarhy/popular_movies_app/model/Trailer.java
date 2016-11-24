package com.example.mahafarhy.popular_movies_app.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Trailer implements Serializable {
    @SerializedName("key")
    private String key;

    @SerializedName("name")
    private String name;

    public String getKey() {
        return "https://www.youtube.com/watch?v=" + key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
