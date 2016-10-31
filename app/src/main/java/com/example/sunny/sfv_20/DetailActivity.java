package com.example.sunny.sfv_20;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    int[] CharacterMoves  = new int[] {R.drawable.cammy_move,R.drawable.chun_move,R.drawable.guile_move,R.drawable.karin_move,R.drawable.ken_move,R.drawable.nash_move};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        final ImageView IvDetail = (ImageView)this.findViewById(R.id.iv1);
        Intent in = this.getIntent();
        int key = in.getIntExtra("key",0);
        Bitmap bmp = BitmapFactory.decodeResource(this.getResources(),CharacterMoves[key]);
        IvDetail.setImageBitmap(bmp);
    }

}
