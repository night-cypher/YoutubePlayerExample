package com.questdot.youtubeplayerexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnActivity;
    Button btnFragment;
    public static final String API_KEY = "AIzaSyDi97kbUT9Zek8MD495XXvz9oHrUwwPovE";
    public static final String VIDEO_ID = "Ey_hgKCCYU4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity = (Button)findViewById(R.id.btnActivity);
        btnFragment = (Button)findViewById(R.id.btnFragment);

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                startActivity(intent);
            }
        });

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),YoutubeFragment.class);
                startActivity(intent);
            }
        });


    }
}
