package com.example.happycharlie;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MotionEventCompat;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class inicio extends AppCompatActivity {


    Handler mHideHandler = new Handler();
    Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
                finish();
        }
    };
    @Override
    public boolean onTouchEvent(MotionEvent event){
        int action = MotionEventCompat.getActionMasked(event);
        if (action==MotionEvent.ACTION_DOWN){
            mHideHandler.removeCallbacks(mHideRunnable);
        }
        return super.onTouchEvent(event);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        mHideHandler.postDelayed(mHideRunnable, 30000);


        ImageButton btnClose = (ImageButton) findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void siguientePantalla(View view) {
        Intent siguiente = new Intent(this, lobby.class);
        startActivity(siguiente);
    }
}
