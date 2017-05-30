package com.example.hp15p077tx.assignment.View;

import android.media.MediaPlayer;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hp15p077tx.assignment.R;
import com.example.hp15p077tx.assignment.model.data;
import com.example.hp15p077tx.assignment.model.itemdata;
import com.example.hp15p077tx.assignment.model.utils;
import com.example.hp15p077tx.assignment.model.webAPI;
import com.example.hp15p077tx.assignment.presenter.getDataFromApi;
import com.example.hp15p077tx.assignment.presenter.loadSound;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SecondActivity extends AppCompatActivity {
    List<data> dt;
    FragmentTransaction fragmentTransaction;
    private webAPI mwebAPI;
    public static int iter=0;
    private loadSound ld = new loadSound();
    MediaPlayer mediaPlayer= new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mwebAPI = utils.getService();
        mwebAPI.getItems().enqueue(new Callback<itemdata>() {
            @Override
            public void onResponse(Call<itemdata> call, Response<itemdata> response) {
                if(response.isSuccessful()){
                    mediaPlayer = ld.prepareAudio(response.body().getData().get(0).getAudio().toString(),mediaPlayer);
                    doIt(response.body().getData());
                }
            }

            @Override
            public void onFailure(Call<itemdata> call, Throwable t) {
                Log.d("MainActivity","cannot reached there");
            }
        });
        Log.d("second","here");

        Button b =(Button)findViewById(R.id.button_continue);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iter==dt.size()) {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                    iter=0;
                    finish();
                }
                else {
                    fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, getNextFrag());
                    fragmentTransaction.commit();
                }
            }
        });
    }

    public displayData getNextFrag(){
        displayData dD = new displayData();
        if(iter>=0&&iter<dt.size()) {
            data d = dt.get(iter);
            dD.setDetails(d.getItemId(), d.getDesc(), d.getAudio());
            Log.d("second", " ok there");
            iter++;
            if(iter!=1){
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer = ld.prepareAudio(dD.getUrl(),mediaPlayer);
            }
            return dD;
        }
        else{
            Toast.makeText(getApplicationContext(),"No more data",Toast.LENGTH_SHORT);
            dD.setDetails("","","");
            return dD;
        }
    }
    public void doIt(List<data> dt){
        this.dt = dt;
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,getNextFrag());
        fragmentTransaction.commit();

    }
    @Override
    public void onBackPressed() {
        mediaPlayer.stop();
        mediaPlayer.reset();
        iter=0;
        finish();
    }
}
