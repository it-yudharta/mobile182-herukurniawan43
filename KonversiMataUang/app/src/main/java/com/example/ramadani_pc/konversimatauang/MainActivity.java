package com.example.ramadani_pc.konversimatauang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText input_uang;
    Button rp_usd, rp_riyal, rp_yen, rp_euro, rp_yuan, rp_ringgit;
    TextView hasil_konversi;

    double angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_uang = (EditText) findViewById(R.id.uang_input);
        rp_usd = (Button) findViewById(R.id.rpusd);
        rp_riyal = (Button) findViewById(R.id.rpriyal);
        rp_yen = (Button) findViewById(R.id.rpyen);
        rp_euro = (Button) findViewById(R.id.rpeuro);
        rp_yuan = (Button) findViewById(R.id.rpyuan);
        rp_ringgit = (Button) findViewById(R.id.rpringgit);
        hasil_konversi = (TextView) findViewById(R.id.hasil_konversi);
    }

    public boolean cek(){
        if (input_uang.getText().toString().isEmpty()){
            Toast.makeText(this, "Silahkan masukan jumlah uang untuk dikonversi", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void toUSD(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 14150;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.US).format(hasil));
        Toast.makeText(this, "1 USD = Rp 14.150", Toast.LENGTH_SHORT).show();
    }

    public void toRIYAL(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 3773;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.ROOT).format(hasil));
        Toast.makeText(this, "1 Riyal = Rp 3.773", Toast.LENGTH_SHORT).show();
    }

    public void toYEN(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 131;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(hasil));
        Toast.makeText(this, "1 Yen = Rp 131", Toast.LENGTH_SHORT).show();
    }

    public void toEURO(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 16088;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(hasil));
        Toast.makeText(this, "1 Euro = Rp 16.088", Toast.LENGTH_SHORT).show();
    }

    public void toYUAN(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 2060;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.CHINA).format(hasil));
        Toast.makeText(this, "1 Yuan = Rp 2.060", Toast.LENGTH_SHORT).show();
    }

    public void toRINGGIT(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 3411;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.ROOT).format(hasil));
        Toast.makeText(this, "1 Ringgit = Rp 3.411", Toast.LENGTH_SHORT).show();
    }
}