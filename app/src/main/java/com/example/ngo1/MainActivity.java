package com.example.ngo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    LinearLayout ll_view_events_hp,ll_add_event_hp,ll_gallery_hp,ll_notification_hp,ll_request_hp,ll_home_nav,ll_add_event_nav,ll_profile_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitializeObjects();
    }

    private void InitializeObjects() {

        ll_view_events_hp = findViewById(R.id.ll_view_events_hp);
        ll_add_event_hp = findViewById(R.id.ll_add_event_hp);
        ll_gallery_hp = findViewById(R.id.ll_gallery_hp);
        ll_notification_hp = findViewById(R.id.ll_notification_hp);
        ll_request_hp = findViewById(R.id.ll_request_hp);
        ll_home_nav = findViewById(R.id.ll_home_nav);
        ll_add_event_nav = findViewById(R.id.ll_add_event_nav);
        ll_profile_nav = findViewById(R.id.ll_profile_nav);

        ClickMethods();
    }

    private void ClickMethods() {

        ll_view_events_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "View Events Clicked !", Toast.LENGTH_SHORT).show();

            }
        });

        ll_add_event_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ll_gallery_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ll_notification_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ll_request_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ll_add_event_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ll_home_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ll_profile_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
