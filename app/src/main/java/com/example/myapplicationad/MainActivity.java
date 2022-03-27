package com.example.myapplicationad;

import androidx.appcompat.app.AppCompatActivity;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private String str = "";
    private int visibility = View.INVISIBLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            visibility = savedInstanceState.getInt("key");
        }

        TextView textView1 = findViewById(R.id.textView);

        textView1.setVisibility(visibility);

      //  textView1.setText("\uD83C\uDDE8\uD83c\uDDF3");

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button13:
                str += "武";
                System.out.println(str);
                break;

            case R.id.button14:
                str += "汉";
                break;
            case R.id.button15:
                str += "加";
                break;
            case R.id.button16:
                str += "油";
                break;
        }

     //   System.out.println(str);
        if (str.length() >= 4) {
            final String substr = str.substring(str.length() - 4);
            if (substr.equals("武汉加油")) {
                TextView textView1 = findViewById(R.id.textView);
                visibility=View.VISIBLE;
                textView1.setVisibility(View.VISIBLE);
            }
        }
    }


    @Override
    protected  void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("key",visibility);

    }



}