package com.example.calcjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    String inpexp1="", inpexp2="", outpexp="";
    EditText inp, outp;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bclear, badd, bsub, bmult, bdiv, bplusminus, bpercent, bbkspc, bequal, bpower, bdot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inp.setClickable(false);
        //outp.setClickable(false);
        inp=findViewById(R.id.EditText);
        outp=findViewById(R.id.editText2);

        bequal=findViewById(R.id.equalBTN);
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outp.setText(inpexp1);
            }
        });

        b1=findViewById(R.id.B1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="1";
                inp.setText(inpexp1);
            }
        });

        b2=findViewById(R.id.B2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="2";
                inp.setText(inpexp1);
            }
        });

        b3=findViewById(R.id.B3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="3";
                inp.setText(inpexp1);
            }
        });

        b4=findViewById(R.id.B4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="4";
                inp.setText(inpexp1);
            }
        });

        b5=findViewById(R.id.B5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="5";
                inp.setText(inpexp1);
            }
        });

        b6=findViewById(R.id.B6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="6";
                inp.setText(inpexp1);
            }
        });

        b7=findViewById(R.id.B7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="7";
                inp.setText(inpexp1);
            }
        });

        b8=findViewById(R.id.B8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="8";
                inp.setText(inpexp1);
            }
        });

        b9=findViewById(R.id.B9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="9";
                inp.setText(inpexp1);
            }
        });

        b0=findViewById(R.id.B0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1+="0";
                inp.setText(inpexp1);
            }
        });

        bclear=findViewById(R.id.clearBTN);
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1="";
                outpexp="";
                inp.setText(inpexp1);
                outp.setText(outpexp);
            }
        });

        bbkspc=findViewById(R.id.bckspcBTN);
        bbkspc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inpexp1=inpexp1.substring(0, inpexp1.length() - 1);
                inp.setText(inpexp1);
            }
        });

    }


    public void percent(){

    }

    public void plusminus(){

    }

    public void multiplication(){

    }

    public void division(){

    }

    public void subtraction(){

    }

    public void addition(){

    }

}