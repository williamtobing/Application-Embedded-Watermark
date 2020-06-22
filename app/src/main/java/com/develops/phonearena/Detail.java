package com.develops.phonearena;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    private static final String TAG = "Detail";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "details");

        getIntents();
    }

    private void getIntents() {
        Log.d(TAG, "getIntents : checking for intents ");
        if (getIntent().hasExtra("image")&& getIntent().hasExtra("merk")&& getIntent().hasExtra("spek")) {
            Log.d(TAG, "getIntents : found intents");

            String image = getIntent().getStringExtra("image");
            String merk = getIntent().getStringExtra("merk");
            String spek = getIntent().getStringExtra("spek");

            setData(image, merk, spek);
        }
    }

    private void setData(String image, String merk, String spek) {
        Log.d(TAG, "Set Data");
        TextView text1 = findViewById(R.id.ly_merk);
        text1.setText(merk);

        TextView text2 = findViewById(R.id.ly_spek);
        text2.setText(spek);

        ImageView img = findViewById(R.id.ly_image);
        Glide.with(this)
                .asBitmap()
                .load(image)
                .into(img);
    }
}
