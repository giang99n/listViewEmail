package com.example.email;

public class email {
    String name;
    String time;
    String content;
    int avatarResource;
    boolean isSelected;
    private String bgColor;

    public email(String name, String time, String content, int avatarResource,String bgColor ) {
        this.name = name;
        this.time = time;
        this.content = content;
        this.avatarResource = avatarResource;
        this.isSelected = false;
        this.bgColor = bgColor;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}
