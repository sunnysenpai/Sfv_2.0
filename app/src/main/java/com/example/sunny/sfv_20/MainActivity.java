package com.example.sunny.sfv_20;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    int[] CharacterImages  = new int[] {R.drawable.cammy,R.drawable.chun,R.drawable.guile,R.drawable.karin,R.drawable.ken,R.drawable.nash};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        try {
            this.setWallpaper(BitmapFactory.decodeResource(this.getResources(), R.drawable.background));
        }
        catch(Exception ex)
        {
            android.util.Log.e("Sunny Svf", ex.getLocalizedMessage());

        }
            ScrollView SvMain = new ScrollView(this);

        LinearLayout llMain = new LinearLayout(this);

        llMain.setOrientation(LinearLayout.VERTICAL);

        int j = 0;

        for (int i: CharacterImages)
        {
            Bitmap bmp = android.graphics.BitmapFactory.decodeResource(this.getResources(),i);

            ImageView IvMain = new ImageView(this);

            IvMain.setImageBitmap(bmp);
            final int f = j;
            IvMain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                    intent.putExtra("key",f);
                    MainActivity.this.startActivity(intent);
                }
            });

            llMain.addView(IvMain);
            j++;
        }



























        SvMain.addView(llMain);

        setContentView(SvMain);



    }
}
