package com.example.keypadlock;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Create_Key_Randomzatization();


    }

    private void Create_Key_Randomzatization(){
        String key[] = {"0","1","2","3","4","5","6","7","8","9"};
        List<String> keys = new ArrayList<String>(Arrays.asList(key));
        Collections.shuffle(keys);

        Button keyOne = (Button) findViewById(R.id.button1);
        keyOne.setText(keys.get(0));
        Button keyTwo = (Button) findViewById(R.id.button2);
        keyTwo.setText(keys.get(1));
        Button keyThree = (Button) findViewById(R.id.button3);
        keyThree.setText(keys.get(2));
        Button keyFour = (Button) findViewById(R.id.button4);
        keyFour.setText(keys.get(3));
        Button keyFive = (Button) findViewById(R.id.button5);
        keyFive.setText(keys.get(4));
        Button keySix = (Button) findViewById(R.id.button6);
        keySix.setText(keys.get(5));
        Button keySeven = (Button) findViewById(R.id.button7);
        keySeven.setText(keys.get(6));
        Button keyEight = (Button) findViewById(R.id.button8);
        keyEight.setText(keys.get(7));
        Button keyNine = (Button) findViewById(R.id.button9);
        keyNine.setText(keys.get(8));
        Button keyZero = (Button) findViewById(R.id.button10);
        keyZero.setText(keys.get(9));

    }



}