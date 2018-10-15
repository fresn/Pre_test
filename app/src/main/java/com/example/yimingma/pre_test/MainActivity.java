package com.example.yimingma.pre_test;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final int PROFILE_REQ_CODE =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickPE(View view) {
        Intent my_pe = new Intent(this, ProfileEditor.class);
        startActivityForResult(my_pe, PROFILE_REQ_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode==PROFILE_REQ_CODE){
        }
        super.onActivityResult(requestCode, resultCode, data);

    }
}
