package com.example.hp15p077tx.assignment.model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by HP 15 P077 TX on 28-05-2017.
 */

public interface webAPI {

    @GET("bins/hoo8n")
    Call<itemdata> getItems();

}
