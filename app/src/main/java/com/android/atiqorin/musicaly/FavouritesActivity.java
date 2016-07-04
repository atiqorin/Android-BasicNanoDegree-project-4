package com.android.atiqorin.musicaly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavouritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        Button browse=(Button)findViewById(R.id.browseFromFavourites);
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
