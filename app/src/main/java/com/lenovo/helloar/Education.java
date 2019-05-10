package com.lenovo.helloar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Education extends AppCompatActivity {
    Button astro;
    Button anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        astro=findViewById(R.id.astro);
        anim=findViewById(R.id.anim);
        astro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),SolarActivity.class);
                startActivity(i);
            }
        });
        anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Dance.class);
                startActivity(i);

            }
        });
    }
}
