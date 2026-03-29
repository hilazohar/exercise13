package com.example.exercise13;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Hila
 * @version 1.0
 * @since 2026-03-29
 * * The MainActivity class manages the background color of the layout based on
 * the selected RadioButton and the state of the Switch.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The main layout of the activity whose background color changes.
     */
    LinearLayout m;

    /**
     * The radio buttons for color selection.
     */
    RadioButton rB1, rB2, rB3, rB4;

    /**
     * The switch that toggles between immediate and button-click changes.
     */
    Switch sW;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m = findViewById(R.id.main);
        rB1 = findViewById(R.id.rB1);
        rB2 = findViewById(R.id.rB2);
        rB3 = findViewById(R.id.rB3);
        rB4 = findViewById(R.id.rB4);
        sW = findViewById(R.id.sW);


        m.setBackgroundColor(Color.GRAY);
    }


    /**
     * Handles the click event on any RadioButton.
     * Changes the background color immediately if the Switch is checked.
     *
     * @param view The RadioButton that was clicked.
     */
    public void onRadioButtonClicked(View view) {
        if (sW.isChecked() == true) {

            if (view.getId() == R.id.rB1) {
                m.setBackgroundColor(Color.RED);
            } else if (view.getId() == R.id.rB2) {
                m.setBackgroundColor(Color.BLUE);
            } else if (view.getId() == R.id.rB3) {
                m.setBackgroundColor(Color.GREEN);
            } else if (view.getId() == R.id.rB4) {
                m.setBackgroundColor(Color.YELLOW);
            }

        }

    }
}