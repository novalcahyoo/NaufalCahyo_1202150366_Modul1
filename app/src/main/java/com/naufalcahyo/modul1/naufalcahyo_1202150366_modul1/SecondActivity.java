package com.naufalcahyo.modul1.naufalcahyo_1202150366_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText menuu,jumlahh;
    private TextView tempatt;
    private int total,bayar;
    private int duit = 65500;
    private int hrgApnormal = 30000;
    private int hrgEatbus = 50000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuu = (EditText) findViewById(R.id.menu);
        tempatt = (TextView) findViewById(R.id.restaurant);
        jumlahh = (EditText) findViewById(R.id.jumlah);

    }

    public void visitapnormal(View view) {

        String menu = menuu.getText().toString();
        String jumlah = jumlahh.getText().toString();


        if (menu.isEmpty() || jumlah.isEmpty()){
            Toast.makeText(this, "Harap diisi terlebih dahulu", Toast.LENGTH_LONG).show();
        }else {
            total = Integer.parseInt(jumlah.trim());
            bayar = total * hrgApnormal;

            Intent intent = new Intent(this,SecondActivity.class);

            intent.putExtra("Menu", menu);
            intent.putExtra("Jumlah",jumlah);
            intent.putExtra("Total",String.valueOf(bayar));

            startActivity(intent);

            if (bayar < duit){
                Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Jangan disini makan malamnya, berat," +
                        " uang kamu tidak cukup",Toast.LENGTH_LONG).show();
            }
        }

    }


    public void visiteatbus(View view) {

        String menu = menuu.getText().toString();
        String jumlah = jumlahh.getText().toString();


        if (menu.isEmpty() || jumlah.isEmpty()){
            Toast.makeText(this, "Harap diisi terlebih dahulu", Toast.LENGTH_LONG).show();
        }else {
            total = Integer.parseInt(jumlah.trim());
            bayar = total * hrgEatbus;

            Intent intent = new Intent(this,SecondActivity.class);

            intent.putExtra("Menu", menu);
            intent.putExtra("Jumlah",jumlah);
            intent.putExtra("Total",String.valueOf(bayar));

            startActivity(intent);

            if (bayar > duit){
                Toast.makeText(this,"Jangan disini makan malamnya, berat," +
                        " uang kamu tidak cukup",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_LONG).show();
            }
        }
    }
}
