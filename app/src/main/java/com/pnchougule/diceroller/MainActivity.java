package com.pnchougule.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView dice;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice=findViewById(R.id.imgVw_dice);
        random = new Random();

        dice.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
             roll();
         }
        });


    }

    public void roll()
    {

        int num = random.nextInt(6)+1; // store number

        switch (num){
            case 1:  dice.setImageResource(R.drawable.dice1);
                break;
            case 2: dice.setImageResource(R.drawable.dice2);
                break;
            case 3:  dice.setImageResource(R.drawable.dice3);
                break;
            case 4:  dice.setImageResource(R.drawable.dice4);
                break;
            case 5:  dice.setImageResource(R.drawable.dice5);
                break;
            case 6:  dice.setImageResource(R.drawable.dice6);
                break;
        }


    }




}