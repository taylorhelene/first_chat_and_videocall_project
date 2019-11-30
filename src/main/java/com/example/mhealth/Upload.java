package com.example.mhealth;

public class Upload {
    public String name;
    public String url;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Upload() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Upload(String name, String url) {
        this.name = name;
        this.url= url;
    }

    @Override
    public String toString() {
        return getUrl();
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

}
