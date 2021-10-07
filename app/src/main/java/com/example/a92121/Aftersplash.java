package com.example.a92121;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class Aftersplash extends AppCompatActivity  implements View.OnClickListener{
    private CardView m1card, m2card, m3card, m4card,m5card;
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftersplash);

        myDialog = new Dialog(this);
        m1card = (CardView) findViewById(R.id.m1_card);
        m2card = (CardView) findViewById(R.id.m2_card);
        m3card = (CardView) findViewById(R.id.m3_card);
        m4card = (CardView) findViewById(R.id.m4_card);
        m5card = (CardView) findViewById(R.id.m5_card);




        m1card.setOnClickListener(this);
        m2card.setOnClickListener(this);
        m3card.setOnClickListener(this);
        m4card.setOnClickListener(this);
        m5card.setOnClickListener(this);


    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Aftersplash.this);
        builder.setMessage("Are you sure?");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();

            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.m1_card : i = new Intent(this,Message1.class);
                startActivity(i);break;
            case R.id.m2_card : i = new Intent(this,Message2.class);
                startActivity(i);break;
            case R.id.m3_card : i = new Intent(this,Notepad.class);
                startActivity(i);break;
            case R.id.m4_card : i = new Intent(this,Message4.class);
                startActivity(i);break;
            case R.id.m5_card : i = new Intent(this, settings.class);
                startActivity(i);break;

            default: break;

        }

    }
}
