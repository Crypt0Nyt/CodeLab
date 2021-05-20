package com.streamliners.layoutcodelab;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.streamliners.layoutcodelab.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        b = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(b.getRoot());
        setupEventHandlers();
    }

    /**
     * To give color to the view accordingly
     * @param view view to be colored
     */
    private void setColor(View view) {
//      Checking ids and setting colors accordingly-------------------------------------------------
        if (view.getId() == b.boxOneText.getId()) {
            view.setBackgroundColor(Color.DKGRAY);
        }
//        Coloring Box Three to BLue color
//        Similarly for the following---------------------------------------------------

        else if (view.getId() == b.boxTwoText.getId()) {
            view.setBackgroundColor(Color.GRAY);
        }

        else if (view.getId() == b.boxThreeText.getId()) {
            view.setBackgroundColor(Color.BLUE);
        }

        else if (view.getId() == b.boxFourText.getId()) {
            view.setBackgroundColor(Color.MAGENTA);
        }

        else if (view.getId() == b.boxFiveText.getId()) {
            view.setBackgroundColor(Color.BLUE);
        }

//        Checking ids for three buttons and coloring box three, four, five accordingly
        else if (view.getId() == b.redButton.getId()) {
            b.boxThreeText.setBackgroundColor(getResources().getColor(R.color.my_red));
        }

        else if (view.getId() == b.yellowButton.getId()) {
            b.boxFourText.setBackgroundColor(getResources().getColor(R.color.my_yellow));
        }

        else if (view.getId() == b.greenButton.getId()) {
            b.boxFiveText.setBackgroundColor(getResources().getColor(R.color.my_green));
        }

        else {
            view.setBackgroundColor(Color.LTGRAY);
        }
    }

    /**
     *  Setting up event handlers for views
     */
    private void setupEventHandlers() {

//      Making the list of all the clickable views
        List<View> clickableViews = new ArrayList<>(
                Arrays.asList(b.boxOneText, b.boxTwoText, b.boxThreeText,
                        b.boxFourText, b.boxFiveText, b.constraintLayout,
                        b.redButton, b.yellowButton, b.greenButton)
        );

//        Setting all click listeners for the views
        for (View btn :
                clickableViews) {
            btn.setOnClickListener(v -> setColor(btn));
        }
    }
}