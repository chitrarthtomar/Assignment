package com.example.hp15p077tx.assignment.model;

/**
 * Created by HP 15 P077 TX on 28-05-2017.
 */

public class utils {

    public static final String BASE_URL = "https://api.myjson.com/";

    public static webAPI getService() {
        return retrofitClient.getClient(BASE_URL).create(webAPI.class);
    }
}