package com.example.hp15p077tx.assignment.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hp15p077tx.assignment.R;
import com.example.hp15p077tx.assignment.model.data;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    List<data> dt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = (Button)findViewById(R.id.button_click);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity","This is");
                Intent i= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });
    }

}
