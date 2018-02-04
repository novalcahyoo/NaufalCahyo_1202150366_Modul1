package com.naufalcahyo.modul1.naufalcahyo_1202150366_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView restaurant, menu, jumlah, bayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        restaurant = (TextView) findViewById(R.id.restaurant);
        menu = (TextView) findViewById(R.id.menu);
        jumlah = (TextView) findViewById(R.id.jumlah);
        bayar = (TextView) findViewById(R.id.bayar);


        if (getIntent().getExtras() != null) {

            Bundle bundle = getIntent().getExtras();

            restaurant.setText(bundle.getString("Restaurant"));
            menu.setText(bundle.getString("Menu"));
            jumlah.setText(bundle.getString("Jumlah"));
            bayar.setText(bundle.getString("Total"));
        }
    }
}
