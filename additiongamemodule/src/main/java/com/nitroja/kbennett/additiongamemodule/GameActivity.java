package com.nitroja.kbennett.additiongamemodule;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    int bmax = 100, bmin = 1, buttonNum1 = 0, total = 0;

    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button10 = (Button) findViewById(R.id.button10);
        final Button button11 = (Button) findViewById(R.id.button11);
        final Button button12 = (Button) findViewById(R.id.button12);
        final Button button13 = (Button) findViewById(R.id.button13);
        final Button button14 = (Button) findViewById(R.id.button14);
        final Button button15 = (Button) findViewById(R.id.button15);
        final Button button16 = (Button) findViewById(R.id.button16);
        final Button button17 = (Button) findViewById(R.id.button17);
        final Button button18 = (Button) findViewById(R.id.button18);
        final Button button19 = (Button) findViewById(R.id.button19);
        final Button button20 = (Button) findViewById(R.id.button20);
        final Button buttonwin = (Button) findViewById(R.id.buttonwin);

       buttonNum1 = rand.nextInt((bmax - (bmin + 1)) + 1) + (bmin + 1);

        button10.setEnabled(false);
        button11.setEnabled(false);

        button10.setText(String.valueOf(buttonNum1));

        final Handler handler = new Handler();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 1;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                }, 1200);

                }

            }

        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 2;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 3;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 4;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 5;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 6;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 7;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 8;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 9;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button12.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 10;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button13.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 11;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button14.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 12;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button15.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 13;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button16.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 14;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button17.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 15;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button18.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 16;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button19.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 17;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }

        });


        button20.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                total = total + 18;

                button11.setText(String.valueOf(total));

                if (total == buttonNum1) {

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(180, 11, 252));

                            buttonwin.setTextColor(Color.rgb(57, 255, 20));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("YOU GOT IT!");

                        }

                    }, 1200);

                }

                if (total > buttonNum1){

                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);

                    handler.postDelayed(new Runnable() {
                        public void run() {

                            buttonwin.setVisibility(View.VISIBLE);

                            buttonwin.setBackgroundColor(Color.rgb(190, 190, 190));

                            buttonwin.setTextColor(Color.rgb(0, 0, 0));

                            //buttonwin.setTextSize(TypedValue.COMPLEX_UNIT_SP, 33);

                            buttonwin.setText("NUMBER TOO HIGH!");

                        }

                    }, 1200);

                }

            }


        });


    }

}
