package com.example.hp15p077tx.assignment.presenter;

import android.util.Log;

import com.example.hp15p077tx.assignment.model.data;
import com.example.hp15p077tx.assignment.model.itemdata;
import com.example.hp15p077tx.assignment.model.utils;
import com.example.hp15p077tx.assignment.model.webAPI;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by HP 15 P077 TX on 28-05-2017.
 */

public class getDataFromApi {

    private List<data> it = new ArrayList<>();
    private webAPI mwebAPI;



    public List<data> load(){
        mwebAPI = utils.getService();
        mwebAPI.getItems().enqueue(new Callback<itemdata>() {
            @Override
            public void onResponse(Call<itemdata> call, Response<itemdata> response) {
                if(response.isSuccessful()){
                    Log.d("getData","This is it");
                    it= response.body().getData();
                    Log.d("getData", it.size()+" "+"This "+it.get(1).getDesc().replace("+(1)",""));
                }
            }

            @Override
            public void onFailure(Call<itemdata> call, Throwable t) {
                Log.d("MainActivity","cannot reached there");
            }
        });
        return it;
    }

}
