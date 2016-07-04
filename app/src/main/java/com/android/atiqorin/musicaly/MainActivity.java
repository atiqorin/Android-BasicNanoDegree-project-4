package com.android.atiqorin.musicaly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button recents=(Button)findViewById(R.id.recent);
        Button weeklyTop=(Button)findViewById(R.id.weeklyTop);
        Button top50=(Button)findViewById(R.id.top50);
        Button favourits=(Button)findViewById(R.id.favourits);
        Button browse=(Button)findViewById(R.id.browse);

        recents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RecentsActivity.class);
                startActivity(i);
            }
        });

        weeklyTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),WeeklyTopsActivity.class);
                startActivity(i);
            }
        });

        top50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),TopFiftyAcitvity.class);
                startActivity(i);
            }
        });

        favourits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FavouritesActivity.class);
                startActivity(i);
            }
        });


        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),BrowseActivity.class);
                startActivity(i);
            }
        });

    }
}
