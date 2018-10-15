package com.example.yimingma.pre_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileEditor extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_editer);

        final TextView nameEditor=(TextView) findViewById(R.id.name);
        final TextView birthdayEditor=(TextView) findViewById(R.id.birthday);

        Button saveButton= (Button) findViewById(R.id.save);
        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileEditor.this,nameEditor.getText().toString()+ '\n'+birthdayEditor.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }


}
