package org.ardananjungkusuma.pokelove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pokemon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);
    }

    public void back(View view) {
        Intent i = new Intent(Pokemon.this, MainActivity.class);
        startActivity(i);
    }
}