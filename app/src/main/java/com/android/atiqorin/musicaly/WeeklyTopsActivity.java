package com.android.atiqorin.musicaly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeeklyTopsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_tops);
        Button browse=(Button)findViewById(R.id.browseFromWeekly);
        if(browse!=null)
            browse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(getApplicationContext(),BrowseActivity.class);
                    startActivity(i);
                }
            });
    }
    public void back(View v){
        finish();
    }
}
