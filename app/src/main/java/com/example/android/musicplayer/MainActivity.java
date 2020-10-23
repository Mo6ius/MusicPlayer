package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the baroque category
        TextView baroque = (TextView) findViewById(R.id.baroque);

        // Set a click listener on that View
        baroque.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the baroque category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BaroqueActivity}
                Intent baroqueIntent = new Intent(MainActivity.this, BaroqueActivity.class);

                // Start the new activity
                startActivity(baroqueIntent);
            }
        });

        // Find the View that shows the classical category
        TextView classical = (TextView) findViewById(R.id.classical);

        // Set a click listener on that View
        classical.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(classicalIntent);
            }
        });

        // Find the View that shows the romantic category
        TextView romantic = (TextView) findViewById(R.id.romantic);

        // Set a click listener on that View
        romantic.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the romantic category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RomanticActivity}
                Intent romanticIntent = new Intent(MainActivity.this, RomanticActivity.class);

                // Start the new activity
                startActivity(romanticIntent);
            }
        });

        // Find the View that shows the modern category
        TextView modern = (TextView) findViewById(R.id.modern);

        // Set a click listener on that View
        modern.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the modern category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ModernActivity}
                Intent modernIntent = new Intent(MainActivity.this, ModernActivity.class);

                // Start the new activity
                startActivity(modernIntent);
            }
        });
    }
}