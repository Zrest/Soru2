package com.example.sehirtanitmakonya42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayAktiviteAlihan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detay_konya);

        setContentView(R.layout.detay_konya);
        Intent Intent=getIntent();
        Eser Eser=(Eser)Intent.getSerializableExtra("eser");
        setTitle(Eser.eser_ad);

        ImageView Detay_resim=(ImageView)findViewById(R.id.D_resim);
        Detay_resim.setImageResource(Eser.eser_resim);

        TextView Detay_ad=(TextView) findViewById(R.id.D_ad);
        Detay_ad.setText(Eser.eser_ad);

        TextView Detay_tarih=(TextView)findViewById(R.id.D_tarih);
        Detay_tarih.setText(Eser.getEser_tarih());

        TextView Detay_aciklama=(TextView)findViewById(R.id.D_aciklama);
        Detay_aciklama.setText(Eser.eser_acıklama);
    }
}
