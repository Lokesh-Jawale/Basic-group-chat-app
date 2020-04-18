package com.lokilabs.firebase1;

class FriendlyMessage {

    private String text;
    private String name;
    private String photoUrl;
    private String time;

    public FriendlyMessage() {

    }

    public FriendlyMessage(String text, String name, String time, String photoUrl) {
        this.text = text;
        this.name = name;
        this.time = time;
        this.photoUrl = photoUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
