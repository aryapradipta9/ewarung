package com.kelompok9.ewarung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewCust(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("target","https://vincenthend.github.io/ewarungweb/");
        startActivity(intent);
    }


    public void viewWarung(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("target","https://vincenthend.github.io/ewarungweb/order_receive?id=1");
        startActivity(intent);
    }
}
