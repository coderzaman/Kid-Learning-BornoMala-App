package com.example.class_project_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class shoroBorno extends AppCompatActivity {
    TextView soro, sora, rose, dirge, roso, dirgo, ri, e, oi, o, ao;
    ImageView backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoro_borno);
        getSupportActionBar().setTitle("স্বরবর্ণ");
        soro = findViewById(R.id.soro);
        sora = findViewById(R.id.sora);
        rose = findViewById(R.id.rose);
        dirge = findViewById(R.id.dirge);
        roso = findViewById(R.id.roso);
        dirgo = findViewById(R.id.dirgo);
        ri = findViewById(R.id.ri);
        e = findViewById(R.id.e);
        oi = findViewById(R.id.oi);
        o = findViewById(R.id.o);
        ao = findViewById(R.id.ao);
        backbtn = findViewById(R.id.backIds);

        final MediaPlayer msoro = MediaPlayer.create(this, R.raw.soro);
        soro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msoro.start();
            }
        });
        final MediaPlayer msora = MediaPlayer.create(this, R.raw.sora);
        sora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msora.start();
            }
        });
        final MediaPlayer mrose = MediaPlayer.create(this, R.raw.rose);
        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mrose.start();
            }
        });
        final MediaPlayer mdirgoe = MediaPlayer.create(this, R.raw.dirgoe);
        dirge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mdirgoe.start();
            }
        });
        final MediaPlayer mroso = MediaPlayer.create(this, R.raw.roso);
        roso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mroso.start();
            }
        });
        final MediaPlayer mdirgo = MediaPlayer.create(this, R.raw.dirgo);
        dirgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mdirgo.start();
            }
        });
        final MediaPlayer mdri = MediaPlayer.create(this, R.raw.ri);
        ri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mdri.start();
            }
        });
        final MediaPlayer me = MediaPlayer.create(this, R.raw.e);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                me.start();
            }
        });
        final MediaPlayer moi = MediaPlayer.create(this, R.raw.oi);
        oi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moi.start();
            }
        });
        final MediaPlayer mo = MediaPlayer.create(this, R.raw.o);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mo.start();
            }
        });
        final MediaPlayer mao = MediaPlayer.create(this, R.raw.ow);
        ao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mao.start();
            }
        });

       backbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(shoroBorno.this, MainActivity.class);
               startActivity(intent);
               finish();
           }
       });

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(shoroBorno.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
