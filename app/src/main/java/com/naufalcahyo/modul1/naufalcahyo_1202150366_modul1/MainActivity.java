package com.naufalcahyo.modul1.naufalcahyo_1202150366_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText menuu,jumlahh;
    private TextView tempatt;
    private int total,bayar;
    private int duit = 65500;

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

        total = Integer.parseInt(jumlah.trim());
        bayar = total * 30000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);
        bundle.putString("Jumlah",jumlah);
        bundle.putString("Total",String.valueOf(bayar));
        bundle.putString("Restaurant","Apnormal");

        Intent intent = new Intent(this,SecondActivity.class);

        intent.putExtras(bundle);

        startActivity(intent);

        if (bayar < duit){
            Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Jangan disini makan malamnya, berat," +
                    " uang kamu tidak cukup",Toast.LENGTH_LONG).show();
        }
    }


    public void visiteatbus(View view) {


        String menu = menuu.getText().toString();
        String jumlah = jumlahh.getText().toString();

        total = Integer.parseInt(jumlah.trim());
        bayar = total * 50000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);
        bundle.putString("Jumlah",jumlah);
        bundle.putString("Total",String.valueOf(bayar));
        bundle.putString("Restaurant","Eatbus");

        Intent intent = new Intent(this,SecondActivity.class);

        intent.putExtras(bundle);

        startActivity(intent);

        if (bayar > duit){
            Toast.makeText(this,"Jangan disini makan malamnya, berat," +
                    " uang kamu tidak cukup",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_LONG).show();
        }
    }


}
