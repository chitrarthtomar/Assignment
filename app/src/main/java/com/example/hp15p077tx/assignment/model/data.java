package com.example.hp15p077tx.assignment.model;

/**
 * Created by HP 15 P077 TX on 28-05-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class data {

    @SerializedName("itemId")
    @Expose
    private String itemId;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("audio")
    @Expose
    private String audio;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

}