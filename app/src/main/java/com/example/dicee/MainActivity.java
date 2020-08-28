package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonRoll = findViewById(R.id.button_roll);
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);
        final int[] diceArray = {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice6};


        buttonRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);

                rightDice.setImageResource((diceArray[number]));

                Log.d("Dicee", "Button has been pressed!");
                Log.d("Dicee","The random number is :" + number);
            }
        });

    }
}