package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.rbSpi);
        radioButton2 = findViewById(R.id.rbIron);
        radioButton3 = findViewById(R.id.rbBat);
        radioButton4 = findViewById(R.id.rbSup);
        imageView = findViewById(R.id.ivShowimg);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
        radioButton4.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.rbSpi :
                imageView.setImageResource(R.drawable.pic);
                break;
            case R.id.rbIron :
                imageView.setImageResource(R.drawable.ironman);
                break;
            case R.id.rbBat:
                imageView.setImageResource(R.drawable.batman);
                break;
            case R.id.rbSup :
                imageView.setImageResource(R.drawable.superman);
                break;


        }
    }
}
