package com.example.class_project_two;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class BenjonBorno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benjon_borno);
        getSupportActionBar().setTitle("ব্যঞ্জনবর্ণ");

    }

    public  void  lisenMetod(View view){
        if(view.getId()==R.id.kId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.k);
            msoro.start();
        }else if(view.getId()==R.id.khId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.kh);
            msoro.start();
        }else if(view.getId()==R.id.gId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.g);
            msoro.start();
        }
        if(view.getId()==R.id.ghId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.gh);
            msoro.start();
        }else if(view.getId()==R.id.oaid){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.oa);
            msoro.start();
        }else if(view.getId()==R.id.cId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.c);
            msoro.start();
        }
        if(view.getId()==R.id.chId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.ch);
            msoro.start();
        }else if(view.getId()==R.id.jId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.j);
            msoro.start();
        }else if(view.getId()==R.id.jhId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.jh);
            msoro.start();
        }else if(view.getId()==R.id.eaId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.ea);
            msoro.start();
        }else if(view.getId()==R.id.tId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.t);
            msoro.start();
        }else if(view.getId()==R.id.thId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.th);
            msoro.start();
        }else if(view.getId()==R.id.dId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.d);
            msoro.start();
        }else if(view.getId()==R.id.dhId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.dh);
            msoro.start();
        }else if(view.getId()==R.id.nhId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.nh);
            msoro.start();
        }else if(view.getId()==R.id.taId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.ta);
            msoro.start();
        }else if(view.getId()==R.id.tahId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.tah);
            msoro.start();
        }else if(view.getId()==R.id.daId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.da);
            msoro.start();
        }else if(view.getId()==R.id.dahId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.dah);
            msoro.start();
        }else if(view.getId()==R.id.nId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.n);
            msoro.start();
        }else if(view.getId()==R.id.pId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.p);
            msoro.start();
        }else if(view.getId()==R.id.phId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.ph);
            msoro.start();
        }else if(view.getId()==R.id.bId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.b);
            msoro.start();
        }else if(view.getId()==R.id.bhId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.bh);
            msoro.start();
        }else if(view.getId()==R.id.mId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.m);
            msoro.start();
        }else if(view.getId()==R.id.ontoJId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.ontoj);
            msoro.start();
        }else if(view.getId()==R.id.rId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.r);
            msoro.start();
        }else if(view.getId()==R.id.lId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.l);
            msoro.start();
        }else if(view.getId()==R.id.morshId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.mshid);
            msoro.start();
        }else if(view.getId()==R.id.donshoId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.s);
            msoro.start();
        }else if(view.getId()==R.id.hId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.h);
            msoro.start();
        }else if(view.getId()==R.id.dorId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.dor);
            msoro.start();
        }else if(view.getId()==R.id.dorrId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.dorr);
            msoro.start();
        }else if(view.getId()==R.id.onaId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.ona);
            msoro.start();
        }else if(view.getId()==R.id.honId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.kondota);
            msoro.start();
        }else if(view.getId()==R.id.onusId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.onus);
            msoro.start();
        }else if(view.getId()==R.id.bisId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.bisg);
            msoro.start();
        }else if(view.getId()==R.id.condroId){
            final MediaPlayer msoro = MediaPlayer.create(this, R.raw.conb);
            msoro.start();
        }else if(view.getId()==R.id.backId){
            Intent intent = new Intent(BenjonBorno.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(BenjonBorno.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
