package com.sachtleben.slidertest;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    SeekBar redSeekBar, greenSeekBar, blueSeekBar;
    TextView redResult, greenResult, blueResult;
    RelativeLayout layout;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redSeekBar = (SeekBar) findViewById(R.id.redSeekBar);
        greenSeekBar = (SeekBar) findViewById(R.id.greenSeekBar);
        blueSeekBar = (SeekBar) findViewById(R.id.blueSeekBar);

        redResult = (TextView) findViewById(R.id.redResultTextView);
        greenResult = (TextView) findViewById(R.id.greenResultTextView);
        blueResult = (TextView) findViewById(R.id.blueResultTextView);

        layout = (RelativeLayout) findViewById(R.id.colorLayout);

        resetButton = (Button) findViewById(R.id.resetButton);

        redSeekBar.setProgress(0);
        greenSeekBar.setProgress(0);
        blueSeekBar.setProgress(0);

        redResult.setText(String.valueOf(redSeekBar.getProgress()));
        greenResult.setText(String.valueOf(greenSeekBar.getProgress()));
        blueResult.setText(String.valueOf(blueSeekBar.getProgress()));

        setBackgroundColor();

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redSeekBar.setProgress(0);
                greenSeekBar.setProgress(0);
                blueSeekBar.setProgress(0);
            }
        });

        redSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                redResult.setText(String.valueOf(i));
                setBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        greenSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                greenResult.setText(String.valueOf(i));
                setBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blueSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blueResult.setText(String.valueOf(i));
                setBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void setBackgroundColor(){
        int r, g, b;

        r = redSeekBar.getProgress();
        g = greenSeekBar.getProgress();
        b = blueSeekBar.getProgress();

        layout.setBackgroundColor(Color.rgb(r, g, b));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    
}
