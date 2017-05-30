package com.example.hp15p077tx.assignment.model;

/**
 * Created by HP 15 P077 TX on 28-05-2017.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class itemdata {

    @SerializedName("data")
    @Expose
    private List<data> data;

    public List<data> getData() {
        return data;
    }

    public void setData(List<data> data) {
        this.data = data;
    }

}