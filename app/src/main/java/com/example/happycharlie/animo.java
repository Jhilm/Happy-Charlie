package com.example.happycharlie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class animo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animo);
    }

    public void volverLobby(View view) {
        Intent anterior = new Intent(this, lobby.class);
        startActivity(anterior);
    }
}
