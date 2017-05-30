package com.example.hp15p077tx.assignment.View;


import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hp15p077tx.assignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class displayData extends Fragment {



    private String Id;
    private String desc;
    private String Url;


    public String getid() {
        return Id;
    }

    public String getDesc() {
        return desc;
    }

    public String getUrl() {
        return Url;
    }


    public void setDetails(String id,String desc,String url){
        this.Id=id;
        this.desc=desc;
        this.Url=url;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_display_data, container, false);
        TextView t = (TextView)v.findViewById(R.id.text_details);
        t.setText("Id:"+Id+" Desc:"+desc +" URL:"+Url);
        return v;
    }


}
