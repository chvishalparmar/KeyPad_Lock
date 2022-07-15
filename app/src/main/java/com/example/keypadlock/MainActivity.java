package com.example.keypadlock;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
     private final Boolean Regester = true;
     private String pin[] = new String[4];
     private int currcount = 0;
     Button keyOne;
     Button keyTwo;
     Button keyThree;
     Button keyFour;
     Button keyFive;
     Button keySix;
     Button keySeven;
     Button keyEight;
     Button keyNine;
     Button keyZero;
     Button keyRemove;
     Button keyOk;
     TextView p0;
     TextView p1;
     TextView p2;
     TextView p3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(!Regester) {
            setContentView(R.layout.login);
        }
        else {
            setContentView(R.layout.activity_main);
            get_button_ids();
            Create_Key_Randomzatization();
            get_button_input();



        }

    }
    private void remove_tetView(){

        switch (currcount){
            case 0 :
                Toast.makeText(this, "Nothing to Remove", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                p0.setText("-");
                pin[0] = "";
                currcount = 0;
                break;

            case 2:
                p1.setText("-");
                pin[1] = "";
                currcount = 1;
                break;
            case 3:
                p2.setText("-");
                pin[2] = "";
                currcount = 2;
                break;
            case 4:
                p3.setText("-");
                pin[3] = "";
                currcount = 3;
                break;
        }


    }
    private void fill_textview(String No)
    {
        switch(currcount) {
            case 0:
                pin[0] = No;
                p0.setText(pin[0]);
                currcount++;
                break;
            case 1:
                pin[1] = No;
                p1.setText(pin[1]);
                currcount++;
                break;
            case 2:
                pin[2] = No;
                p2.setText(pin[2]);
                currcount++;
                break;
            case 3:
                pin[3] = No;
                p3.setText(pin[3]);
                currcount++;
                break;
            case -1:
                Toast.makeText(this, "Please Enter Pin", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "Pin Length Completed", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button1:
                fill_textview(keyOne.getText().toString());
                break;
            case R.id.button2:
                fill_textview(keyTwo.getText().toString());
                break;
            case R.id.button3:
                fill_textview(keyThree.getText().toString());
                break;
            case R.id.button4:
                fill_textview(keyFour.getText().toString());
                break;
            case R.id.button5:
                fill_textview(keyFive.getText().toString());
                break;
            case R.id.button6:
                fill_textview(keySix.getText().toString());
                break;
            case R.id.button7:
                fill_textview(keySeven.getText().toString());
                break;
            case R.id.button8:
                fill_textview(keyEight.getText().toString());
                break;
            case R.id.button9:
                fill_textview(keyNine.getText().toString());
                break;
            case R.id.button10:
                fill_textview(keyZero.getText().toString());
                break;
            case R.id.button12:
                remove_tetView();
                break;
            case R.id.button11:
                if(currcount <= 3)
                {
                    Toast.makeText(this, "Please Enter Pin", Toast.LENGTH_SHORT).show();
                }
                if(currcount == 4){
                    //create function authentication and pass StringArray
                    Toast.makeText(this, "Your pin : "+pin[0]+pin[1]+pin[2]+pin[3], Toast.LENGTH_SHORT).show();
                    return;
                }
                break;

        }
    }

    private void get_button_input(){
        keyOne.setOnClickListener(this);
        keyTwo.setOnClickListener(this);
        keyThree.setOnClickListener(this);
        keyFour.setOnClickListener(this);
        keyFive.setOnClickListener(this);
        keySix.setOnClickListener(this);
        keySeven.setOnClickListener(this);
        keyEight.setOnClickListener(this);
        keyNine.setOnClickListener(this);
        keyZero.setOnClickListener(this);
        keyRemove.setOnClickListener(this);
        keyOk.setOnClickListener(this);

    }
   private void get_button_ids()
   {
       keyOne = (Button) findViewById(R.id.button1);
       keyTwo = (Button) findViewById(R.id.button2);
       keyThree = (Button) findViewById(R.id.button3);
       keyFour = (Button) findViewById(R.id.button4);
       keyFive = (Button) findViewById(R.id.button5);
       keySix = (Button) findViewById(R.id.button6);
       keySeven = (Button) findViewById(R.id.button7);
       keyEight = (Button) findViewById(R.id.button8);
       keyNine = (Button) findViewById(R.id.button9);
       keyZero = (Button) findViewById(R.id.button10);
       keyRemove = (Button) findViewById(R.id.button12);
       keyOk = (Button) findViewById(R.id.button11);

       p0 = (TextView)findViewById(R.id.textView9);
       p1 = (TextView)findViewById(R.id.textView10);
       p2 = (TextView)findViewById(R.id.textView11);
       p3 = (TextView)findViewById(R.id.textView12);

   }

    private void Create_Key_Randomzatization(){
        String key[] = {"0","1","2","3","4","5","6","7","8","9"};
        List<String> keys = new ArrayList<String>(Arrays.asList(key));
        Collections.shuffle(keys);

        keyOne.setText(keys.get(0));
        keyTwo.setText(keys.get(1));
        keyThree.setText(keys.get(2));
        keyFour.setText(keys.get(3));
        keyFive.setText(keys.get(4));
        keySix.setText(keys.get(5));
        keySeven.setText(keys.get(6));
        keyEight.setText(keys.get(7));
        keyNine.setText(keys.get(8));
        keyZero.setText(keys.get(9));

    }



}