package com.example.android.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView banyak;
    Button toast, plus, minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banyak = (TextView) findViewById(R.id.angka);
        toast = (Button) findViewById(R.id.toast);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
    }

    public void klik_toast(View view) {
        String jumlah = banyak.getText().toString();
        Toast.makeText(this, "Ini angka " + jumlah, Toast.LENGTH_SHORT).show();
    }

    public void ini_nambah(View view) {
        TextView banyak = (TextView) findViewById(R.id.angka);
        String tambah = banyak.getText().toString();
        Integer ditambah = Integer.parseInt(tambah);
        ditambah++;
        banyak.setText(ditambah.toString());
    }

    public void ini_kurang(View view) {
        TextView banyak = (TextView) findViewById(R.id.angka);
        String tambah = banyak.getText().toString();
        Integer ditambah = Integer.parseInt(tambah);
        if(ditambah != 0) {
            ditambah--;
        }
        banyak.setText(ditambah.toString());
    }
}
