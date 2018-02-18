package com.example.microsoft.elroyyehezkiel_1202150044_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class splash extends Activity {
    //Set waktu lama splashscreen
    private static int splashInterval = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Toast.makeText(this, "Enak dan Higienis ", Toast.LENGTH_SHORT).show(); //akan menampilkan pesan RIZKY ALAMSYAH_1202154185
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            // method untuk mengarahkan ke aktivitas selanjutnya
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 2500L); //5000 L = 5 detik
    }
}