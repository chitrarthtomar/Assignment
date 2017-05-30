package com.example.hp15p077tx.assignment.presenter;

import android.content.Context;
import android.view.LayoutInflater;

import com.example.hp15p077tx.assignment.View.displayData;
import com.example.hp15p077tx.assignment.model.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP 15 P077 TX on 29-05-2017.
 * Converts data list to a fragment list
 */

public class itemAdapter {
    private List<data> mdata;
    private LayoutInflater layoutInflater;

    public List<displayData> setItem(List<data> ls,Context c){
        List<displayData> fragList= new ArrayList<>();
        for (data d:ls) {
            displayData dD = new displayData();
            dD.setDetails(d.getItemId(),d.getDesc(),d.getAudio());
            fragList.add(dD);
        }

        return fragList;
    }
}
